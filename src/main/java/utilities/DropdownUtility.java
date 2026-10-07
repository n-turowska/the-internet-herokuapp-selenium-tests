package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownUtility extends Utility {

    private static Select findDropdown(By locator) {
        return new Select(driver.findElement(locator));
    }

    public static void selectByVisibleText(By locator, String text) {
        findDropdown(locator).selectByVisibleText(text);
    }

    public static String getSelectedOption(By locator) {
        return findDropdown(locator).getFirstSelectedOption().getText();
    }

}

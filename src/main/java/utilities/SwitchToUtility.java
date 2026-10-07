package utilities;

import org.openqa.selenium.WebDriver;

public class SwitchToUtility extends Utility {

    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    public static String getAlertText() {
        return switchTo().alert().getText();
    }

    public static void acceptAlert() {
        switchTo().alert().accept();
    }

    public static void switchToDefaultContent() {
        switchTo().defaultContent();
    }

    public static void switchToFrameString(String value) {
        switchTo().frame(value);
    }

    public static void switchToWindow(String handle) {
        switchTo().window(handle);
    }


}

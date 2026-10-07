package com.herokuapp.theinternet.pages.checkboxes;

import com.herokuapp.theinternet.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavaScriptUtility.clickJS;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class CheckboxesPage extends HomePage {

    private By firstCheckbox = By.xpath("//input[@type='checkbox'][1]");
    private By secondCheckbox = By.xpath("//input[@type='checkbox'][2]");

    public void clickFirstCheckbox() {
        if (!find(firstCheckbox).isSelected()) {
            //delay(1000);
            scrollToElementJS(firstCheckbox);
            click(firstCheckbox);
        }
    }

    public void clickSecondCheckbox() {
        if (!find(secondCheckbox).isSelected()) {
            click(secondCheckbox);
        }
    }

    public void unclickSecondCheckbox() {
        if (find(secondCheckbox).isSelected()) {
            click(secondCheckbox);
        }
    }

    public boolean isFirstCheckboxSelected() {
        return find(firstCheckbox).isSelected();
    }

    public boolean isSecondCheckboxSelected() {
        return find(secondCheckbox).isSelected();
    }

}

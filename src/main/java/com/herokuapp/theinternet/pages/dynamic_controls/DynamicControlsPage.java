package com.herokuapp.theinternet.pages.dynamic_controls;

import com.herokuapp.theinternet.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.WaitUtility.explicitWaitUntilVisible;

public class DynamicControlsPage extends HomePage {

    private By removeButton = By.xpath("//button[text()='Remove']");
    private By addButton = By.xpath("//button[text()='Add']");
    private By message = By.id("message");

    public void clickRemoveButton() {
        explicitWaitUntilVisible(10, removeButton);
        click(removeButton);
    }

    public void clickAddButton() {
        explicitWaitUntilVisible(10, addButton);
        click(addButton);
    }

    public String getMessage() {
        explicitWaitUntilVisible(10, message);
        return find(message).getText();
    }

}

package com.herokuapp.theinternet.pages.alerts;

import com.herokuapp.theinternet.pages.HomePage;
import org.openqa.selenium.By;


public class JSAlertsPage extends HomePage {

    private By jsAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By jsConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By resultMessage = By.id("result");

    public void clickJSAlertButton() {
        click(jsAlertButton);
    }

    public void clickJSConfirmButton() {
        click(jsConfirmButton);
    }

    public String getResultMessage() {
        return find(resultMessage).getText();
    }

}

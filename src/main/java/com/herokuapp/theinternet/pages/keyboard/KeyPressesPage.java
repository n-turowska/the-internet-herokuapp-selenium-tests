package com.herokuapp.theinternet.pages.keyboard;

import com.herokuapp.theinternet.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static utilities.ActionsUtilities.sendKeys;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class KeyPressesPage extends HomePage {

    private By result = By.id("result");
    private By target = By.id("target");

    public void enterWord(String word) {
        sendKeys(find(target), Keys.chord(word));
    }

    public String getTargetText(){
        return find(target).getAttribute("value");
    }

    public String getResultText() {
        return find(result).getText();
    }

    public void pressTab() {
        sendKeys(find(target), Keys.TAB);
    }

}

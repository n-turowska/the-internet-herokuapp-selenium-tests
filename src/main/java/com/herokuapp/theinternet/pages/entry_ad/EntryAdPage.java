package com.herokuapp.theinternet.pages.entry_ad;

import com.herokuapp.theinternet.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.WaitUtility.explicitWaitUntilVisible;

public class EntryAdPage extends HomePage {

    private By modalTitle = By.className("modal-title");
    private By close = By.xpath("//p[text()='Close']");

    public String getModalTitle() {
        explicitWaitUntilVisible(3, modalTitle);
        return find(modalTitle).getText();
    }

    public void closeModal() {
        click(close);
    }

}

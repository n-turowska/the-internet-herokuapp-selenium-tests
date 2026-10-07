package com.herokuapp.theinternet.pages.frames;

import org.openqa.selenium.By;

import static utilities.SwitchToUtility.switchToFrameString;
import static utilities.WaitUtility.explicitWaitUntilVisible;

public class IFramePage extends FramesPage {

    private By closeAlertButton = By.xpath("//div[@role='alert']//button[@type='button']");
    private String iFrame = "mce_0_ifr";
    private By frameText = By.id("tinymce");

    public void closeAlert() {
        explicitWaitUntilVisible(3, closeAlertButton);
        click(closeAlertButton);
    }

    public String getTextInFrame() {
        switchToFrameString(iFrame);
        return find(frameText).getText();
    }

}

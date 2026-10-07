package com.herokuapp.theinternet.pages.frames;

import com.herokuapp.theinternet.pages.HomePage;
import org.openqa.selenium.By;

public class FramesPage extends HomePage {

    private By iframeLink = By.xpath("//a[text()='iFrame']");

    public IFramePage goToIFrame() {
        click(iframeLink);
        return new IFramePage();
    }

}

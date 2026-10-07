package com.herokuapp.theinternet.test.windows;

import com.herokuapp.theinternet.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.GetUtility.getURL;

public class WindowsTest extends BaseTest {

    @Test
    public void testNewWindowURL(){
        var windowsPage = homePage.goToMultipleWindows();
        windowsPage.clickNewWnidowsLink();
        windowsPage.switchToNewWindow();
        String actualURL = getURL();
        String expectedURL = "https://the-internet.herokuapp.com/windows/new";
        Assert.assertEquals(actualURL, expectedURL,
                "\n Actual and expected URL do not match \n");
    }

}

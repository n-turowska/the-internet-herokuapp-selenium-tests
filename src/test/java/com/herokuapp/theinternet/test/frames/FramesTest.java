package com.herokuapp.theinternet.test.frames;

import com.herokuapp.theinternet.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FramesTest extends BaseTest {

    @Test
    public void testIFrame() {
        var iframePage = homePage.goToFrames().goToIFrame();
        iframePage.closeAlert();
        String actualText = iframePage.getTextInFrame();
        String expectedText = "Your content goes here.";
        Assert.assertEquals(actualText, expectedText,
                "\n Actual and expected text do not match \n");
    }
}

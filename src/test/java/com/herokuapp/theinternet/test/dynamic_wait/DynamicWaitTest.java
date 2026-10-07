package com.herokuapp.theinternet.test.dynamic_wait;

import com.herokuapp.theinternet.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicWaitTest extends BaseTest {

    @Test
    public void testDynamicControls() {
        var dynamicControlsPage = homePage.goToDynamicControls();
        dynamicControlsPage.clickRemoveButton();
        dynamicControlsPage.clickAddButton();
        dynamicControlsPage.clickRemoveButton();
        String expectedMessage = "It's gone!";
        String actualMessage = dynamicControlsPage.getMessage();
        Assert.assertEquals(actualMessage, expectedMessage,
                "\n Actual and expected message do not match \n");
    }

}

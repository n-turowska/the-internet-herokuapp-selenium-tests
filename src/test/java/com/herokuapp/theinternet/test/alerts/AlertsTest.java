package com.herokuapp.theinternet.test.alerts;

import com.herokuapp.theinternet.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.SwitchToUtility.*;

public class AlertsTest extends BaseTest {

    @Test
    public void testJSAlert() {
        var jsalertsPage = homePage.goToJSAlerts();
        jsalertsPage.clickJSAlertButton();
        String expectedAlertText = "I am a JS Alert";
        Assert.assertEquals(getAlertText(), expectedAlertText,
                "\n Actual and expected alert text do not match \n");
        acceptAlert();
        switchToDefaultContent();
        String actualResult = jsalertsPage.getResultMessage();
        String expectedResult = "You successfully clicked an alert";
        Assert.assertEquals(actualResult, expectedResult,
                "\n Actual and expected result do not match \n");
    }

    @Test
    public void testJSConfirm() {
        var jsalertsPage = homePage.goToJSAlerts();
        jsalertsPage.clickJSConfirmButton();
        String expectedAlertText = "I am a JS Confirm";
        Assert.assertEquals(getAlertText(), expectedAlertText,
                "\n Actual and expected alert text do not match \n");
        acceptAlert();
        String expectedResult = "You clicked: Ok";
        String actualResult = jsalertsPage.getResultMessage();
        Assert.assertEquals(actualResult, expectedResult,
                "\n Actual and expected result do not match \n");
    }

}

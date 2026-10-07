package com.herokuapp.theinternet.test.login;

import com.herokuapp.theinternet.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        var loginPage = homePage.goToLogin();
        var securePage = loginPage.logIntoApplication("tomsmith", "SuperSecretPassword!");
        String actualMessage = securePage.getFlashMessage();
        Assert.assertTrue(actualMessage.contains("You logged into a secure area!"),
                "\n Message do not contain 'You logged into a secure area!' \n");
    }

    @Test
    public void testInvalidUsername() {
        var loginPage = homePage.goToLogin();
        loginPage.logIntoApplication("someone", "SuperSecretPassword!");
        String actualMessage = loginPage.getFlashMessage();
        Assert.assertTrue(actualMessage.contains("Your username is invalid!"),
                "\n Message do not contain 'Your username is invalid!' \n");
    }

    @Test
    public void testInvalidPassword() {
        var loginPage = homePage.goToLogin();
        loginPage.logIntoApplication("tomsmith", "password1234");
        String actualMessage = loginPage.getFlashMessage();
        Assert.assertTrue(actualMessage.contains("Your password is invalid!"),
                "\n Message do not contain 'Your password is invalid!' \n");
    }

}

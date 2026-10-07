package com.herokuapp.theinternet.pages.login;

import com.herokuapp.theinternet.pages.HomePage;
import org.openqa.selenium.By;

public class LoginPage extends HomePage {

    private By usernameField = By.xpath("//input[@name='username']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By loginButton = By.xpath("//button[@type='submit']");
    private By flashMessage = By.id("flash");

    public void setUsername(String username) {
        set(usernameField, username);
    }

    public void setPassword(String password) {
        set(passwordField, password);
    }

    public SecurePage clickLoginButton() {
        click(loginButton);
        return new SecurePage();
    }

    public String getFlashMessage() {
        return find(flashMessage).getText();
    }

    public SecurePage logIntoApplication(String username, String password) {
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

}

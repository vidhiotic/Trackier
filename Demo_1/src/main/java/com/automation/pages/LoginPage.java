package com.automation.pages;

import org.openqa.selenium.WebDriver;
import com.automation.locators.LoginLocators;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterUsername(String username) 
    {
        driver.findElement(LoginLocators.USERNAME_FIELD).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(LoginLocators.PASSWORD_FIELD).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(LoginLocators.LOGIN_BUTTON).click();
    }

    public String getErrorMessage() {
        return driver.findElement(LoginLocators.ERROR_MESSAGE).getText();
    }
}
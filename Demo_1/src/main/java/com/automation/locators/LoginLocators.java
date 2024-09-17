package com.automation.locators;

import org.openqa.selenium.By;

public class LoginLocators 
{
    public static final By USERNAME_FIELD = By.id("user-name");
    public static final By PASSWORD_FIELD = By.id("password");
    public static final By LOGIN_BUTTON = By.id("login-button");
    public static final By ERROR_MESSAGE = By.xpath("//div[@class='error-message-container error']");
}
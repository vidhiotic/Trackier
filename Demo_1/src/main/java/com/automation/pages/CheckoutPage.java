package com.automation.pages;

import com.automation.locators.CheckoutPageLocators;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillCheckoutInformation(String firstName, String lastName, String postalCode) {
        driver.findElement(CheckoutPageLocators.FIRST_NAME_FIELD).sendKeys(firstName);
        driver.findElement(CheckoutPageLocators.LAST_NAME_FIELD).sendKeys(lastName);
        driver.findElement(CheckoutPageLocators.POSTAL_CODE_FIELD).sendKeys(postalCode);
    }

    public void clickContinue() {
        driver.findElement(CheckoutPageLocators.CONTINUE_BUTTON).click();
    }

    public void clickFinish() {
        driver.findElement(CheckoutPageLocators.FINISH_BUTTON).click();
    }

    public String getConfirmationText() {
        return driver.findElement(CheckoutPageLocators.CONFIRMATION_TEXT).getText();
    }
}
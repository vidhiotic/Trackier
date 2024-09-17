package com.automation.pages;

import com.automation.locators.CartPageLocators;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void proceedToCheckout() {
        driver.findElement(CartPageLocators.CHECKOUT_BUTTON).click();
    }
}
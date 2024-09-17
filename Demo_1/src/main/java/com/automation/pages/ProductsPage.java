package com.automation.pages;
import com.automation.locators.ProductsPageLocators;
import org.openqa.selenium.WebDriver;

public class ProductsPage
{
    private WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addFirstProductToCart() {
        driver.findElement(ProductsPageLocators.FIRST_PRODUCT_ADD_TO_CART_BUTTON).click();
    }

    public void navigateToCart() {
        driver.findElement(ProductsPageLocators.CART_ICON).click();
    }
}
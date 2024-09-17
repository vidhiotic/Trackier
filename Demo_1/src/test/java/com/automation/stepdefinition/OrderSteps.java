package com.automation.stepdefinition;


import com.automation.pages.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;

public class OrderSteps {

    private WebDriver driver;
    private ProductsPage productsPage;
    private CartPage cartPage;
    private CheckoutPage checkoutPage;
    private Loginstep loginSteps = new Loginstep();


    @When("I log in with valid credentials")
    public void iLogInWithValidCredentials() 
    {
        loginSteps.iOpenTheSauceDemoLoginPage();
        loginSteps.iEnterValidUsernameAndPassword("standard_user", "secret_sauce");
        loginSteps.iClickOnTheLoginButton();

        driver = loginSteps.getDriver();
    }

    @When("I add the first product to the cart")
    public void iAddTheFirstProductToTheCart() {
        productsPage = new ProductsPage(driver);
        productsPage.addFirstProductToCart();
    }

    @When("I navigate to the cart and proceed to checkout")
    public void iNavigateToTheCartAndProceedToCheckout() {
        productsPage.navigateToCart();
        cartPage = new CartPage(driver);
        cartPage.proceedToCheckout();
    }

	@And("I provide my information Firstname {string} lastname {string} pincode {string}")
	public void i_provide_my_information(String firstName, String lastName, String postalCode) 
	{
		 checkoutPage = new CheckoutPage(driver);
	     checkoutPage.fillCheckoutInformation(firstName, lastName, postalCode);
	     checkoutPage.clickContinue();
	}

    
    @And("I finish the checkout process")
    public void iFinishTheCheckoutProcess() {
        checkoutPage.clickFinish();
    }

    @Then("I should see the order confirmation message {string}")
    public void iShouldSeeTheOrderConfirmationMessage(String expectedMessage) {
        String actualMessage = checkoutPage.getConfirmationText();
        assertEquals(actualMessage, expectedMessage);

        if (driver != null) {
            driver.quit();
        }
    }
}
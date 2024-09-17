package com.automation.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import com.automation.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertTrue;

public class Loginstep {

    private WebDriver driver;
    private LoginPage loginPage;

    @Given("I open the SauceDemo login page")
    public void iOpenTheSauceDemoLoginPage()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @When("I enter valid username {string} and password {string}")
    public void iEnterValidUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("I click on the login button")
    public void iClickOnTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should be navigated to the products page")
    public void iShouldBeNavigatedToTheProductsPage() {
        assertTrue(driver.getCurrentUrl().contains("inventory.html"));
        driver.quit();
    }

    @When("I enter invalid username {string} and password {string}")
    public void iEnterInvalidUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() {
        assertTrue(loginPage.getErrorMessage().contains("Epic sadface: Sorry, this user has been locked out."));
        driver.quit();
    }
    public WebDriver getDriver() {
        return driver;
    }
}
Feature: Login to SauceDemo

  Scenario: Successful login with valid credentials
    Given I open the SauceDemo login page
    When I enter valid username "standard_user" and password "secret_sauce"
    And I click on the login button
    Then I should be navigated to the products page

  Scenario: Failed login with invalid credentials
    Given I open the SauceDemo login page
    When I enter invalid username "locked_out_user" and password "secret_sauce"
    And I click on the login button
    Then I should see an error message
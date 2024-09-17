Feature: Place an order and checkout

	  Scenario: Successfully place an order and checkout
	    When I log in with valid credentials
	    When I add the first product to the cart
	    And I navigate to the cart and proceed to checkout
	    And I provide my information Firstname "VIDHI" lastname "SAINI" pincode "247001"
	    And I finish the checkout process
	    Then I should see the order confirmation message "Thank you for your order!"
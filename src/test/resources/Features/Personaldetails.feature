Feature: Tests for automationatpractice website
@test
  Scenario: Order T-Shirt and Verify in Order History
    Given User navigate into autopractise website
    When user click on the Tshirt link
    Then click on the proceed to cart
    Then click on the proceed to checkout
    Then click on the procced to checkout in summary page
    And User enter a cfredentials
         | Sashaooo@gmail.com | Sashaooo |
    Then User click on sign in button
    When click on the procced to checkout in address summary page
    When user clicks on the terms and conditions in shipping page
    When click on the procced to checkout in shipping page
    Then user clicks on the pay by bank
    Then User clicks on the confirm order
    Then user clicks the back to order page

   Scenario: As a user updated the personal account information
    Given User navigate into autopractise website
    When User select signin link
    And User enter a cfredentials
        | Sashaooo@gmail.com | Sashaooo |
    Then User click on sign in button
    Then click on the my personal information
    Then update the first name
    Then enter the password
    Then click on the Save button

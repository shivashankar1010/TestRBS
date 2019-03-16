
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

##    When User select signin link

  @test1
   Scenario: As a user updated the personal account information
    Given User navigate into autopractise website
#    Then click on the my personal information
#    Then click on the first name
#    Then update the first name
#    Then click on the Save button
#    Then enter the password
#    Then click on the Save button
#    Then verify < Your personal information has been successfully updated.> dispalyed to the user
#

#
#  Scenario: As a user wants to do the payment and see the order histroy
#    Then user click on the Tshirt link
  #  Then click on the add to cart
   # Then click on the proceed to checkout
#    Then click on the check box for the Terms of service
#    Then click on the proceed to checkout again
#    Then click on the pay by bank wire
#    Then click on the I confirm the order
#    Then click on the view my customer account information
#    Then click on the order histroy and details
#    Then verify the <"Here are the orders you've placed since your account was created"> is dispalyed to the user


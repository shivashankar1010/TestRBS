Feature: Tests for automationatpractice website
  @test
  Scenario: Login Test
    Given User navigate into autopractise website
   When User select signin link
   Then  user enters valid credentials
  Then  validate user is successfully logged in



  @test
  Scenario: Find the most expensive dress and add it to the cart
   When user click on the dress link
    Then click on the proceed to cart
   Then click on the proceed to checkout


@test
Scenario: Log out and back in again, ensuring the dress is still in the cart
  When user click logout link
  When User select signin link
  Then  user enters valid credentials
  Then  validate user is successfully logged in
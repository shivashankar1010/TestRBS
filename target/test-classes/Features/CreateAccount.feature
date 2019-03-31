Feature: Tests for automationatpractice website
  @test
  Scenario: Creating a new user account
    Given User navigate into autopractise website
    When User select signin link
    Then user enters the new email id and clicks create account link
    And User enter person account details

$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Automationpractice.feature");
formatter.feature({
  "line": 1,
  "name": "Tests for automationatpractice website",
  "description": "",
  "id": "tests-for-automationatpractice-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login Test",
  "description": "",
  "id": "tests-for-automationatpractice-website;login-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User navigate into autopractise website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User select signin link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters valid credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "validate user is successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefs.user_navigate_into_autopractise_website()"
});
formatter.result({
  "duration": 7904965975,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDef.user_select_signin_link()"
});
formatter.result({
  "duration": 2433562099,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDef.user_enters_valid_credentials()"
});
formatter.result({
  "duration": 2685358574,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefs.validate_user_is_successfully_logged_in()"
});
formatter.result({
  "duration": 37271163,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Find the most expensive dress and add it to the cart",
  "description": "",
  "id": "tests-for-automationatpractice-website;find-the-most-expensive-dress-and-add-it-to-the-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user click on the dress link",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "click on the proceed to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "click on the proceed to checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefs.user_click_on_the_dress_link()"
});
formatter.result({
  "duration": 4882360049,
  "status": "passed"
});
formatter.match({
  "location": "ProductPageStepDefs.click_on_the_proceed_to_cart()"
});
formatter.result({
  "duration": 13311503729,
  "status": "passed"
});
formatter.match({
  "location": "ProductPageStepDefs.click_on_the_proceed_to_checkout()"
});
formatter.result({
  "duration": 12011096675,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Log out and back in again, ensuring the dress is still in the cart",
  "description": "",
  "id": "tests-for-automationatpractice-website;log-out-and-back-in-again,-ensuring-the-dress-is-still-in-the-cart",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user click logout link",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User select signin link",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user enters valid credentials",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "validate user is successfully logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepDefs.user_click_logout_link()"
});
formatter.result({
  "duration": 1943231624,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDef.user_select_signin_link()"
});
formatter.result({
  "duration": 2027866050,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDef.user_enters_valid_credentials()"
});
formatter.result({
  "duration": 1740024915,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefs.validate_user_is_successfully_logged_in()"
});
formatter.result({
  "duration": 30139193,
  "status": "passed"
});
formatter.uri("CreateAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Tests for automationatpractice website",
  "description": "",
  "id": "tests-for-automationatpractice-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Creating a new user account",
  "description": "",
  "id": "tests-for-automationatpractice-website;creating-a-new-user-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User navigate into autopractise website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User select signin link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters the new email id and clicks create account link",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User enter person account details",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDefs.user_navigate_into_autopractise_website()"
});
formatter.result({
  "duration": 1389856751,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageStepDef.user_select_signin_link()"
});
formatter.result({
  "duration": 1362043698,
  "status": "passed"
});
formatter.match({
  "location": "CreatePageStepDefs.user_enters_the_new_email_id_and_clicks_create_account_link()"
});
formatter.result({
  "duration": 5734068571,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
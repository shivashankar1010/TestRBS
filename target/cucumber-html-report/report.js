$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Personaldetails.feature");
formatter.feature({
  "line": 2,
  "name": "Tests for sigin in page",
  "description": "",
  "id": "tests-for-sigin-in-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User is signed into the autopracitce",
  "description": "",
  "id": "tests-for-sigin-in-page;user-is-signed-into-the-autopracitce",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User navigate into autopractise website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on the Tshirt link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "click on the add to cart",
  "keyword": "Then "
});
});
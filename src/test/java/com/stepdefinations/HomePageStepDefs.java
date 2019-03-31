package com.stepdefinations;

import com.cucumberrunner.AbstractMain;
import com.cucumberrunner.Configuration;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageStepDefs extends AbstractMain {
    public WebDriver driver= Configuration.browser();



    @Given("^User navigate into autopractise website$")
    public void user_navigate_into_autopractise_website() throws Throwable {
      driver.manage().deleteAllCookies();
       homepage.start();
    }

    @When("^user click on the Tshirt link$")
    public void user_click_on_the_Tshirt_link() throws Throwable {
        homepage.select_Tshirt_from_TopNav();
    }


    @When("^user click on the dress link$")
    public void user_click_on_the_dress_link() throws Throwable {
        homepage.select_dress_from_TopNav();
    }


    @Then("^validate user is successfully logged in$")
    public void validate_user_is_successfully_logged_in() throws Throwable {
     homepage.validateHomePage();

    }

    @When("^user click logout link$")
    public void user_click_logout_link() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       homepage.logout();

    }


}

package com.stepdefinations;

import com.cucumberrunner.AbstractMain;
import com.cucumberrunner.Configuration;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class LoginPageStepDef extends AbstractMain {
    public WebDriver driver= Configuration.browser();


    @When("^User select signin link$")

    public void user_select_signin_link() throws Throwable {
        loginpage.login_Link();
    }




    @Then("^user enters valid credentials$")
    public void user_enters_valid_credentials() throws Throwable {
      loginpage.user_Sigin_Details();
      loginpage.select_Signin_Button();


    }



}

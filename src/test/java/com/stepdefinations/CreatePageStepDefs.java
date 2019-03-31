package com.stepdefinations;

import com.cucumberrunner.AbstractMain;
import com.cucumberrunner.Configuration;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class CreatePageStepDefs extends AbstractMain {
    public WebDriver driver= Configuration.browser();

    @Then("^user enters the new email id and clicks create account link$")
    public void user_enters_the_new_email_id_and_clicks_create_account_link() throws Throwable {

        createAccountPageaccountPage.createAccount();
        createAccountPageaccountPage.fillaccountdetails();
        createAccountPageaccountPage.clickRegister();

    }

}

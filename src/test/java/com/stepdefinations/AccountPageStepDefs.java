package com.stepdefinations;

import com.cucumberrunner.AbstractMain;
import com.cucumberrunner.Configuration;
import com.pages.AccountPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class AccountPageStepDefs extends AbstractMain {
    public WebDriver driver= Configuration.browser();


    @Then("^user enters the new email id$")
    public void user_enters_the_new_email_id() throws Throwable {
        accountPage.user_enters_new_email_id();
    }

    @Then("^user clicks on the create account$")
    public void user_clicks_on_the_create_account() throws Throwable {
        accountPage.user_clicks_createaccount();
    }

//    @Then("^User enter person account details$")
//    public void user_enter_person_account_details(DataTable arg2) throws Throwable {
//        List<String> creds= arg2.asList(String.class);
//        accountPage.
//        loginpage.user_Sigin_Details(creds.get(0),creds.get(1));
//
//    }
}
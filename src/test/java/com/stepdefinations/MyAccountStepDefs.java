package com.stepdefinations;

import com.cucumberrunner.AbstractMain;
import com.cucumberrunner.Configuration;
import com.pages.MyAccountPage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class MyAccountStepDefs extends AbstractMain {
    public WebDriver driver= Configuration.browser();


    @Then("^click on the my personal information$")
    public void click_on_the_my_personal_information() throws Throwable {
        myAccountPage.userclicks_mypersonalinformation();
    }

    @Then("^update the first name$")
    public void update_the_first_name() throws Throwable {
        myAccountPage.user_updatesfirstname();
    }
    @Then("^enter the password$")
    public void enter_the_password() throws Throwable {
        myAccountPage.user_enterspassword();
    }
    @Then("^click on the Save button$")
    public void click_on_the_Save_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        myAccountPage.user_clicks_savebutton();
    }

}

package com.stepdefinations;

import com.cucumberrunner.AbstractMain;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class LoginPageStepDef extends AbstractMain {

    @When("^User select signin link$")

    public void user_select_signin_link() throws Throwable {
        loginpage.login_Link();
    }

    @When("^User enter a \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_a_and(String emailid, String password) throws Throwable {
      //  loginpage.user_Sigin_Details(emailid,password);
    }

    @Then("^User click on sign in button$")
    public void user_click_on_sign_in_button() throws Throwable {
        loginpage.select_Signin_Button();
    }

    @Then("^User enter a cfredentials$")
    public void user_enter_a_cfredentials(DataTable arg1) throws Throwable {
       List<String> creds= arg1.asList(String.class);
        loginpage.user_Sigin_Details(creds.get(0),creds.get(1));

    }
}

package com.stepdefinations;

import com.cucumberrunner.AbstractMain;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class HomePageStepDefs extends AbstractMain {
    @Given("^User navigate into autopractise website$")
    public void user_navigate_into_autopractise_website() throws Throwable {
       homepage.start();
    }

    @When("^user click on the Tshirt link$")
    public void user_click_on_the_Tshirt_link() throws Throwable {
        homepage.select_Tshirt_from_TopNav();

    }

}

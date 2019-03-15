package com.stepdefinations;

import com.cucumberrunner.AbstractMain;
import com.pages.ProductlistPage;
import cucumber.api.java.en.Then;

public class ProductPageStepDefs  extends AbstractMain{

    @Then("^click on the add to cart$")
    public void click_on_the_add_to_cart() throws Throwable {

        productlistPage.clickon_Quickview_Button();

    }

    @Then("^click on the proceed to cart$")
    public void click_on_the_proceed_to_cart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //*[@id="add_to_cart"]/button/span
        productlistPage.clickon_ProceedCart_Button();
    }


    @Then("^click on the proceed to checkout$")
    public void click_on_the_proceed_to_checkout() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
         productlistPage.clickon_Proceedto_checkout();

    }
}

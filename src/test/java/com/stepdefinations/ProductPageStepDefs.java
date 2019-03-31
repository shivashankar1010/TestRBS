package com.stepdefinations;

import com.cucumberrunner.AbstractMain;
import com.cucumberrunner.Configuration;
import com.pages.ProductlistPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class ProductPageStepDefs  extends AbstractMain{
    public WebDriver driver= Configuration.browser();


    @Then("^click on the add to cart$")
    public void click_on_the_add_to_cart() throws Throwable {
        productlistPage.clickon_Quickview_Button();
    }
    @Then("^click on the proceed to cart$")
    public void click_on_the_proceed_to_cart() throws Throwable {
        productlistPage.clickon_ProceedCart_Button();
    }
    @Then("^click on the proceed to checkout$")
    public void click_on_the_proceed_to_checkout() throws Throwable {
         productlistPage.clickon_Proceedto_checkout();
    }
    @Then("^click on the procced to checkout in summary page$")
    public void click_on_the_procced_to_checkout_in_summary_page() throws Throwable {
        productlistPage.clickon_Proceedto_checkout_summary();
    }
    @When("^click on the procced to checkout in address summary page$")
    public void click_on_the_procced_to_checkout_in_address_summary_page() throws Throwable {
        productlistPage.clickon_Proceedto_checkout_summary_addresspage();
    }
    @When("^user clicks on the terms and conditions in shipping page$")
    public void user_clicks_on_the_terms_and_conditions_in_shipping_page() throws Throwable {
      productlistPage.clickson_terms();
    }


}

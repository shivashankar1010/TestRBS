package com.stepdefinations;
import com.cucumberrunner.AbstractMain;
import com.cucumberrunner.Configuration;
import com.pages.ProductlistPage;
import com.pages.ShippingPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class ShippingPageStepDefs extends AbstractMain

{

    public WebDriver driver= Configuration.browser();

    @When("^click on the procced to checkout in shipping page$")
    public void click_on_the_procced_to_checkout_in_shipping_page() throws Throwable {
        shippingPage.clickon_Proceedto_checkout_shipping_addresspage();
    }

    @Then("^user clicks on the pay by bank$")
    public void user_clicks_on_the_pay_by_bank() throws Throwable {
        shippingPage.userclicks_onpayment();
    }
    @Then("^User clicks on the confirm order$")
    public void user_clicks_on_the_confirm_order() throws Throwable {
        shippingPage.userclicks_on_confirmorder();
    }
    @Then("^user clicks the back to order page$")
    public void user_clicks_the_back_to_order_page() throws Throwable {
    shippingPage.userverifys_orderconfimation();

    }



}

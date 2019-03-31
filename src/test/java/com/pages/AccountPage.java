package com.pages;

import com.cucumberrunner.AbstractMain;
import com.cucumberrunner.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage  extends AbstractMain {
    public WebDriver driver= Configuration.browser();


    public void user_enters_new_email_id() throws Exception
    {
        driver.findElement(By.id(("email_create"))).sendKeys(Configuration.readpropertiesFile("username"));
    }

    public void user_clicks_createaccount() throws  Exception
    {
        driver.findElement(By.xpath(("//form[@id='create-account_form']//span[1]"))).click();
    }
}

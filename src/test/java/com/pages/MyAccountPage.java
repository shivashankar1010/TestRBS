package com.pages;
import com.cucumberrunner.AbstractMain;
import com.cucumberrunner.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends  AbstractMain {
    public WebDriver driver= Configuration.browser();

    public void userclicks_mypersonalinformation() throws Exception
    {
        driver.findElement(By.xpath(("//span[contains(text(),'My personal information')]"))).click();
    }
    public void user_updatesfirstname() throws Exception
    {
        driver.findElement(By.xpath(("//input[@id='firstname']"))).clear();
        driver.findElement(By.xpath(("//input[@id='firstname']"))).sendKeys("Testname");
    }
    public void user_enterspassword() throws Exception
    {
        driver.findElement(By.xpath(("//input[@id='old_passwd']"))).sendKeys("Sashaooo");
    }
    public void user_clicks_savebutton() throws Exception
    {
        driver.findElement(By.xpath(("//span[contains(text(),'Save')]"))).click();
    }

}

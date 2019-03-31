package com.pages;

import com.cucumberrunner.AbstractMain;
import com.cucumberrunner.Configuration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage extends AbstractMain {
    public  WebDriver driver=Configuration.browser();

    @FindBy(xpath = "//h1[text()='My account']")
    private WebElement myAccount;


    @FindBy(className = "logout")
    private WebElement signoutlink;


    public  HomePage(){
        PageFactory.initElements(driver,this);
    }

    public void start() {
       // driver.manage().window().maximize();
        driver.get(Configuration.readpropertiesFile("url"));
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        }

        public void select_Tshirt_from_TopNav() throws InterruptedException {
        Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
            //*[@id="block_top_menu"]/ul/li[2]/a
        }

    public void select_dress_from_TopNav() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();

    }

    public  void validateHomePage(){
        Assert.assertTrue(myAccount.isDisplayed());
    }
    public  void logout(){
        signoutlink.click();
    }



}

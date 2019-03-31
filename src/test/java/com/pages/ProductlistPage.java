package com.pages;

import com.cucumberrunner.AbstractMain;

import com.cucumberrunner.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


public class ProductlistPage extends AbstractMain {
    public WebDriver driver= Configuration.browser();


    @FindBy(id = "selectProductSort")
            private WebElement sortlink;

    public  ProductlistPage(){
        PageFactory.initElements(driver,this);
    }


    String secondTestWindowHandle = null;

    public void clickon_Quickview_Button() {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")).click();

    }
    public void clickon_ProceedCart_Button() {
      //  Select s= new Select(sortlink);
      //  s.selectByIndex(2);
        try {
            Thread.sleep(9000);
        }
        catch (Exception e){

        }
       List<WebElement> prices= driver.findElements(By.xpath("//div[@class='right-block']//span[@itemprop='price']"));
        System.out.println("size is    "+prices.size());
        List  pri= new ArrayList<String>();
        for (WebElement q: prices){
            System.out.println("value is   "+q.getText());
            pri.add(q.getText().replace("$","").trim());

        }
        Collections.sort(pri);
        System.out.println("value of first element is   "+pri.get(pri.size()-1));



        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//div[@class='right-block']//span[contains(text(),'"+pri.get(pri.size()-1)+"')]"))).build().perform();
        try {
            Thread.sleep(4000);
        }
        catch (Exception e){

        }
        driver.findElement(By.xpath("//div[@class='right-block']//span[contains(text(),'"+pri.get(pri.size()-1)+"')]/../..//a//span[text()='Add to cart']")).click();
    }


    public void clickon_Proceedto_checkout() throws Exception {
        Thread.sleep(10000);
        driver.findElement(By.xpath("//a//span[contains(text(),'Proceed to checkout')]")).click();
    }

    public void clickon_Proceedto_checkout_summary() throws Exception {
        driver.findElement(By.xpath("//p//a//span[contains(text(),'Proceed to checkout')]")).click();
    }

    public void clickon_Proceedto_checkout_summary_addresspage() throws Exception {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button//span[contains(text(),'Proceed to checkout')]")).click();
    }

    public void clickson_terms() throws Exception {
        driver.findElement(By.id("cgv")).click();
    }
}

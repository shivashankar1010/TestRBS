package com.pages;

import com.cucumberrunner.AbstractMain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ShippingPage extends AbstractMain {

    String ordernumber = null;

    public void clickon_Proceedto_checkout_shipping_addresspage() throws Exception {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button//span[contains(text(),'Proceed to checkout')]")).click();
    }

    public void userclicks_onpayment() throws Exception
    {
        driver.findElement(By.xpath(("//a[@title='Pay by bank wire']"))).click();
    }

    public void userclicks_on_confirmorder() throws Exception
    {
        driver.findElement(By.xpath(("//span[contains(text(),'I confirm my order')]"))).click();
        String a = driver.findElement(By.xpath(("//p[@class='cheque-indent']/.."))).getText();
        System.out.println("entire content of a --->"+a);
        String b= a.substring(a.indexOf("ence")+4);
        System.out.println("text is  "+b);
        String c= b.substring(0,Math.min(a.length(),10));
        System.out.println("text is  \t"+c);
        ordernumber =c;
    }

    public void userverifys_orderconfimation() throws Exception
    {
        driver.findElement(By.xpath(("//a[@title='Back to orders']"))).click();
        driver.findElement(By.xpath("//a[contains(text(),'"+ordernumber.trim()+"')]")).isDisplayed();
    }

}

package com.pages;

import com.cucumberrunner.AbstractMain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;
import java.util.concurrent.TimeUnit;


public class ProductlistPage extends AbstractMain {


    String secondTestWindowHandle = null;


    public void clickon_Quickview_Button() {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")).click();

    }

    //*[@id="add_to_cart"]/button/span

    public void clickon_ProceedCart_Button() {

        //div[@class='product-image-container']/a/img
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//div[@class='product-image-container']/a/img"))).build().perform();
        driver.findElement(By.xpath("//a//span[text()='Add to cart']")).click();

//        Integer size = driver.findElements(By.tagName("iframe")).size();
//        driver.switchTo().frame(0);
//        driver.findElement(By.cssSelector(".exclusive > span")).click();

    }

    public void clickon_Proceedto_checkout() throws Exception {
//
        Thread.sleep(10000);
//
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

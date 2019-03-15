package com.pages;

import com.cucumberrunner.AbstractMain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;
import java.util.concurrent.TimeUnit;


public class ProductlistPage extends AbstractMain {


    String secondTestWindowHandle = null;




    public void clickon_Quickview_Button(){
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")).click();

    }

    //*[@id="add_to_cart"]/button/span

    public void clickon_ProceedCart_Button(){

        Integer size = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame(0);
        driver.findElement(By.cssSelector(".exclusive > span")).click();

    }

    public void clickon_Proceedto_checkout() throws Exception{

         Thread.sleep(10000);
       // Integer size = driver.findElements(By.tagName("iframe")).size();
        //driver.switchTo().frame(0);
        //String x = driver.getWindowHandle();
       // driver.switchTo().activeElement().findElement(By.cssSelector(".btn btn-default button button-medium > span")).click();
        //driver.findElement(By.id("layer_cart")).findElement(By.cssSelector(".btn btn-default button button-medium > span")).click();
        driver.switchTo().frame(0);
       driver.findElement(By.cssSelector(".btn btn-default button button-medium > span")).click();
      // driver.findElement(By.linkText("Proceed to checkout")).click();
        //driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();

    }

}

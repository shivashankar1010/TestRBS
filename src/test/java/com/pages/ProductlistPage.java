package com.pages;

import com.cucumberrunner.AbstractMain;

import org.openqa.selenium.By;

import java.util.Set;
import java.util.concurrent.TimeUnit;


public class ProductlistPage extends AbstractMain {


    String secondTestWindowHandle = null;




    public void clickon_Quickview_Button(){
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")).click();

    }

    //*[@id="add_to_cart"]/button/span

    public void clickon_ProceedCart_Button(){
       // driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
        //driver.findElement(By.id("//*[@id=“block_top_menu”]/ul/li[3]/a")).click();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[contains(.,'Add to cart')]")).click();

    }

}

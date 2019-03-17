package com.pages;

import com.cucumberrunner.AbstractMain;
import org.openqa.selenium.By;

public class LoginPage extends AbstractMain {


    public void login_Link(){
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        System.out.println("User has logged in ");
    }

    public void user_Sigin_Details(String emailid, String password){
        driver.findElement(By.id("email")).sendKeys(emailid);
        driver.findElement(By.id("passwd")).sendKeys(password);
    }

    public void select_Signin_Button(){
        driver.findElement(By.id("SubmitLogin")).click();

    }
}

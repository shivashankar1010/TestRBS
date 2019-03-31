package com.pages;

import com.cucumberrunner.AbstractMain;
import com.cucumberrunner.Configuration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractMain {


    public WebDriver driver= Configuration.browser();

    @FindBy(className = "login")
    private WebElement loginLink;

    @FindBy(id = "email")
    private WebElement emailtextbox;

    @FindBy(id = "passwd")
    private WebElement passwordtextbox;

    @FindBy(id = "SubmitLogin")
    private WebElement submitloginbutton;

public LoginPage(){
    PageFactory.initElements(driver,this);
}
    public void login_Link(){
        loginLink.click();

    }


    public void user_Sigin_Details(){
        emailtextbox.sendKeys(Configuration.readpropertiesFile("username"));
        passwordtextbox.sendKeys(Configuration.readpropertiesFile("password"));

    }

    public void select_Signin_Button(){
      submitloginbutton.click();
    }
}

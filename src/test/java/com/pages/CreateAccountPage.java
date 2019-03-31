package com.pages;

import com.cucumberrunner.Configuration;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage {

    public WebDriver driver= Configuration.browser();

    public  String ranomemail= RandomStringUtils.randomAlphanumeric(20).toLowerCase();;

    @FindBy(xpath = "//h1[text()='My account']")
    private WebElement myAccount;

    @FindBy(id = "email_create")
    private WebElement emailcreatetextbox;

    @FindBy(id ="SubmitCreate")
    private WebElement create_account_link;


    //personl id information

    @FindBy(id = "id_gender1")
    private  WebElement Title;

     @FindBy(id = "customer_firstname")
     private  WebElement cfirstname;

     @FindBy(id = "customer_lastname")
     private  WebElement clastname;

     @FindBy(id = "passwd")
     private WebElement passwd;

     @FindBy(id = "days")
     private WebElement date;

    @FindBy(id = "months")
    private WebElement months;

    @FindBy(id = "years")
    private WebElement birthyear;

    @FindBy(id = "firstname")
    private  WebElement firstname;

    @FindBy(id = "lastname")
    private  WebElement lastname;


    @FindBy(id ="company")
    private  WebElement company;


    @FindBy(id = "address1")
    private  WebElement addressone;

    @FindBy(id = "city")
    private  WebElement city;


    @FindBy(id = "id_state")
    private WebElement state;
    //<option value="1">Alabama</option>


    @FindBy(id = "postcode")
    private  WebElement postcode;



    @FindBy(id = "id_country")
    private  WebElement countryid;

    @FindBy(id = "phone")
    private  WebElement phone;


    @FindBy(id = "phone_mobile")
    private WebElement mobilephone;


  @FindBy(id = "alias")
  private  WebElement aliasaddress;

  @FindBy(id = "submitAccount")
  private WebElement Register;



    public  CreateAccountPage(){
        PageFactory.initElements(driver,this);
    }

   public  void createAccount(){
        emailcreatetextbox.sendKeys(ranomemail+"@gmail.com");
       create_account_link.click();

   }

   public void selectDropDrown(WebElement dropdown,int element){
       Select s= new Select(dropdown);
       s.selectByIndex(element);
   }



   public void fillaccountdetails()

   {

           Title.click();
           cfirstname.sendKeys("testfirst");
           clastname.sendKeys("testlastname");
           passwd.sendKeys("testing");
           selectDropDrown(date,1);
           selectDropDrown(months,1);
           selectDropDrown(birthyear,10);
           company.sendKeys("Testcompany");
           addressone.sendKeys("123 text area");
           city.sendKeys("London");
           selectDropDrown(state,1);
           postcode.sendKeys("12345");
           selectDropDrown(countryid,1);
           phone.sendKeys("1234567890");
           mobilephone.sendKeys("1234567890");
           aliasaddress.sendKeys("aliasnametest");

   }


   public  void clickRegister()
   {
       Register.click();
   }
}

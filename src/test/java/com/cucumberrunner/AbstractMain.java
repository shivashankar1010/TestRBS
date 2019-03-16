package com.cucumberrunner;

import com.pages.*;
import org.openqa.selenium.WebDriver;

public class AbstractMain {


    public static WebDriver driver;
    public static HomePage homepage = new HomePage();
    public static LoginPage loginpage=new LoginPage();
    public static ProductlistPage productlistPage=new ProductlistPage();
    public static ShippingPage shippingPage = new ShippingPage();
    public static MyAccountPage myAccountPage = new MyAccountPage();

}

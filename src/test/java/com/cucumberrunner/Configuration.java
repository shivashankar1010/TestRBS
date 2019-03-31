package com.cucumberrunner;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Configuration {

	public static Properties properties = new Properties(); // Here we imported
															// Java.util

	public static String filepath;
	public static FileInputStream in;
	public static String URL;
	
	public static String Browser;
	public static  WebDriver driver;

	
public static String readpropertiesFile(String propertyName) {
    try {
        filepath = "src/test/resources/environment.properties";
        in = new FileInputStream(System.getProperty("user.dir") + "/"
                + filepath);
        properties.load(in);


    } catch (Exception e) {

    }
    return properties.getProperty(propertyName);
}

	public static WebDriver browser() {


Browser = readpropertiesFile("browser");


		if (Browser.equalsIgnoreCase("firefox")) {
            if(driver==null){
                String filepath = "src/test/resources/geckodriver";
                filepath = System.getProperty("user.dir") + "/" + filepath;
                File file = new File(filepath);
                System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
                driver = new FirefoxDriver();
            }
            else
                return driver;


        }
		

		
		else if (Browser.equalsIgnoreCase("ie")) {
			if(driver==null){
			String filepath = "src/test/resources/Drivers/IEDriverServer.exe";
			filepath = System.getProperty("user.dir") + "/" + filepath;
			File file = new File(filepath);
			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
			driver = new InternetExplorerDriver();
			}
			else 
				return driver;

			
		}
		else if (Browser.equalsIgnoreCase("chrome")) {
			if(driver==null){
			String filepath = "src/test/resources/Drivers/chromedriver";
			filepath = System.getProperty("user.dir") + "/" + filepath;
			File file = new File(filepath);
			System.setProperty("webdriver.chrome.driver",
					file.getAbsolutePath());

                ChromeOptions chromeOptions = new ChromeOptions();

                chromeOptions.addArguments("--kiosk");

                driver = new ChromeDriver(chromeOptions);
			}
			else 
				return driver;
		}

		return driver;
	

	}








}

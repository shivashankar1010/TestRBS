package com.pages;

import com.cucumberrunner.AbstractMain;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomePage extends AbstractMain {

    public void start() {
        System.setProperty ("webdriver.chrome.driver", "./src/test/resources/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        }

        public void select_Tshirt_from_TopNav() throws InterruptedException {
        Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
        }
}

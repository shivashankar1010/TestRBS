package com.cucumberrunner;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/Features", glue = { "com.stepdefinations" }, tags = {
        "@test" }, plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json" })

public class Runner {

    @AfterClass
    public static void closeBrowser(){
        Configuration.browser().quit();
    }

}
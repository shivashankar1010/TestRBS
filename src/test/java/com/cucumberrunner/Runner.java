package com.cucumberrunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/Features", glue = { "com.stepdefinations" }, tags = {
        "@test1" }, plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json" })


public class Runner {

}
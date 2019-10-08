package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.cucumber.baseclass.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\cucumber\\feature",
                 glue="com\\cucumber\\stepdefinition",
                 tags= {"~@ignore"},dryRun=false,strict=false,monochrome=true)
public class TestRunner {
	public static WebDriver driver;
	@BeforeClass
	public static void driverInitialization() {
		 driver = BaseClass.getDriver("chrome");
	}
	
	 
	@AfterClass
	public static void driverQuite() {
		//driver.quit();
	}

}

package com.cucumber.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.BaseClass;
import com.cucumber.utilities.Configuration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty",
				"html:\\src\\test\\resources\\com\\cucumber\\reports",
				"json:\\src\\test\\resources\\com\\cucumber\\reports\\cucumber.json",
				"junit:\\src\\test\\resources\\com\\cucumber\\reports\\cucumber.xml"
		},
		features="src\\test\\java\\com\\cucumber\\feature",
                 glue="com\\cucumber\\stepdefinition",
                 tags= {"@Adactin"},dryRun=false,strict=true,monochrome=true)
public class TestRunner {
	public static WebDriver driver;
	@BeforeClass
	public static void driverInitialization() throws IOException {
		System.out.println("before class");
		Configuration conf=new Configuration();
		 driver = BaseClass.getDriver(conf.getBrowsername());
	}
	 
	@AfterClass
	public static void driverQuite() {
	driver.quit();
	}

}

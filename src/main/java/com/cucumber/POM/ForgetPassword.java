package com.cucumber.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgetPassword {
	public static WebDriver driver;
	public ForgetPassword(WebDriver ldriver) {
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//a[contains(@title,'Go to Facebook home')]")
private WebElement logoField;

public WebElement getLogoField() {
	return logoField;
}



}

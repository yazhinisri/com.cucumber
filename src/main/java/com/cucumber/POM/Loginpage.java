package com.cucumber.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public static WebDriver driver;
	public Loginpage(WebDriver ldriver) {
	   this.driver=ldriver;
	   PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//u[contains(text(),'Facebook')]")
	private WebElement logofield;
	
	@FindBy(id="email")
	private WebElement emailField;
	
	@FindBy(id="pass")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submitField;

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getSubmitField() {
		return submitField;
	}
	
	public WebElement getlogoField() {
		return logofield;
	}

}

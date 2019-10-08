package com.cucumber.stepdefinition;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.cucumber.POM.ForgetPassword;
import com.cucumber.POM.Loginpage;
import com.cucumber.baseclass.BaseClass;
import com.cucumber.runner.TestRunner;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	public static WebDriver driver=TestRunner.driver;
//	@BeforeClass
//	public static void driverInitialization() {
//		 driver = BaseClass.getDriver("chrome");
//	}
	@Given("^user should be in facebook application$")
	public void user_should_be_in_facebook_application() throws Throwable {
		
		getUrl("https://www.facebook.com");
		Thread.sleep(3000);
	  //  throw new PendingException();
	}

	@Then("^user should see the facebook logo$")
	public void user_should_see_the_facebook_logo() throws Throwable {
		Loginpage lp=new Loginpage(driver);
		Thread.sleep(3000);
		ElementIsDisplayed(lp.getlogoField());
	  //throw new PendingException();
	}

	@When("^user should enter the '(.*)' in the email field in login page$")
	public void user_should_enter_the_email_address_in_the_email_field_in_login_page(String str) throws Throwable {
		Loginpage lp=new Loginpage(driver);
		setkey(lp.getEmailField(), str);
	 
	}

	@And("^user enter the '(.*)' in the password field in loginpage$")
	public void user_enter_the_password_in_the_password_field_in_loginpage(String pwd) throws Throwable {
		Loginpage lp=new Loginpage(driver);
		setkey(lp.getPasswordField(), pwd);
	  
	}

	@And("^user click on login button in the login page$")
	public void user_click_on_login_button_in_the_login_page() throws Throwable {
		Loginpage lp=new Loginpage(driver);
		clickElement(lp.getSubmitField());
	}

	@When("^user should wait untill the page get loded$")
	public void user_should_wait_untill_the_page_get_loded() throws Throwable {
		ForgetPassword fp=new ForgetPassword(driver);
		waitforvisibilityofelment(fp.getLogoField());
	}

	@Then("^user should see the facebook title in the forgot facebook page$")
	public void user_should_see_the_facebook_title_in_the_forgot_facebook_page() throws Throwable {
		ForgetPassword fp=new ForgetPassword(driver);
		ElementIsDisplayed(fp.getLogoField());
		System.out.println("Pass");
	}
//	@AfterClass
//	public static void driverQuite() {
//		driver.quit();
//	}


}

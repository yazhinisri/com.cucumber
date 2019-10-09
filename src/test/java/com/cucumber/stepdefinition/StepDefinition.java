package com.cucumber.stepdefinition;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.BaseClass;
import com.cucumber.runner.TestRunner;
import com.cucumber.utilities.Configuration;
import com.cucumber.utilities.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	public static WebDriver driver = TestRunner.driver;

	// @Given("^user should be in facebook application$")
	// public void user_should_be_in_facebook_application() throws Throwable {
	//
	// getUrl("https://www.facebook.com");
	// Thread.sleep(3000);
	// // throw new PendingException();
	// }
	//
	// @Then("^user should see the facebook logo$")
	// public void user_should_see_the_facebook_logo() throws Throwable {
	// Loginpage lp=new Loginpage(driver);
	// Thread.sleep(3000);
	// ElementIsDisplayed(lp.getlogoField());
	// //throw new PendingException();
	// }
	//
	// @When("^user should enter the '(.*)' in the email field in login page$")
	// public void
	// user_should_enter_the_email_address_in_the_email_field_in_login_page(String
	// str) throws Throwable {
	// Loginpage lp=new Loginpage(driver);
	// setkey(lp.getEmailField(), str);
	//
	// }
	//
	// @And("^user enter the '(.*)' in the password field in loginpage$")
	// public void user_enter_the_password_in_the_password_field_in_loginpage(String
	// pwd) throws Throwable {
	// Loginpage lp=new Loginpage(driver);
	// setkey(lp.getPasswordField(), pwd);
	//
	// }
	//
	// @And("^user click on login button in the login page$")
	// public void user_click_on_login_button_in_the_login_page() throws Throwable {
	// Loginpage lp=new Loginpage(driver);
	// clickElement(lp.getSubmitField());
	// }
	//
	// @When("^user should wait untill the page get loded$")
	// public void user_should_wait_untill_the_page_get_loded() throws Throwable {
	// ForgetPassword fp=new ForgetPassword(driver);
	// waitforvisibilityofelment(fp.getLogoField());
	// }
	//
	// @Then("^user should see the facebook title in the forgot facebook page$")
	// public void user_should_see_the_facebook_title_in_the_forgot_facebook_page()
	// throws Throwable {
	// ForgetPassword fp=new ForgetPassword(driver);
	// ElementIsDisplayed(fp.getLogoField());
	// System.out.println("Pass");
	// }
	// -----------------------------------------------------------------------------------------------------------

	@Given("^user should be in adactin application$")
	public void user_should_be_in_adactin_application() throws Throwable {
		System.out.println("StepDefinition");
		Configuration conf = new Configuration();
		getUrl(conf.getURL());
		Thread.sleep(3000);
	}

	@When("^user enter '(.*)' in the email field$")
	public void user_enter_in_the_email_field(String str) throws Throwable {
		PageObjectManager pom = new PageObjectManager(driver);
		setkey(pom.getHrs().getEmailField(), str);
	}

	@When("^user enter the '(.*)' in the password field in loginpage$")
	public void user_enter_the_in_the_password_field_in_loginpage(String str) throws Throwable {
		PageObjectManager pom = new PageObjectManager(driver);
		setkey(pom.getHrs().getPassField(), str);
	}

	@When("^user select location in search hotel page$")
	public void user_select_location_in_search_hotel_page() throws Throwable {
		PageObjectManager pom = new PageObjectManager(driver);
		dropdown(pom.getSh().getLocationField(), "index", "1");
	}

	@When("^user select hotel in search hotel page$")
	public void user_select_hotel_in_search_hotel_page() throws Throwable {
		PageObjectManager pom = new PageObjectManager(driver);
		dropdown(pom.getSh().getHotelfieldField(), "index", "1");
	}

	@When("^user select room type in search hotel page$")
	public void user_select_room_type_in_search_hotel_page() throws Throwable {
		PageObjectManager pom = new PageObjectManager(driver);
		dropdown(pom.getSh().getRoom_typeField(), "index", "1");
	}

	@When("^user select number of rooms$")
	public void user_select_number_of_rooms() throws Throwable {
		PageObjectManager pom = new PageObjectManager(driver);
		dropdown(pom.getSh().getRoomNoField(), "index", "1");
	}

	@When("^user enter checkin date later than check out date$")
	public void user_enter_checkin_date_later_than_check_out_date() throws Throwable {
		PageObjectManager pom = new PageObjectManager(driver);
		setkey(pom.getSh().getDatepick_inField(), "23/09/2019");
	}

	@When("^user enter checkout date$")
	public void user_enter_checkout_date() throws Throwable {
		PageObjectManager pom = new PageObjectManager(driver);
		setkey(pom.getSh().getDatepick_outField(), "22/09/2019");
	}

	@Then("^Verify that system gives an error saying check-in-date should not be later than check-out-date\\.$")
	public void verify_that_system_gives_an_error_saying_check_in_date_should_not_be_later_than_check_out_date()
			throws Throwable {
		PageObjectManager pom = new PageObjectManager(driver);
		if (driver.getTitle().equals("AdactIn.com - Search Hotel")) {
			SimpleDateFormat sd = new SimpleDateFormat("dd/mm/yyyy");
			Date d1 = sd.parse(pom.getSh().getDatepick_inField().getAttribute("value"));
			Date d2 = sd.parse(pom.getSh().getDatepick_outField().getAttribute("value"));
			if (d1.compareTo(d2) == 1) {
				System.out.println("pass");
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",
						pom.getSh().getCheckInSpanField());

			}
		}
	}

	// @When("^user click on login button in the login page in Adaction
	// application$")
	// public void
	// user_click_on_login_button_in_the_login_page_in_Adaction_application() throws
	// Throwable {
	// // Write code here that turns the phrase above into concrete actions
	// throw new PendingException();
	// }

	// @When("^user should wait untill the page get loded$")
	// public void user_should_wait_untill_the_page_get_loded() throws Throwable {
	// PageObjectManager pom=new PageObjectManager(driver);
	// waitforvisibilityofelment(pom.getSh().getAdult_roomField());
	// throw new Exception();
	// }

	@When("^user click on login button in the login page$")
	public void user_click_on_login_button_in_the_login_page() throws Throwable {
		PageObjectManager pom = new PageObjectManager(driver);
		clickElement(pom.getHrs().getLoginField());
	}
	@When("^user click the search button$")
	public void user_click_the_search_button() throws Throwable {
		PageObjectManager pom = new PageObjectManager(driver);
		clickElement(pom.getSh().getSubmitField());
	}

}

package com.cucumber.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelReservationSystem {
	public static WebDriver driver;

	public HotelReservationSystem(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}

	//Booked itenary
		@FindBy(xpath="//a[text()='Booked Itinerary']")
		private WebElement itenary;
		
		public WebElement getitenary() {
			return itenary;
		}

	@FindBy(id = "username")
	private WebElement emailField;
	
	@FindBy(id="password")
	private WebElement passField;
	
	@FindBy(id="login")
	private WebElement loginField;

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPassField() {
		return passField;
	}

	public WebElement getLoginField() {
		return loginField;
	}

}

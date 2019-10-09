package com.cucumber.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	public WebDriver driver;
    public SearchHotel(WebDriver ldriver) {
    	this.driver=ldriver;
    	PageFactory.initElements(ldriver, this);
	}
    @FindBy(xpath = "//table[@class='login']/tbody/tr/td")
	private WebElement pgHeader;

	public WebElement getpgHeader() {
		return pgHeader;
	}
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement lnkBooked;
	
	public WebElement getlnkBooked() {
		return lnkBooked;
	}
	
	@FindBy(id="checkin_span")
	private WebElement checkin_spanField;
	
	public WebElement getCheckInSpanField() {
		return checkin_spanField;
	}


    @FindBy(id="location")
    private WebElement locationField;
    
    @FindBy(id="hotels")
    private WebElement hotelfieldField;
    
    @FindBy(id="room_type")
    private WebElement room_typeField;
    
    @FindBy(name="room_nos")
    private WebElement roomNoField;
    
    @FindBy(id="datepick_in")
    private WebElement datepick_inField;
    
    @FindBy(id="datepick_out")
    private WebElement datepick_outField;
    
    @FindBy(id="adult_room")
    private WebElement adult_roomField;
    
    @FindBy(id="Submit")
    private WebElement SubmitField;
    
    @FindBy(id="child_room")
    private WebElement child_roomField;
    

	public WebElement getLocationField() {
		return locationField;
	}

	public WebElement getHotelfieldField() {
		return hotelfieldField;
	}

	public WebElement getRoom_typeField() {
		return room_typeField;
	}

	public WebElement getRoomNoField() {
		return roomNoField;
	}

	public WebElement getDatepick_inField() {
		return datepick_inField;
	}

	public WebElement getDatepick_outField() {
		return datepick_outField;
	}

	public WebElement getAdult_roomField() {
		return adult_roomField;
	}

	public WebElement getChild_roomField() {
		return child_roomField;
	}

	public WebElement getSubmitField() {
		return SubmitField;
	}


}

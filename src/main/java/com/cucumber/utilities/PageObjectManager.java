package com.cucumber.utilities;

import org.openqa.selenium.WebDriver;

import com.cucumber.POM.HotelReservationSystem;
import com.cucumber.POM.SearchHotel;

public class PageObjectManager {
	public WebDriver driver;
	private HotelReservationSystem hrs;
	private SearchHotel sh;

	public SearchHotel getSh() {
		if(sh==null) {
			sh=new SearchHotel(driver);
		}
		return sh;
	}

	public HotelReservationSystem getHrs() {
		if(hrs==null) {
			hrs=new HotelReservationSystem(driver);
		}
		return hrs;
	}
	public PageObjectManager(WebDriver ldriver) {
		this.driver=ldriver;
	}

}

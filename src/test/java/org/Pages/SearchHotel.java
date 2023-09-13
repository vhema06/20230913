package org.Pages;

import org.base.UtilityClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends UtilityClass{
	
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Location")
	private WebElement dropLocation;
	
	
	@FindBy (id = "room_nos")
	private WebElement dropRooms;
	
	@FindBy (id = "datepick_in")
	private WebElement txtcheckIn;
	
	@FindBy (id = "date_pickout")
	private WebElement txtCheckOut;
	
	@FindBy (id = "adult_room")
	private WebElement dropAdult;
	
	@FindBy (id = "Submit")
	private WebElement btnSubmit;

	public WebElement getDropLocation() {
		return dropLocation;
	}

	public WebElement getDropRooms() {
		return dropRooms;
	}

	public WebElement getTxtcheckIn() {
		return txtcheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getDropAdult() {
		return dropAdult;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
	
	public void doSearchPage(String Location, String noofRooms, String checkIn, String checkOut, String noOfAdult) {
		WebElement dropLocation2 = getDropLocation();
		dropbyVisibleText(dropLocation2, Location);
		
		WebElement dropRooms2 = getDropRooms();
		dropbyVisibleText(dropRooms2, Location);
		
		WebElement txtCheckIn2 = getTxtcheckIn();
		dropbyVisibleText(txtCheckIn2, Location);
		
		WebElement txtcheckOut2 = getTxtCheckOut();
		dropbyVisibleText(txtcheckOut2, Location);
		
		WebElement dropAdult2 = getDropAdult();
		dropbyVisibleText(dropAdult2, Location);
		
		WebElement btnSubmit2 = getBtnSubmit();
		btnClick(btnSubmit2);
		
	}
	
	
	

}

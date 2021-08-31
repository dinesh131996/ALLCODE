package com.pomclass.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Details {
	public static WebDriver driver;
	
@FindBy(id="location")
private WebElement location;

@FindBy(id="hotels")
private WebElement hostel;

@FindBy(id="room_type")
private WebElement room;

@FindBy(id="room_nos")
private WebElement noOfRoom;

@FindBy(id="datepick_in")
private WebElement checkIn;

@FindBy(id="datepick_out")
private WebElement checkOut;

@FindBy(id="adult_room")
private WebElement adult;

@FindBy(id="child_room")
private WebElement children;

@FindBy(id="Submit")
private WebElement submit_Btn;


public WebElement getSubmit_Btn() {
	return submit_Btn;
}

public Booking_Details(WebDriver ldriver) {
	// TODO Auto-generated constructor stub
this.driver=ldriver;
PageFactory.initElements(driver, this);
}

public WebElement getLocation() {
	return location;
}

public WebElement getHostel() {
	return hostel;
}

public WebElement getRoom() {
	return room;
}

public WebElement getNoOfRoom() {
	return noOfRoom;
}

public WebElement getCheckIn() {
	return checkIn;
}

public WebElement getCheckOut() {
	return checkOut;
}

public WebElement getAdult() {
	return adult;
}

public WebElement getChildren() {
	return children;
}


}

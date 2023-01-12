package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.selenium.BaseClass1;

public class SearchHotel extends BaseClass1 {

	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement roomType;
	@FindBy(id = "room_nos")
	private WebElement roomNos;
	@FindBy(id = "datepick_in")
	private WebElement checkIn;
	@FindBy(id = "datepick_out")
	private WebElement checkOut;
	@FindBy(id = "adult_room")
	private WebElement adultPersonRoom;
	@FindBy(id = "child_room")
	private WebElement childPerRoom;
	@FindBy(id = "Submit")
	private WebElement Search;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNos() {
		return roomNos;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdultPersonRoom() {
		return adultPersonRoom;
	}

	public WebElement getChildPerRoom() {
		return childPerRoom;
	}

	public WebElement getSearch() {
		return Search;
	}

	public void searchHotels(String location, String hotels, String roomType, String roomNos, String checkIn,
			String checkOut, String adultPerRoom, String childPerRoom) {
		WebElement location2 = getLocation();
		seldctbyVisibletext(location2, location);
		WebElement hotels2 = getHotels();
		seldctbyVisibletext(hotels2, hotels);
		WebElement roomType2 = getRoomType();
		seldctbyVisibletext(roomType2, roomType);
		WebElement roomNos2 = getRoomNos();
		seldctbyVisibletext(roomNos2, checkIn);
		WebElement checkIn2 = getCheckIn();
		clear(checkIn2);
		Sendkeys(checkIn2, checkIn);
		WebElement checkOut2 = getCheckOut();
		clear(checkOut2);
		Sendkeys(checkOut2, checkOut);
		WebElement adultPersonRoom2 = getAdultPersonRoom();
		seldctbyVisibletext(adultPersonRoom2, adultPerRoom);
		WebElement childPerRoom2 = getChildPerRoom();
		seldctbyVisibletext(childPerRoom2, childPerRoom);
		WebElement search2 = getSearch();
		click(search2);
	}

}

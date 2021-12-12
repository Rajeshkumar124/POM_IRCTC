package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HotelPage extends GenericWrappers {
	public HotelPage waitHotelPage(long time) {
		threadSleep(time);
		return this;
	}
	public  HotelPage switchToHotelPage() {
		switchToLastWindow();
		return this;
	}
	public GuestUserLogin clickOnLogin() {
		clickByXpath("//a[text()='Login']");
		return new GuestUserLogin();
	}

	public HotelPage enterCityName(String data) {
		enterByXpath("//input[@id='filterText']", data);
		return this;
	}
	
	/*public HotelPage clickOnCity(String cityName) {
		clickByXpath("(//span[text()='"+cityName+"']");
		return this;
	}*/
	public HotelPage clickOnCity() {
		clickByXpath("(//div[@class='left_city'])[1]");
		return this;
	}
	public HotelPage clickOnCheckInDateField() {
		clickByXpath("//input[@name='dt12']");
		return this;
	}
	public HotelPage clickOnCheckInYearDropDown() {
		clickByXpath("//span[@class='owl-dt-control-button-arrow']");
		return this;
	}
	public HotelPage clickOnCheckInYear(String year) {
		clickByXpath("//span[text()='"+year+"']");
		return this;
	}
	public HotelPage clickOnCheckInMonth(String month) {
		clickByXpath("//span[text()='"+month+"']");
		return this;
	}
	public HotelPage clickOnCheckInDate(String date) {
		clickByXpath("//span[text()='"+date+"']");
		return this;
	}
	public HotelPage clickOnCheckOutDateField() {
		clickByXpath("//input[@name='dt13']");
		return this;
	}
	public HotelPage clickOnCheckOutYearDropDown() {
		clickByXpath("//span[@class='owl-dt-control-button-arrow']");
		return this;
	}
	public HotelPage clickOnCheckOutYear(String year) {
		clickByXpath("//span[text()='"+year+"']");
		return this;
	}
	public HotelPage clickOnCheckOutMonth(String month) {
		clickByXpath("//span[text()='"+month+"']");
		return this;
	}
	public HotelPage clickOnCheckOutDate(String date) {
		clickByXpath("//span[text()='"+date+"']");
		return this;
	}
	
	/*public HotelPage enterFromDate() {
		clickByName("dt12");
		clickByXpath("//span[@class='owl-dt-control-button-arrow']");
		clickByXpath("//span[text()='2022']");
		clickByXpath("//span[text()='May']");
		clickByXpath("//span[text()='24']");
		return this;

	}*/
 
	
	/*public HotelPage enterToDate() {
		clickByName("dt13");
		clickByXpath("//span[@class='owl-dt-control-button-arrow']");
		clickByXpath("//span[text()='2022']");
		clickByXpath("//span[text()='Jun']");
		clickByXpath("//span[text()='24']");
		
		return this;
	}*/
	public HotelPage clickOnRoomsOrGuests() {
		clickByXpath("//input[@name='guest']");
		return this;
	}
	public HotelPage selectNoOfRooms(String noOfRooms) {
		selectVisibleTextByXpath("//select[@name='hotelRoom']", noOfRooms);
		return this;
	}
	public HotelPage selectNoOfAdults(String noOfAdults) {
		selectVisibleTextByXpath("//select[@name='hotelAdult']", noOfAdults);
		return this;
	}
	public HotelPage selectNoOfChildren(String noOfChild) {
		selectVisibleTextByXpath("//select[@name='hotelChild']", noOfChild);
		return this;
	}
	
	
	/*public HotelPage EnterRoomGuestsDetails(String noOfRooms , String noOfAdults , String noOfChildren) {
		clickByXpath("//input[@id='user-data-wrapper-id']");
		selectVisibleTextByXpath("//select[@name='hotelRoom']", noOfRooms);
		selectVisibleTextByXpath("//select[@name='hotelAdult']", noOfAdults);
		selectVisibleTextByXpath("//select[@name='hotelChild']", noOfChildren);
		return this;
	}*/
	public HotelPage clickOnDone() {
		clickByXpath("//button[text()='Done']");
		return this;
	}
	
	public HotelListPage clickOnFindHotel() {
		clickByXpath("//button[@class='btn btn-md yellow-gradient home-btn']");
		return new HotelListPage();
	}
	
	
	
}

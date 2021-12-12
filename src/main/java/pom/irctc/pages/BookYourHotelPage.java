package pom.irctc.pages;

import wrappers.GenericWrappers;

public class BookYourHotelPage extends GenericWrappers {

	public static String hotelName;
	public static String price;
	public BookYourHotelPage switchToBookYourHotelPage() {
		switchToLastWindow();
		return this;
	}
	public BookYourHotelPage getHotelName() {
		hotelName = getTextByXpath("//div[@class='mid-searchpack']");
		return this;
	}
	public BookYourHotelPage getThePrice() {
		price = getTextByXpath("//span[contains(text(),'Amount Payable')]//following::strong)[1]");
		return this;
	}
	public PassangerDetailsPage clickOnContinueToBook() {
		clickByXpath("//button[@class='btn btn-radius-none yellow-gradient my-2']");
		return new PassangerDetailsPage();
	}
	public BookYourHotelPage waitInBookYourHotelPage(long time) {
		threadSleep(time);
		return this;
	}
	

	
	
	
	
	
	
	
	
	
}

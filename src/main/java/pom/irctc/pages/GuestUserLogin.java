package pom.irctc.pages;

import wrappers.GenericWrappers;

public class GuestUserLogin extends GenericWrappers {
	
	
	public GuestUserLogin clickOnGuestUserLogin() {
		clickByXpath("//a[text()='Guest User Login ']");
		return this;
	}
	public GuestUserLogin enterEmail(String data) {
		enterByXpath("//input[@name='email']", data);
		return this;
	}
	public GuestUserLogin enterMobileNumber(String data) {
		enterByXpath("//input[@name='mobileNo']", data);
		return this;
	}
	public HotelPage clickOnLogin() {
		clickByXpath("(//button[text()='Login'])[2]");
		return new HotelPage();
	}
	
}

package pom.irctc.pages;

import wrappers.GenericWrappers;

public class HomePage extends GenericWrappers{

	
	public RegistrationPage clickOnRegister() {
		clickByXpath("//a[text()=' REGISTER ']");
		return new RegistrationPage();
	}
	
	public HomePage mouseHoverOnHolidays() {
		mouseHoverByXpath("//a[@aria-label='Menu Holiday']");
		return this;
	}
	
	
	public HomePage mouseHoverOnStays() {
		mouseHoverByXpath("//span[text()='Stays']");
		return this;
	}
	
	
	public AccomodationPage clickOnLounge() {
		clickByXpath("//span[text()='Lounge']");
		return new AccomodationPage();
	}
	
}

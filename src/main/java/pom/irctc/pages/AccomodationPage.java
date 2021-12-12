package pom.irctc.pages;

import wrappers.GenericWrappers;

public class AccomodationPage extends GenericWrappers {

	public AccomodationPage waitInAccomodationPage(long time) {
		switchToLastWindow();
		return this;
	}
	
	public AccomodationPage switchToAccommodationPage() {
		switchToLastWindow();
		return this;
	}
	
	public AccomodationPage clickOnMenu() {
		clickByXpath("//a[@id='sidebarCollapse']");
		return this;
	}
	public CharterPage clickOnCharter() {
		clickByXpath("//a[text()='Charter']");
		return new CharterPage();
	}
	public FtrPage clickOnBookYourCoach() {
		clickByXpath("//a[text()='Book Your Coach/Train']");
		return new FtrPage();
	}
	public HotelPage clickOnHotelIcon() {
		clickByXpath("//span[text()='Hotels']");
		return new HotelPage();
	}
	
	
}

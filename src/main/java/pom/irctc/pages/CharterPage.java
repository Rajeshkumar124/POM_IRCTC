package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CharterPage extends GenericWrappers{
	
	public CharterPage scrollDownCharterPage() {
		pageDown();
		return this;
	}

	public CharterPage waitInCharterPage(long time) {
		threadSleep(time);
		return this;
	}
	public CharterPage clickOnEnquiryTab() {
		clickByXpath("//a[@id='enquiry-tab']");
		return this;
	}
	public CharterPage enterNameOfTheApplicant(String name) {
		enterByXpath("//input[@name='name']", name);
		return this;
	}
	public CharterPage enterNameOfOrganization(String orgainzation) {
		enterByXpath("//input[@name='organization']", orgainzation);
		return this;
	}
	public CharterPage enterAddress(String address) {
		enterByXpath("//input[@name='address']", address);
		return this;
	}
	public CharterPage enterMobile(String address) {
		enterByXpath("//input[@name='mobile']", address);
		return this;
	}
	public CharterPage enterEmail(String email) {
		enterByXpath("//input[@name='email']", email);
		return this;
	}
	public CharterPage selectRequestFor(String visibleText) {
		selectVisibleTextByXpath("//select[@name='requestFor']", visibleText);
		return this;
	}
	public CharterPage enterOrgaizationStation(String orgStation) {
		enterByXpath("//input[@name='originStation']", orgStation);
		return this;
	}
	public CharterPage enterDestinationStation(String desStation) {
		enterByXpath("//input[@name='destnStation']", desStation);
		return this;
	}
	public CharterPage clickOnDepartureDate() {
		clickByXpath("//input[@name='checkInDate']");
		return this;
	}
	public CharterPage selectDepartureYear(String year) {
		selectVisibleTextByXpath("(//select[@class='ng-untouched ng-pristine ng-valid'])[1]", year);
		return this;
	}
	public CharterPage selectDepartureMonth(String expected) {
		selectMonthByXpath("(//th[@class='date-month-year'])[1]", "(//span[@class='glyphicon glyphicon-chevron-right'])[1]", expected);
		return this;
	}
	public CharterPage clickOnDepartureDate(String date) {
		clickByXpath("//span[text()='"+date+"']");
		return this;
	}
	public CharterPage clickOnArrivalDate() {
		clickByXpath("//input[@name='checkOutDate']");
		return this;
	}
	public CharterPage selectArrivalYear(String year) {
		selectVisibleTextByXpath("(//th[@class='date-month-year'])[2]//select", year);
		 return this;
	}
	public CharterPage selectArrivalMonth(String expected) {
		selectMonthByXpath("(//th[@class='date-month-year'])[2]", "(//span[@class='glyphicon glyphicon-chevron-right'])[3]", expected);
		return this;
	}
	public CharterPage clickOnArrivalDate(String date) {
		clickByXpath("(//span[text()='"+date+"'])[2]");
		return this;
	}
	public CharterPage enterNumberOfTripDays(String noOfDays) {
		enterByXpath("//input[@name='durationPeriod']", noOfDays);
		return this;
	}
	public CharterPage enterNumberOfCoaches(String noOfCoaches) {
		enterByXpath("//input[@name='coachDetails']", noOfCoaches);
		return this;
	}
	public CharterPage enterNumberOfPassengers(String noOfPassengers) {
		enterByXpath("(//input[@name='numPassenger'])[1]", noOfPassengers);
		return this;
	}
	
	public CharterPage enterPurposeOfCharter(String data) {
		enterByXpath("//textarea[@name='charterPurpose']", data);
		return this;
	}
	public CharterPage enterAdditionalDetails(String data) {
		enterByXpath("//textarea[@name='services']" , data);
		return this;
	}
	public CharterPage clickOnSubmitErrorMessage() {
		clickByXpath("//button[@type='Submit']");
		return this;
	}
	public CharterPage verifyMobNotValidErrorMessage(String data) {
		verifyTextContainsByXpath("(//span[@class='ERR2'])[4]" ,data);
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

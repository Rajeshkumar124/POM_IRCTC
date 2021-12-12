package pom.irctc.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.SendKeysAction;

import wrappers.GenericWrappers;

public class FtrUserRegistration extends GenericWrappers {
	
	public FtrUserRegistration waitInFTRUserRegistration(long time) {
		threadSleep(time);
		return this;
	}
	public FtrUserRegistration enterUserName(String data) {
		enterByXpath("//input[@id='userId']", data);
		return this;
	}
	public FtrUserRegistration enterPassword(String data) {
		enterByXpath("//input[@id='password']", data);
		return this;
	}
	public FtrUserRegistration enterConfirmPassword(String data) {
		enterByXpath("//input[@id='cnfPassword']", data);
		return this;
	}
	public FtrUserRegistration selectSecurityQuestion(String visibleText) {
		selectVisibleTextByXpath("//select[@id='secQstn']", visibleText);
		return this;
	}
	
	public FtrUserRegistration enterSecurityQuestionAnswer(String data) {
		enterByXpath("//input[@id='secAnswer']", data);
		return this;
	}
	public FtrUserRegistration clickOnDateOfBirth() {
		driver.findElementByXPath("//input[@id='dateOfBirth']").click();
		return this;
	}
	public FtrUserRegistration waitUntilYearToBeVisible() {
		explicitWaitEelementToBeClickable("//select[@data-handler='selectYear']", 10);
		return this;
	}
	public FtrUserRegistration selectYear(String year) {
		selectVisibleTextByXpath("//select[@data-handler='selectYear']", year);
		return this;
	}
	public FtrUserRegistration selectMonth(String month) {
		selectVisibleTextByXpath("//select[@data-handler='selectMonth']", month);
		return this;
	}
	public FtrUserRegistration clickOnDate(String date) {
		clickByXpath("//a[text()='"+date+"']");
		return this;
	}
	
	public FtrUserRegistration clickOnGender(String Gender) {
		clickByXpath("//label[text()='"+Gender+"']");
		return this;
	}
	public FtrUserRegistration clickOnMaritialStatus(String maritialStatus) {
		clickByXpath("//label[text()='"+maritialStatus+"']");
		return this;
	}
	public FtrUserRegistration enterEmailID(String data) {
		enterByXpath("//input[@id='email']", data);
		return this;
	}
	public FtrUserRegistration selectOccupation(String visibletext) {
		selectVisibleTextByXpath("//select[@name='occupation']", visibletext);
		return this;
	}
	public FtrUserRegistration enterFirstName(String firstName) {
		enterByXpath("//input[@id='fname']", firstName);
		return this;
	}
	public FtrUserRegistration enterMiddlename(String middleName) {
		enterByXpath("//input[@id='mname']", middleName);
		return this;
	}
	public FtrUserRegistration enterLastName(String lastName) {
		enterByXpath("//input[@id='lname']", lastName
				);
		return this;
	}
	public FtrUserRegistration selectNationality(String visibleText) {
		selectVisibleTextByXpath("//select[@id='natinality']", visibleText);
		return this;
	}
	public FtrUserRegistration enterFlatNo(String flatNo) {
		enterByXpath("//input[@id='flatNo']" , flatNo);
		return this;
	}
	public FtrUserRegistration enterStreet(String streetName) {
		enterByXpath("//input[@id='street']", streetName);
		return this;
	}
	public FtrUserRegistration enterArea(String area) {
		enterByXpath("//input[@id='area']", area);
		return this;
	}
	public FtrUserRegistration selectCountry(String visibleText) {
		enterByXpath("//select[@id='country']", visibleText);
		return this;
	}
	public FtrUserRegistration enterMobileNumber(String mNumber) {
		enterByXpath("//input[@id='mobile']", mNumber);
		return this;
	}
	public FtrUserRegistration enterPincode(String pincode) {
		enterByXpath("//input[@id='pincode']", pincode);
		return this;
	}
	public FtrUserRegistration selectCity(String visibletext) {
		selectVisibleTextByXpath("//select[@id='city']", visibletext);
		return this;
	}
	public FtrUserRegistration selectPostOffice(String visibleText) {
		selectVisibleTextByXpath("//select[@id='postOffice']", visibleText);
		return this;
	}
	public FtrUserRegistration waitUntilCommunicationFieldclickable() {
		explicitWaitEelementToBeClickable("//input[@id='sameAddresses1']", 10);
		return this;
	}
	public FtrUserRegistration ClickOncommunicaction(String data) {
		if(data.equalsIgnoreCase("yes")) {
			clickByXpath("//input[@id='sameAddresses0']");
		}
		if(data.equalsIgnoreCase("No")) {
			clickByXpath("//input[@id='sameAddresses1']");
		}
		else {
			System.err.println("Give Yes or No option as inputs");
		}
		
		return this;
	}
	
	public FtrUserRegistration enterOfficeFlatNo(String offFlatNo) {
		enterByXpath("//input[@id='flatNoOffice']", offFlatNo);
		return this;
	}
	public FtrUserRegistration enterOfficeStreet(String offStreet) {
		enterByXpath("//input[@id='streetOffice']", offStreet);
		return this;
	}
	public FtrUserRegistration enterOffArea(String offArea) {
		enterByXpath("//input[@id='areaOffice']", offArea);
		return this;
	}
	public FtrUserRegistration selectOffCountry(String visibletext) {
		enterByXpath("//select[@id='countryOffice']", visibletext);
		return this;
	}
	public FtrUserRegistration enterOffMobileNumber(String offMNumber) {
		enterByXpath("//input[@id='mobileOffice']", offMNumber);
		return this;
	}
	public FtrUserRegistration enterOffPincode(String pincode) {
		enterByXpath("//input[@id='pincodeOffice']", pincode);
		return this;
	}
	public FtrUserRegistration selectOffCity(String visibleText) {
		selectVisibleTextByXpath("//select[@id='cityOffice']", visibleText);
		return this;
	}
	public FtrUserRegistration selectOffState(String visibletext) {
		selectVisibleTextByXpath("//select[@id='stateOffice']", visibletext);
		return this;
	}
	public FtrUserRegistration selectOffPostOffice(String visibleText) {
		selectVisibleTextByXpath("//select[@id='postOfficeOffice']", visibleText);
		return this;
	}
	public FtrUserRegistration waitUntillCreateProfileClickable() {
		explicitWaitEelementToBeClickable("//button[text()='Create Profile']", 10);
		return this;
	}
	public FtrUserRegistration clickOnCreateProfileError() {
		doubleClickByXpath("//button[text()='Create Profile']");
		return this;
	}
	
	public FtrUserRegistration FTRRegistrationpagedown() {
		// TODO Auto-generated method stub
		pageDown();
		return this;
	}
	public FtrUserRegistration waitInFtrUserRegistration(long time) {
		threadSleep(time);
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

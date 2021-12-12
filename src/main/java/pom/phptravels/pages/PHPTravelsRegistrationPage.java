package pom.phptravels.pages;

import wrappers.GenericWrappers;

public class PHPTravelsRegistrationPage extends GenericWrappers {
	
	public PHPTravelsRegistrationPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistrationPage.FirstName.Xpath"), data);
		return this;
	}
	public PHPTravelsRegistrationPage enterLastname(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistrationPage.LastName.Xpath"), data);
		return this;
	}
	public PHPTravelsRegistrationPage enterEmail(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistrationPage.Email.Xpath"), data);
		return this;
	}
	public PHPTravelsRegistrationPage clickOnCountryDropdown() {
		clickByXpath("//div[@class='selected-dial-code']");
		return this;
	}
	public PHPTravelsRegistrationPage waitUntillCountryDropDownOpens(String country) {
		explicitWaitEelementToBeClickable("//span[contains(text(), '"+country+"')]", 10);
		return this;
	}
	public PHPTravelsRegistrationPage clickOnCountryYouWant(String country) {
		clickByXpath("//span[contains(text(), '"+country+"')]");
		return this;
	}
	public PHPTravelsRegistrationPage enterPhoneNumber(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistrationPage.PhoneNumber.Xpath"), data);
		return this;
	}
	public PHPTravelsRegistrationPage enterCompanyName(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistrationPage.StreetAddress"), data);
		return this;
	}
	public PHPTravelsRegistrationPage enterStreetAddress(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistrationPage.StreetAddress"), data);
		return this;
	}
	public PHPTravelsRegistrationPage enterStreetAddress2(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistrationPage.StreetAddress2"), data);
		return this;
	}
	public PHPTravelsRegistrationPage enterCity(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistrationPage.City.Xpath"), data);
		return this;
	}
	public PHPTravelsRegistrationPage  enterState(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistrationPage.State.Xpath"), data);
		return this;
	}
	public PHPTravelsRegistrationPage enterPincode(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistrationPage.Pincode.Xpath"), data);
		return this;
	}
	public PHPTravelsRegistrationPage selectCountry(String visibleText) {
		selectVisibleTextByXpath(prop.getProperty("PHPTravelsRegistrationPage.SelectCountry.Xpath"), visibleText);
		return this;
	}
	public PHPTravelsRegistrationPage enterMobileNumber(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistrationPage.MobileNumber.Xpath"), data);
		return this;
	}
	public PHPTravelsRegistrationPage enterPassword(String data) {
		enterByXpath(prop.getProperty("PHPTravelsRegistrationPage.Password.Xpath"), "Rajeshh@123");
		return this;
	}
	public PHPTravelsRegistrationPage enterConfirmPassword(String data) {
		enterByXpath("//input[@id='inputNewPassword2']", data);
		return this;
	}

}

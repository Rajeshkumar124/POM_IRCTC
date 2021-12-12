package pom.irctc.pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import wrappers.GenericWrappers;

public class RegistrationPage extends GenericWrappers{
	
	
	public RegistrationPage enterUSerName(String data) {
		enterByXpath("//input[@id='userName']", data);
		return this;
	}
	
	public RegistrationPage enterPassword(String data) {
		enterByXpath("//input[@id='usrPwd']", data);
		return this;
	}
	public RegistrationPage enterConfirmPassword(String data) {
		
		enterByXpath("//input[@id='cnfUsrPwd']", data);
		return this;
	}
	public RegistrationPage clickOnPreferredLanguage() {
		clickByXpath("//span[@class='ui-dropdown-trigger-icon ui-clickable ng-tns-c66-14 pi pi-chevron-down']");
		return this;
	}
	public RegistrationPage clickOnLanguage() {
		clickByXpath("//li[@aria-label='English']");
		return this;
	}
	public RegistrationPage clickOnSecurityQuestion() {
		clickByXpath("//span[text()='Security Question']");
		return this;
	}
	public RegistrationPage clickOnSecurityQuestionOption() {
		clickByXpath("//span[text()='What was the name of your first school?']");
		return this;
	}
	public RegistrationPage enterSecurityQuestionAnswer(String data) {
		enterByXpath("//input[@placeholder='Security Answer']", data);
		return this;
	}
	public RegistrationPage clickOnContinue() {
		clickByXpath("//button[@class='search_btn train_Search ng-star-inserted']");
		return this;
	}
	public RegistrationPage enterFirstName(String data) {
		enterByXpath("//input[@id='firstName']" ,data);
		return this;
	}
	public RegistrationPage enterMiddleName(String data) {
		enterByXpath("//input[@id='middleName']", data);
		return this;
	}
	public RegistrationPage enterLastName(String data) {
		enterByXpath("//input[@id='lastname']", data);
		return this;
	}
	public RegistrationPage clickOnOccupation() {
		clickByXpath("//span[text()='Select Occupation']");
		return this;
	}
	public RegistrationPage clickOnOccupationOption(String occupation) {
		clickByXpath("//span[text()='"+occupation+"']");
		return this;
	}
	public RegistrationPage clickOnDateOfBirth() {
		clickByXpath("//input[@placeholder='Date Of Birth']");
		return this;
	}
	
	public RegistrationPage selectMonth(String month) {
		selectVisibleTextByXpath("//select[contains(@class,'ui-datepicker-month')]", month);
		return this;
	}
	public RegistrationPage selectYear(String year) {
		selectVisibleTextByXpath("//select[contains(@class,'ui-datepicker-year')]", year);
		return this;
	}
	public RegistrationPage clickOnDate(String date) {
		clickByXpath("//a[text()='"+date+"']");
		return this;
	}
	/*public RegistrationPage enterDateOfBirth(String month ,String year , String date) {
	clickByXpath("//input[@placeholder=\"Date Of Birth\"]");
		selectVisibleTextByXpath("//select[@class='ui-datepicker-month ng-tns-c59-10 ng-star-inserted']", month);
		selectVisibleTextByXpath("//select[@class='ui-datepicker-year ng-tns-c59-10 ng-star-inserted']", year);
		clickByXpath("//a[text()='"+date+"']");
		return this;
	}*/
	public RegistrationPage clickOnMaritialStatus(String maritialStatus) {
		clickByXpath("//label[text()='"+maritialStatus+"']");
		return this;
	}
	public RegistrationPage selectCountry(String data) {
		selectVisibleTextByXpath("//select[@formcontrolname='resCountry']", data);
		return this;
	}
	public RegistrationPage clickOnGender(String gender) {
		clickByXpath("//span[text()='"+gender+"']");
		return this;
	}
	public RegistrationPage enterEmail(String data) {
		enterByXpath("//input[@id='email']", data);
		return this;
	}
	public RegistrationPage enterMobileNumber(String data) {
		enterByXpath("//input[@id='mobile']", data);
		return this;
	}
	public RegistrationPage selectNationality(String data) {
		selectVisibleTextByXpath("//select[@formcontrolname='nationality']", data);
		return this;
	}
	public RegistrationPage enterResidenceFlatNo(String data) {
		enterByXpath("//input[@id='resAddress1']", data);
		return this;
	}
	public RegistrationPage enterResidenceStret(String data) {
		enterByXpath("//input[@id='resAddress2']" , data);
		return this;
	}
	public RegistrationPage enterResidenceArea(String data) {
		enterByXpath("//input[@id='resAddress3']", data);
		return this;
	}
	public RegistrationPage enterResidencePincode(String data) {
		enterByXpath("//input[@placeholder='Pin code']", data);
		return this;
	}
	public RegistrationPage enterResidenceMobileNumber(String data) {
		enterByXpath("//input[@id='resPhone']", data);
		return this;
	}
	public RegistrationPage selectResidenceCity(String data) {
		selectVisibleTextByXpath("//select[@formcontrolname='resCity']", data);
		return this;
	}
	public RegistrationPage selectResidencePostOffice(String data) {
		selectVisibleTextByXpath("//select[@formcontrolname='resPostOff']", data);
		return this;
	}
	public RegistrationPage clickOnNoOptionForCopyResidencetoofficeAddress() {
		clickByXpath("//label[text()='No']");
		return this;
	}
	public RegistrationPage enterOfficeFaltNo(String data) {
		enterByXpath("//input[@id='offAddress1']", data);
		return this;
	}
	public RegistrationPage enterOfficeStreet(String data) {
		enterByXpath("//input[@id='offAddress2']", data);
		return this;
	}
	public RegistrationPage enterOfficeArea(String data) {
		enterByXpath("//input[@id='offAddress3']", data);
		return this;
	}
	public RegistrationPage clickOnOfficeCountry() {
		clickByXpath("//span[contains(text(),'Select a Country')]");
		return this;
	}
	public RegistrationPage clickOnOfficeConutryName() {
		clickByXpath("//span[(text()='India')]");
		return this;
	}
	public RegistrationPage enterOfficePincode(String data) {
		enterByXpath("//input[@id='offPinCode']", data);
		return this;
	}
	public RegistrationPage enterOfficePhone(String data) {
		enterByXpath("//input[@id='offPhone']", data);
		return this;
	}
	public RegistrationPage clickOnTermsAndCondition() {
		clickByXpath("//input[contains(@class,'ng-dirty ng-valid ng-touched')]");
		return this;
	}

	

}

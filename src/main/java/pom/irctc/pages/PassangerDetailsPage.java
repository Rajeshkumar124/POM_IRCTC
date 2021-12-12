package pom.irctc.pages;

import wrappers.GenericWrappers;

public class PassangerDetailsPage extends GenericWrappers{

	
	public PassangerDetailsPage verifyHoteName(String data)
	{
		verifyTextByXpath("(//div[@class='mid-searchpack'])[1]", data);
		return this;
		
	}
	
	
	public PassangerDetailsPage selectTitle(String data) {
		selectVisibleTextByXpath("//select[@name='title']", data);
		return this;
	}
	public PassangerDetailsPage enterFirstName(String firstName) {
		enterByXpath("//input[@name='firstName']", firstName);
		return this;
	}
	
	public PassangerDetailsPage enterLastName(String lastName) {
		enterByXpath("//input[@name='lastName']", lastName);
		return this;
	}
	public PassangerDetailsPage selectCountry(String country) {
		selectVisibleTextByXpath("//select[@name='country']", country);
		return this;
	}
	public PassangerDetailsPage selectState(String state) {
		selectVisibleTextByXpath("//select[@name='state']", state);
		return this;
	}
	public PassangerDetailsPage enterMobileNumber(String mobileNumber) {
		enterByXpath("//input[@name='mobileNo']", mobileNumber);
		return this;
	}
	public PassangerDetailsPage enterEmailId(String email) {
		enterByXpath("//input[@name='email']", email);
		return this;
	}
	public PassangerDetailsPage selectGST(String GST) {
		selectVisibleTextByXpath("//select[@name='gst']", GST);
		return this;
	}
	public PassangerDetailsPage enterCompanyName(String data) {
		enterByXpath("//input[@name='companyName']", data);
		return this;
	}
	public PassangerDetailsPage enterCompanyAddress(String data) {
		enterByXpath("//input[@name='companyAddress']", data);
		return this;
	}
	/*public PassangerDetailsPage getHotelName() {
		getTextByXpath("//div[@class='mid-searchpack']");
		return this;
	}
	public PassangerDetailsPage getPrice() {
		getTextByXpath(" (//span[contains(text(),'Amount Payable')]//following::strong)[1]");
		return this;
	}*/
	public PassangerDetailsPage verifyPrice(String data) {
		verifyTextByXpath("//label[contains(text(), 'Amount Payable ')]//following::strong", data);
		return this;
	}
	
	public SummaryPage clickOnContinue() {
		clickByXpath("//button[text()='Continue']");
		return new SummaryPage();
	}
	public PassangerDetailsPage clickOnContinueErrorMessage() {
		clickByXpath("//button[text()='Continue']");
		return this;
	}
	public PassangerDetailsPage validationMessageForGSTLN() {
		getTextByXpath("//span[@class='ERR2']");
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

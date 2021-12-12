package pom.panapplication.pages;

import wrappers.GenericWrappers;

public class PanApplicationPage extends GenericWrappers {
	
	public PanApplicationPage selectTitle(String data) {
		selectVisibleTextByXpath("//select[@id='pan_title']", data);
		return this;
	}
	public PanApplicationPage enterFirstName(String data) {
		enterByXpath("//input[@id='pan_firstname']", data);
		return this;
	}
	public PanApplicationPage enterMiddleName(String data) {
		enterByXpath("//input[@id='pan_middlename']", data);
		return this;
	}
	public PanApplicationPage enterLastName(String data) {
		enterByXpath("//input[@id='pan_lastname']", data);
		return this;
	}
	public PanApplicationPage enterFatherFirstName(String data) {
		enterByXpath("//input[@id='pan_fatherfirstname']", data);
		return this;
	}
	public PanApplicationPage enterFatherMiddleName(String data) {
		enterByXpath("//input[@id='pan_fathermiddlename']", data);
		return this;
	}
	public PanApplicationPage enterFatherLastName(String data) {
		enterByXpath("//input[@id='pan_fatherlastname']", data);
		return this;
	}
	public PanApplicationPage enterMobileNumber(String data) {
		enterByXpath("//input[@id='pan_mobilenumber']", data);
		return this;
	}
	public PanApplicationPage enterEmailID(String data) {
		enterByXpath("//input[@id='pan_email']", data);
		return this;
	}
	public PanApplicationPage selectSourceOfIncome(String visibleText) {
		selectVisibleTextByXpath("//input[@id='pan_sourceofincome']", visibleText);
		return this;
	}
	public PanApplicationPage clickOnOffice() {
		clickByXpath("//input[@id='office']");
		return this;
	}
	public PanApplicationPage enterDateOfBirth(String date) {
		enterByXpath("//input[@id='pan_dob']", date);
		return this;
	}
	public PanApplicationPage enterResHouseNo(String data) {
		enterByXpath("//input[@id='pan_addressline1']" , data);
		return this;
	}
	public PanApplicationPage enterResArea(String data) {
		enterByXpath("//input[@id='pan_addressline2']", data);
		return this;
	}
	public PanApplicationPage enterResCity(String data) {
		enterByXpath("//input[@id='pan_cityname']", data);
		return this;
	}
	public PanApplicationPage selectResState(String visibleText) {
		selectVisibleTextByXpath("//select[@id='pan_state']", visibleText);
		return this;
	}
	public PanApplicationPage enterResPincode(String data) {
		enterByXpath("//input[@id='pan_pincode']", data);
		return this;
	}
	public PanApplicationPage pageDownPanApplicationPage() {
		pageDown();
		return this;
	}
	public PanApplicationPage selectResCountry(String visibleText) {
		selectVisibleTextByXpath("//select[@id='pan_country']", visibleText);
		return this;
	}
	public PanApplicationPage enterOffName(String data) {
		enterByXpath("//input[@id='pan_officename']", data);
		return this;
	}
	public PanApplicationPage enterOffHouseNo(String data) {
		enterByXpath("//input[@id='pan_officeaddressline1']", data);
		return this;
	}
	public PanApplicationPage enterOffArea(String data) {
		enterByXpath("//input[@id='pan_officeaddressline2']", data);
		return this;
	}
	public PanApplicationPage enterOffCity(String data) {
		enterByXpath("//input[@id='pan_officecityname']", data);
		return this;
	}
	public PanApplicationPage selectOffState(String state) {
		selectVisibleTextByXpath("//select[@id='pan_officestate']", state);
		return this;
	}
	public PanApplicationPage enterOffPincode(String pincode) {
		enterByXpath("//input[@id='pan_officepincode']", pincode);
		return this;
	}
	public PanApplicationPage selectOffCountry(String country) {
		enterByXpath("//select[@id='pan_officecountry']", country);
		return this;
	}
	public PanApplicationPage selectIdentityProof(String visibleText) {
		selectVisibleTextByXpath("//select[@id='pan_identityproof']", visibleText);
		return this;
	}
	public PanApplicationPage selectAddressProof(String visibleText) {
		selectVisibleTextByXpath("//select[@id='pan_addressproof']", visibleText);
		return this;
	}
	public PanApplicationPage selectDOBProof(String visibleText) {
		selectVisibleTextByXpath("//select[@id='pan_DOBproof']", visibleText);
		return this;
	}
	public PanApplicationPage selectAadharProof(String visibleText) {
		selectVisibleTextByXpath("//select[@id='pan_aadhaarproof']", visibleText);
		return this;
	}
	public PanApplicationPage selectOfficeAddressProof(String visibleText) {
		selectVisibleTextByXpath("//select[@id='pan_officeaddressproof']", visibleText);
		return this;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}

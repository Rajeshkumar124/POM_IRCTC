package pom.indianfrr.pages;

import wrappers.GenericWrappers;

public class IndianFrroRegistrationPage extends GenericWrappers{
	
	public IndianFrroRegistrationPage scrollDownIndianFRROPage() {
		pageDown();
		return this;
	}

	public IndianFrroRegistrationPage waitInIndianFrroRegistrationPage(long time) {
		threadSleep(time);
		return this;
	}
	public IndianFrroRegistrationPage enterUserID(String userID) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.UserId.Xpath"), userID);
		return this;
	}
	public IndianFrroRegistrationPage enterPassword(String password) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.Password.Xpath"), password);
		return this;
	}
	public IndianFrroRegistrationPage enterConfirmPassword(String confirmPassword) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.ConfirmPassword.Xpath"), confirmPassword);
		return this;
	}
	public IndianFrroRegistrationPage selectSecurityQuestion(String visibleText) {
		selectVisibleTextByXpath(prop.getProperty("IndianFRRORegistration.SelectnSecurityQuestion.Xpath"), visibleText);
		return this;
		
	}
	public IndianFrroRegistrationPage enterSecurityQuestionAnswer(String secAnswer) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.EnterSecurityQuestionAnswer.Xpath"), secAnswer);
		return this;
	}
	public IndianFrroRegistrationPage enterName(String name) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.EnterName.Xpath"), name);
		return this;
	}
	
	public IndianFrroRegistrationPage selectGender(String visibleText) {
		selectVisibleTextByXpath(prop.getProperty("IndianFRRORegistration.SelectGender.Xpath"), visibleText);
		return this;
	}
	public IndianFrroRegistrationPage enterDateofBirth(String dateOfBirth) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.EnterDateOfBirth.Xpath"), dateOfBirth);
		return this;
	}
	public IndianFrroRegistrationPage enterDesignation(String designation) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.EnterDesignation.Xpath"), designation);
		return this;
	}
	public IndianFrroRegistrationPage enterEmailID(String emailID) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.EmailId.Xpath.Xpath"), emailID);
		return this;
	}
	public IndianFrroRegistrationPage enterMobileNumber(String mobileNumber) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.EnterMobileId.Xpath"), mobileNumber);
		return this;
	}
	public IndianFrroRegistrationPage enterPhoneNumber(String phoneNumber) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.EnterPhoneNumber.Xpath"), phoneNumber);
		return this;
	}
	public IndianFrroRegistrationPage selectNationality(String visibleText) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.SelectNationality.Xpath"), visibleText);
		return this;
	}
	public IndianFrroRegistrationPage enterResidenceName(String resName) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.ResidenceName.Xpath"), resName);
		return this;
	}
	public IndianFrroRegistrationPage enterResidenccapacity(String resCapacity) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.Capacity.Xpath"), resCapacity);
		return this;
	}
	public IndianFrroRegistrationPage enterResidenceAddress(String resAddress) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.Address.Xpath"), resAddress);
		return this;
	}
	public IndianFrroRegistrationPage selectResidenceState(String visibleText) {
		selectVisibleTextByXpath(prop.getProperty("IndianFRRORegistration.ResidenceState.Xpath"), visibleText);
		return this;
	}
	
	public IndianFrroRegistrationPage selectResidenceDistrict(String visibleText) {
		selectVisibleTextByXpath(prop.getProperty("IndianFRRORegistration.ResidenceDistrict.Xpath"), visibleText);
		return this;
	}
	public IndianFrroRegistrationPage selectResidenceFrroDescription(String visicleText){
		selectVisibleTextByXpath(prop.getProperty("IndianFRRORegistration.ResidenceFRRODescription.Xpath"), visicleText);
		return this;
	}
	public IndianFrroRegistrationPage selectResidencAccommodationType(String visibleText) {
		selectVisibleTextByXpath(prop.getProperty("IndianFRRORegistration.ResidenceAccomodationType.Xpath"), visibleText);
		return this;
	}
	public IndianFrroRegistrationPage selectResidenceAccomodationGrade(String visibleText) {
		selectVisibleTextByXpath(prop.getProperty("IndianFRRORegistration.AccomodationGrade.Xpath"), visibleText);
		return this;
	}
	public IndianFrroRegistrationPage enterResidenceEmail(String email) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.ResideceEmail.Xpath"), email);
		return this;
	}
	public IndianFrroRegistrationPage enterResidenceMobileNumber(String data) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.ResidenceMobileNumber.Xpath"), data);
		return this;
	}
	public IndianFrroRegistrationPage enterResidencePhoneNumber(String phoneNumber) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.ResidencePhoneNumber.Xpath"), phoneNumber);
		return this;
	}
	public IndianFrroRegistrationPage enterOwnerName(String name) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.OwnerName.Xpath"), name);
		return this;
	}
	public IndianFrroRegistrationPage enterOwnerAddress(String address) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.OwnerAddress.Xpath"), address);
		return this;
	}
	public IndianFrroRegistrationPage selectOwnerState(String data) {
		selectVisibleTextByXpath(prop.getProperty("IndianFRRORegistration.OwnerState.Xpath"), data);
		return this;
	}
	/*public IndianFrroRegistrationPage waitUntilOwnerDistrictDropDownSelectable() {
		explicitWaitEelementToBeSelectable("//select[@name='citydistr_o']", 10);
		return this;
	}*/
	public IndianFrroRegistrationPage selectOwnerDistrict(String data) {
		selectVisibleTextByXpath(prop.getProperty("IndianFRRORegistration.OwnerDistrict.Xpath"), data);
		return this;
	}
	public IndianFrroRegistrationPage enterOwnerEmailID(String emailID) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.OwnerEmailId.Xpath"), emailID);
		return this;
	}
	public IndianFrroRegistrationPage enterOwnerPhoneNumber(String phoneNumber) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.OwnerPhoneNumber.Xpath"), phoneNumber);
		return this;
	}
	public IndianFrroRegistrationPage enterOwnerMobileNumber(String mobileNumber) {
		enterByXpath(prop.getProperty("IndianFRRORegistration.OwnerMobileNumber.Xpath"), mobileNumber);
		return this;
	}
	public IndianFrroRegistrationPage WaitUntillOwnerNameVisible() {
		explicitWaitEelementToBeClickable(prop.getProperty("IndianFRRORegistration.OwnerName.Xpath"), 10);
		return this;
	}
	public IndianFrroRegistrationPage clickOnAdd(){
		clickByXpath(prop.getProperty("IndianFRRORegistration.Add.Xpath"));
		return this;
	}
	public IndianFrroRegistrationPage clickOnSubmit() {
		clickByXpath(prop.getProperty("IndianFRRORegistration.submit.Xpath"));
		return this;
	}
	
	
	

	
	
	
}

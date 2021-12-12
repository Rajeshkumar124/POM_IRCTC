package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FaceBookSignUpPage extends GenericWrappers {

	public FaceBookSignUpPage enterFirstName(String data) {
		enterByXpath(prop.getProperty("FaceBookSignUpPage.FirstName.XPath"), data);
		return this;
	}
	public FaceBookSignUpPage enterSurName(String data) {
		enterByXpath(prop.getProperty("FaceBookSignUpPage.LastName.Xpath"), data);
		return this;
	}
	public FaceBookSignUpPage enterEmailORPhoneNumber(String data) {
		enterByXpath(prop.getProperty("FaceBookSignupPage.Email.Xpath"), data);
		return this;
	}
	public FaceBookSignUpPage reEnterEmail(String data) {
		enterByXpath(prop.getProperty("FaceBookSignupPage.ReEnterEnail.Xpath"), data);
		return this;
	}
	public FaceBookSignUpPage enterPassword(String data) {
		enterByXpath(prop.getProperty("FaceBookSignupPage.Password.Xpath"), data);
		return this;
	}
	public FaceBookSignUpPage selectDate(String date) {
		selectVisibleTextByXpath(prop.getProperty("FaceBookSignUpPage.Date.Xpath"), date);
		return this;
	}
	public FaceBookSignUpPage selectMonth(String month) {
		selectVisibleTextByXpath(prop.getProperty("FaceBookSignupPage.Month.Xpath"), month);
		return this;
	}
	public FaceBookSignUpPage selectYear(String year) {
		selectVisibleTextByXpath(prop.getProperty("FaceBookSignupPage.Year.Xpath"), year);
		return this;
	}
	public FaceBookSignUpPage clickOnGender(String data) {
		clickByXpath(prop.getProperty("FaceBookSignupPage.Gender.Xpath"));
		return this;
	}
	
	

	
}

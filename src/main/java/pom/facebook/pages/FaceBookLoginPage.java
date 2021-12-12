package pom.facebook.pages;

import wrappers.GenericWrappers;

public class FaceBookLoginPage extends GenericWrappers {
	
	public FaceBookLoginPage enterEmailORPhoneNumber(String data) {
		enterByXpath(prop.getProperty("FaceBookLogInPage.PhoneNumber.XPath"), data);
		return this;
	}
	public FaceBookLoginPage enterPassword(String data) {
		enterByXpath(prop.getProperty("FaceBookLogIn.Password.XPat"), data);
		return this;
	}
	public FaceBookSignUpPage clickOnCreateNewAccount() {
		clickByXpath(prop.getProperty("FaceBookLogInPage.CreateAAccount.XPath"));
		return new FaceBookSignUpPage();
	}

}

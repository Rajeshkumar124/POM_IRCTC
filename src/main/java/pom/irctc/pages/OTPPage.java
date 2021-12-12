package pom.irctc.pages;

import wrappers.GenericWrappers;

public class OTPPage extends GenericWrappers {

	public OTPPage clickOnVerify() {
		clickByXpath("//button[text()='Verify']");
		return this;
	}
	public OTPPage getOTPErrorMessage() {
		String OTPErroMessage=getTextByXpath("(//span[@class='ERR2'])[5]");
		return this;
	}
	
}
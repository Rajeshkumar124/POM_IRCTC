package pom.irctc.pages;

import wrappers.GenericWrappers;

public class SummaryPage extends GenericWrappers {

	public SummaryPage clickOnIAgree() {
		clickByXpath("//label[@class='check-box d-inline-block mr-1']");
		return this;
	}
	public OTPPage clickOnMakePayment() {
		clickByXpath("//button[text()='Make Payment']");
		return new OTPPage() ;
		
	}
	
	
}

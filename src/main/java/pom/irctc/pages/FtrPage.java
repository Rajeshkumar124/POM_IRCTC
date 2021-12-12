package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FtrPage extends GenericWrappers {
	
	public FtrPage switchToFTRPage() {
		switchToLastWindow();
		return this;
	}
	public FtrUserRegistration clickOnNewUserSignup() {
		clickByXpath("//a[text()='New User? Signup']");
		return new FtrUserRegistration();
	}
}

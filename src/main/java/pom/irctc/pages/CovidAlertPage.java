package pom.irctc.pages;

import wrappers.GenericWrappers;

public class CovidAlertPage extends GenericWrappers {
	
	
	public HomePage clickOnOk() {
		clickByXpath("//button[@class='btn btn-primary']");
		return new HomePage();
	}
	

}

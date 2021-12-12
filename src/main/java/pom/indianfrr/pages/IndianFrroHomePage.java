package pom.indianfrr.pages;

import wrappers.GenericWrappers;

public class IndianFrroHomePage extends GenericWrappers {
	
	public IndianFrroRegistrationPage clickOnRegister() {
		clickByXpath(prop.getProperty("IndianFRROHomePage.Register.Xpath"));
		return new IndianFrroRegistrationPage();
	}

}

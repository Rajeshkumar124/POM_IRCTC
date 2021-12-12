package pom.phptravels.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.phptravels.pages.PHPTravelsRegistrationPage;
import wrappers.ProjectWrappers;

public class TC009 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC009";
		testCaseDescription="To Verify PHP travels signup";
		author="Rajeshkumar";
		category="Functional";
		browserName="chrome";
		appName="PHP Travels";
	}
	@Test
	public void phpTravelsSignup() {
		new PHPTravelsRegistrationPage()
		.enterFirstName("tessttt")
		.enterLastname("testttt")
		.enterEmail("teeesttt@gmail.com")
		.clickOnCountryDropdown()
		.waitUntillCountryDropDownOpens("United States")
		.clickOnCountryYouWant("United States")
		.enterPhoneNumber("9876543210")
		.enterCompanyName("testtt")
		.enterStreetAddress("sdfs")
		.enterStreetAddress2("sddfaf")
		.enterCity("tseewr")
		.enterState("test")
		.enterPincode("34525")
		.selectCountry("India")
		.enterMobileNumber("98765432")
		.enterPassword("Rajeshhhhh@133")
		.enterConfirmPassword("Rajeshhhhh@133");
	}

}

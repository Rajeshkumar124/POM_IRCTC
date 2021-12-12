package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC002 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName="TC002";
		testCaseDescription="Verify IRCTC Book your coach";
		author="Rajeshkumar";
		browserName="chrome";
		category="Functional";
		appName="IRCTC";
	}
	
	@Test
	public void bookYourCoach()  {
		
		
		new CovidAlertPage()
		.clickOnOk()
		
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToAccommodationPage()
		.clickOnMenu()
		.clickOnBookYourCoach()
		.switchToFTRPage()
		.clickOnNewUserSignup()
		.enterUserName("rajeshhhhh")
		.enterPassword("Rajesh@12334")
		.enterConfirmPassword("Rajesh@12334")
		.selectSecurityQuestion("What is your pet name?")
		.enterSecurityQuestionAnswer("testt")
		.clickOnDateOfBirth()
		.waitUntilYearToBeVisible()
		.selectYear("2000")
		.selectMonth("Mar")
		.clickOnDate("12")
		.clickOnMaritialStatus("Male")
		.clickOnMaritialStatus("UnMarried")
		.enterEmailID("testtttt@gmail.com")
		.selectOccupation("Public")
		.enterFirstName("Public")
		.enterMiddlename("testtt")
		.enterLastName("testttt")
		.selectNationality("Indian")
		.enterFlatNo("1234")
		.enterStreet("1234")
		.enterArea("12334")
		.selectCountry("India")
		.enterPincode("522019")
		.enterMobileNumber("98765443210")
		.FTRRegistrationpagedown()
		.selectPostOffice("Nimmagaddavaripalem B.O")
		.FTRRegistrationpagedown()
		.waitUntilCommunicationFieldclickable()
		.ClickOncommunicaction("No")
		.waitInFtrUserRegistration(3000)
		.enterOfficeFlatNo("1234")
		.enterOfficeStreet("123244")
		.enterOffArea("test")
		.selectOffCountry("India")
		.enterOffPincode("522019")
		.enterOffMobileNumber("9876543210")
		.selectOffPostOffice("Prathipadu S.O (Guntur)")
		.FTRRegistrationpagedown()
		.waitInFtrUserRegistration(3000)
		.clickOnCreateProfileError();
		

	}
	
	
}

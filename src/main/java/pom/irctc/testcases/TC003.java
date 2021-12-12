package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC003 extends ProjectWrappers{

	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC003";
		testCaseDescription="To Verify saloon mandatory check";
		author="Rajeshkumar";
		category="Functional";
		browserName="chrome";
		appName="IRCTC";
	}
	@Test
	public void saloonMandatoryCheck() {
		
		new CovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToAccommodationPage()
		.clickOnMenu()
		.clickOnCharter()
		.clickOnEnquiryTab()
		.enterNameOfTheApplicant("testt")
		.enterNameOfOrganization("testt")
		.enterAddress("testt")
		.enterMobile("98765")
		.scrollDownCharterPage()
		.enterEmail("rajeshhh@gmail.com")
		.selectRequestFor("Saloon Charter")
		.enterOrgaizationStation("viz")
		.enterDestinationStation("gnt")
		.clickOnDepartureDate()
		.waitInCharterPage(3000)
		.selectDepartureYear("2022")
		.waitInCharterPage(3000)
		.selectDepartureMonth("Dec")
		.waitInCharterPage(2000)
		.clickOnDepartureDate("3")
		.clickOnArrivalDate()
		.waitInCharterPage(3000)
		.selectArrivalYear("2022")
		.waitInCharterPage(3000)
		.selectArrivalMonth("Dec")
		.waitInCharterPage(5000)
		.clickOnArrivalDate("15")
		.enterNumberOfTripDays("12")
		.enterNumberOfCoaches("1")
		.enterNumberOfPassengers("12")
		.enterPurposeOfCharter("12")
		.enterAdditionalDetails("1233")
		.clickOnSubmitErrorMessage()
		.verifyMobNotValidErrorMessage("Mobile no. not valid");
		
		
	}
	
	
	
}

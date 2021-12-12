package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC005 extends ProjectWrappers {
	
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC004";
		testCaseDescription="Book your hotel GST validation";
		author="Rajeshkumar";
		category="Functional";
		browserName="chrome";
		appName="IRCTC";
	}
	
	@Test
	public void bookYourHotelsGSTValidation() {
		new CovidAlertPage()
		.clickOnOk()
		.mouseHoverOnHolidays()
		.mouseHoverOnStays()
		.clickOnLounge()
		.switchToAccommodationPage()
		.clickOnHotelIcon()
		.switchToHotelPage()
		.clickOnLogin()
		.clickOnGuestUserLogin()
		.enterEmail("testttt@gmail.com")
		.enterMobileNumber("9876543210")
		.clickOnLogin()
		.waitHotelPage(3000)
		.enterCityName("hyderabad")
		.waitHotelPage(3000)
		.clickOnCity()
		.clickOnCheckInDateField()
		.waitHotelPage(3000)
		.clickOnCheckInYearDropDown()
		.waitHotelPage(3000)
		.clickOnCheckInYear("2021")
		.waitHotelPage(3000)
		.clickOnCheckInMonth("Dec")
		.waitHotelPage(3000)
		.clickOnCheckInDate("22")
		.clickOnCheckOutDateField()
		.waitHotelPage(3000)
		.clickOnCheckOutYearDropDown()
		.waitHotelPage(3000)
		.clickOnCheckOutYear("2021")
		.waitHotelPage(3000)
		.clickOnCheckOutMonth("Dec")
		.waitHotelPage(3000)
		.clickOnCheckOutDate("23")
		.clickOnRoomsOrGuests()
		.waitHotelPage(3000)
		.selectNoOfRooms("1")
		.selectNoOfChildren("2")
		.clickOnDone()
		.clickOnFindHotel()
		.clickOnTopHotelDisplayed()
		.switchToBookYourHotelPage()
		.getHotelName()
		.getThePrice()
		.clickOnContinueToBook()
		.selectTitle("Mr")
		.enterFirstName("Rajesh")
		.enterLastName("kumar")
		.selectCountry("India")
		.selectState("ANDHRA PRADESH")
		.selectGST("Yes")
		.enterCompanyName("test")
		.enterCompanyAddress("test")
		.clickOnContinueErrorMessage()
		.validationMessageForGSTLN();
		
	}

}

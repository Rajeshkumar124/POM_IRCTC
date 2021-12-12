package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.irctc.pages.BookYourHotelPage;
import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC004 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC004";
		testCaseDescription="Book your hotel OTP validation";
		author="Rajeshkumar";
		category="Functional";
		browserName="chrome";
		appName="IRCTC";
	}
	
	
	
	
	@Test
	public void bookYourHotelsOTPValidation() {
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
		.enterCityName("bangalore")
		.waitHotelPage(3000)
		.clickOnCity()
		.clickOnCheckInDateField()
		.waitHotelPage(3000)
		.clickOnCheckInYearDropDown()
		.waitHotelPage(3000)
		.clickOnCheckInYear("2021")
		.waitHotelPage(3000)
		.clickOnCheckInMonth("Nov")
		.waitHotelPage(3000)
		.clickOnCheckInDate("29")
		.clickOnCheckOutDateField()
		.waitHotelPage(3000)
		.clickOnCheckOutYearDropDown()
		.waitHotelPage(3000)
		.clickOnCheckOutYear("2021")
		.waitHotelPage(3000)
		.clickOnCheckOutMonth("Dec")
		.waitHotelPage(3000)
		.clickOnCheckOutDate("6")
		.clickOnRoomsOrGuests()
		.waitHotelPage(3000)
		.selectNoOfRooms("1")
		.selectNoOfChildren("2")
		.clickOnDone()
		.clickOnFindHotel()
		.waitInHotelListPage(5000)
		.clickOnTopHotelDisplayed()
		.switchToBookYourHotelPage()
		.waitInBookYourHotelPage(5000)
		.getHotelName()
		.getThePrice()
		.clickOnContinueToBook()
		.verifyHoteName(BookYourHotelPage.hotelName)
		.verifyPrice(BookYourHotelPage.price)
		.selectTitle("Mr")
		.enterFirstName("Rajesh")
		.enterLastName("kumar")
		.selectCountry("India")
		.selectState("ANDHRA PRADESH")
		.selectGST("No")
		.clickOnContinue()
		.clickOnIAgree()
		.clickOnMakePayment()
		.clickOnVerify()
		.getOTPErrorMessage()
		.closeAllBrowsers();
		
	}
}

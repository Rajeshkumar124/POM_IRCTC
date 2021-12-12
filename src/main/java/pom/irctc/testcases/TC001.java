package pom.irctc.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pom.irctc.pages.CovidAlertPage;
import wrappers.ProjectWrappers;

public class TC001 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC001";
		testCaseDescription="To Verify Irctc registration for the new user";
		author="Rajeshkumar";
		category="Functional";
		browserName="chrome";
		appName="IRCTC";
	}
	
	@Test
	public void irctcRegistration() {
		new CovidAlertPage()
		.clickOnOk()
		.clickOnRegister()
		.enterUSerName("Rajesh12344546456")
		.enterPassword("Secret123")
		.enterConfirmPassword("Secret123")
		.clickOnPreferredLanguage()
		.clickOnLanguage()
		.clickOnSecurityQuestion()
		.clickOnSecurityQuestionOption()
		.enterSecurityQuestionAnswer("testtt")
		.clickOnContinue()
		.enterFirstName("rajesh")
		.enterMiddleName("kumar")
		.enterLastName("kumar")
		.clickOnOccupation()
		.clickOnOccupationOption("PRIVATE")
		.clickOnDateOfBirth()
		.selectYear("1997")
		.selectMonth("May")
		.clickOnDate("12")
		.clickOnMaritialStatus("Unmarried")
		.selectCountry("India")
		.clickOnGender("Male")
		.enterEmail("rajeshhhh@gmail.com")
		.selectCountry("India")
		.clickOnContinue()
		.enterResidenceFlatNo("1234")
		.enterResidenceStret("1234")
		.enterResidenceArea("test")
		.enterResidencePincode("522019")
		.enterResidenceMobileNumber("9876543210")
		.selectResidenceCity("GUNTUR")
		.selectResidencePostOffice("Nadimpalem B.O")
		.clickOnNoOptionForCopyResidencetoofficeAddress()
		.enterOfficeFaltNo("1234")
		.enterOfficeArea("1234")
		.enterOfficeStreet("1234")
		.clickOnOfficeCountry()
		.clickOnOfficeConutryName()
		.enterOfficePincode("522019")
		.enterOfficePhone("9876543210");
		
	}

}

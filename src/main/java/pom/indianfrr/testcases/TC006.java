package pom.indianfrr.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.indianfrr.pages.IndianFrroHomePage;
import wrappers.ProjectWrappers;

public class TC006 extends ProjectWrappers {


	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC006";
		testCaseDescription="To Verify Indian Frr registration";
		author="Rajeshkumar";
		category="Functional";
		browserName="chrome";
		appName="Indian FRRO";
	}
	@Test
	public void formC() {
		new IndianFrroHomePage()
		.clickOnRegister()
		.enterUserID("rajeshhh123222")
		.enterPassword("Rajeshhhh@123")
		.enterConfirmPassword("Rajeshhhh@123")
		.selectSecurityQuestion("What is your favorite author?")
		.enterSecurityQuestionAnswer("testtt")
		.enterName("testtt")
		.selectGender("Male")
		.enterDateofBirth("12/07/1998")
		.enterDesignation("test")
		.enterEmailID("rajeshkumarginjupalli@gmail.com")
		.enterMobileNumber("9234567890")
		.enterPhoneNumber("92345567890")
		.selectNationality("INDIA")
		.enterResidenceName("testtt")
		.enterResidenccapacity("5")
		.enterResidenceAddress("testttt")
		.selectResidenceState("ANDHRA PRADESH")
		.waitInIndianFrroRegistrationPage(3000)
		.selectResidenceDistrict("GUNTUR")
		.selectResidenceFrroDescription("FRO GUNTUR URBAN")
		.selectResidencAccommodationType("Hotel")
		.selectResidenceAccomodationGrade("Three Star")
		.enterResidenceEmail("testttt@gmail.com")
		.enterResidenceMobileNumber("9876543210")
		.enterResidencePhoneNumber("9876543210")
		.waitInIndianFrroRegistrationPage(3000)
		.scrollDownIndianFRROPage()
		.enterOwnerName("test")
		.enterOwnerAddress("testtt")
		.selectOwnerState("ANDHRA PRADESH")
		.waitInIndianFrroRegistrationPage(3000)
		.selectOwnerDistrict("GUNTUR")
		.enterOwnerEmailID("testttt@gmail.com")
		.enterOwnerPhoneNumber("9876543210")
		.enterOwnerMobileNumber("9876543210")
		.clickOnAdd()
		.waitInIndianFrroRegistrationPage(3000)
		.enterOwnerName("test")
		.enterOwnerAddress("testtt")
		.selectOwnerState("ANDHRA PRADESH")
		.waitInIndianFrroRegistrationPage(3000)
		.selectOwnerDistrict("GUNTUR")
		.enterOwnerEmailID("rajeshkumarginjupalli@gma.com")
		.enterOwnerPhoneNumber("9876543210")
		.enterOwnerMobileNumber("9876543210")
		.clickOnAdd()
		.waitInIndianFrroRegistrationPage(3000)
		.enterOwnerName("abcdefd")
		.enterOwnerAddress("testtt")
		.selectOwnerState("ANDHRA PRADESH")
		.waitInIndianFrroRegistrationPage(3000)
		.selectOwnerDistrict("GUNTUR")
		.enterOwnerEmailID("testttt@gmail.com")
		.enterOwnerPhoneNumber("9876543210")
		.enterOwnerMobileNumber("9876543210")
		.clickOnSubmit();
	}
}

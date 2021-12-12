package pom.facebook.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.facebook.pages.FaceBookLoginPage;
import wrappers.ProjectWrappers;


public class TC007 extends ProjectWrappers {

	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC007";
		testCaseDescription="To Verify facebook signup";
		author="Rajeshkumar";
		category="Smoke";
		browserName="chrome";
		appName="facebook";
	}
	
	@Test
	public void faceBookSignUp() {
		
		new FaceBookLoginPage()
		.clickOnCreateNewAccount()
		.enterFirstName("testt")
		.enterSurName("testtt")
		.enterEmailORPhoneNumber("testtt@gmail.com")
		.reEnterEmail("testtt@gmail.com")
		.enterPassword("rajesh@123")
		.selectDate("2")
		.selectMonth("Jan")
		.selectYear("2000")
		.clickOnGender("Male");
		
	}

}

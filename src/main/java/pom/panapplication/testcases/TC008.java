package pom.panapplication.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pom.panapplication.pages.PanApplicationPage;
import wrappers.ProjectWrappers;



public class TC008 extends ProjectWrappers {
	@BeforeClass
	public void beforeClass() {
		testCaseName = "TC008";
		testCaseDescription="To Verify pan card application";
		author="Rajeshkumar";
		category="Functional";
		browserName="chrome";
		appName="PAN Application";
	}
	@Test
	public void panApplication() {
		new PanApplicationPage()
		.selectTitle("MR.")
		.enterFirstName("testtt")
		.enterMiddleName("testtt")
		.enterLastName("testtt")
		.enterFatherFirstName("test")
		.enterFatherMiddleName("testt")
		.enterFatherLastName("testtt")
		.enterMobileNumber("9876543210")
		.enterEmailID("testttt@gmail.com")
		.clickOnOffice()
		.enterDateOfBirth("12121997")
		.enterResHouseNo("1234")
		.enterResArea("testtt")
		.enterResCity("testtt")
		.selectResState("Goa")
		.pageDownPanApplicationPage()
		.enterResPincode("1234")
		.selectResCountry("INDIA")
		.enterOffName("testt")
		.enterOffHouseNo("1234")
		.enterOffArea("testtt")
		.enterOffCity("testtt")
		.selectOffState("Goa")
		.enterOffPincode("1234")
		.selectOffCountry("INDIA")
		.pageDownPanApplicationPage()
		.selectIdentityProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectAddressProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectDOBProof("Aadhar Card issued by UIDAI(In Copy)")
		.selectAadharProof("Copy of Aadhaar Card / Letter")
		.selectOfficeAddressProof("Credit Card statement carrying Office Address");
		
		
	}

}

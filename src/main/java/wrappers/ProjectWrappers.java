package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class ProjectWrappers extends GenericWrappers
{
	
	public String browserName;
	public String appName;
	
	@BeforeSuite
	public void beforeSuite() {
		startReport();
	}
	@BeforeTest
	public void beforeTest() {
		loadObjects();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		startTest(testCaseName, testCaseDescription);
		switch (appName) {
			case "IRCTC" :
				invokeApp(browserName, "https://www.irctc.co.in/nget/train-search");
				break;
			case "facebook":
				invokeApp(browserName, "https://www.facebook.com");
				break;
			case "PAN Application":
				invokeApp(browserName, "https://panind.com/india/new_pan/");
				break;
			case "Indian FRRO":
				invokeApp(browserName, "https://indianfrro.gov.in/frro/FormC/menuuserreg.jsp");
				break;
			case "PHP Travels":
				invokeApp(browserName, "https://www.phptravels.org/register.php");
			default:
				break;
		}
		
	}
	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
	}
	@AfterClass
	public void afterClass() {
		endTest();
	}
	@AfterTest
	public void afterTest() {
		unLoadObjects(); 
	}
	@AfterSuite
	public void afterSuite() {
		endReport();
	}

}

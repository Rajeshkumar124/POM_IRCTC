package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporting {
	
	public static ExtentReports report;
	public static ExtentTest test;
	public  String testCaseName , testCaseDescription;
	public String author , category;
	
	
	
	
	public void startReport() {
		 report = new ExtentReports("./Reports_latest/Result.html", false);
	}
	public void startTest(String testName, String description) {
		 test = report.startTest(testName, description);
		 test.assignAuthor(author);
		 test.assignCategory(category);
	}
	
	
	/**
	 * This method will take snapshot of the browser
	 * @author Basha - LibertyTestingCenter
	 * @throws  
	 */
	public abstract long takeSnap() ;
	
	
	public void reportStep(String details, String status) {
			
		long snapNumber = takeSnap();
		
		if(status.equalsIgnoreCase("pass")) {
		test.log(LogStatus.PASS, details +test.addScreenCapture(".././Reports_latest/scrrenshots/"+snapNumber+".jpg")) ;
		}
		else if(status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, details  +test.addScreenCapture(".././Reports_latest/scrrenshots/"+snapNumber+".jpg"));
		}
		else if(status.equalsIgnoreCase("info")) {
			test.log(LogStatus.INFO, details  +test.addScreenCapture(".././Reports_latest/scrrenshots/"+snapNumber+".jpg"));
		}
		else if(status.equalsIgnoreCase("warning")) {
			test.log(LogStatus.WARNING, details  +test.addScreenCapture(".././Reports_latest/scrrenshots/"+snapNumber+".jpg"));
		}
		
	}
	

	public void reportStep(String details, String status, boolean snap) {
		
		if(!snap) {
		
		if(status.equalsIgnoreCase("pass")) {
		test.log(LogStatus.PASS, details ) ;
		}
		else if(status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, details  );
		}
		else if(status.equalsIgnoreCase("info")) {
			test.log(LogStatus.INFO, details );
		}
		else if(status.equalsIgnoreCase("warning")) {
			test.log(LogStatus.WARNING, details  );
		}
		}
		
	}
	
	
	public void endTest() {
		report.endTest(test);
	}
	public void endReport() {
		report.flush();
	}

}

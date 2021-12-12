package utils;

import org.junit.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport  {
	
	
	@Test
	public void generateReport() {
		
		//start report
		ExtentReports report = new ExtentReports("./reports/Result.html", false);
		
		//
		ExtentTest test=report.startTest("TC001", "To verify login");
		
		test.assignAuthor("rajeshkumar");
		
		test.assignCategory("smoke");
		
		//log the steps
		test.log(LogStatus.PASS, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS, "The application got launched with the given url successfully");
		test.log(LogStatus.PASS, "The application got launched with the given url successfully");
		
		report.endTest(test);
		
		report.flush();
		
	}

}

package March_18.Maven_Project;

	import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Utility.StartUp_webdriver;
import practice_main.actiTime_main;

public class launch_google {
	//Creating ExtentReport and ExtentTest  reference values
	ExtentReports report;
	ExtentTest logger;
	
	@Test
	public void verifysum(){
		
		//Create object for Report with filepath
		report=new ExtentReports("./Reports/TestReport.html");
		
		//Start the test
		logger=report.startTest("VerifySum");
	
		//Log the status in report
		logger.log(LogStatus.INFO, "calc started ");
	
		int a=50,b=80,c;
		c=a+b;
		Assert.assertEquals(c, 130);
		
		
		
		//Pass the test in report
		logger.log(LogStatus.PASS, "Test Verified");
		
		//End the test
		report.endTest(logger);
		
		//Flush the data to report
		report.flush();
		}

	@Test
	public void testactiTime()
	{
//report=new ExtentReports("./Reports/TestReport1.html");
		
		//Start the test
		logger=report.startTest("VerifySum");
	
		//Log the status in report
		logger.log(LogStatus.INFO, "calc started ");
		StartUp_webdriver obj = new StartUp_webdriver();
		String url = "http://localhost:83/login.do";
		WebDriver driver =  obj.startup("ch", url);
		actiTime_main test = new actiTime_main(driver);
		test.userName("admin");
		test.passName("manager");
		test.click();
		//Pass the test in report
				logger.log(LogStatus.PASS, "Test Verified");
				
				//End the test
				report.endTest(logger);
				
				//Flush the data to report
				report.flush();
	}
}

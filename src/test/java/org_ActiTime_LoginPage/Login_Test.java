package org_ActiTime_LoginPage;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utility.StartUp;
import org_ActiTime_LoginMain.Login_Main;

public class Login_Test {
	
	public void test1(WebDriver driver) throws Exception
	{	

		Login_Main obj = new Login_Main(driver);
		StartUp st = new StartUp();
		obj.testData(st.dataFile("uName") ,st.dataFile("Pwd") );
	}

	public void dataVerify(WebDriver driver)
	{
		Login_Main obj = new Login_Main(driver);
		SoftAssert sa = new SoftAssert();
		for(int i = 0 ; i<=2 ; i++)
		{
			sa.assertTrue(obj.testDataverify(i));
		}
	}

	public static void main(String[] args) throws Exception {
	StartUp bu = new StartUp();
	WebDriver driver = bu.startup("ch", bu.dataFile("url"));
		Login_Test call = new Login_Test();
		call.dataVerify(driver);
		call.test1(driver);
		driver.quit();
	}
}

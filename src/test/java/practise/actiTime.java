package practise;

import org.openqa.selenium.WebDriver;

import Utility.StartUp_webdriver;
import practice_main.actiTime_main;

public class actiTime {
	public void testLogin(WebDriver driver)
	{
		
		actiTime_main test = new actiTime_main(driver);
		test.userName("admin");
		test.passName("maager");
		test.click();
	}
	public static void main(String[] args) {
		StartUp_webdriver obj = new StartUp_webdriver();
		String url = "http://localhost:83/login.do";
		WebDriver driver =  obj.startup("ch", url);
		actiTime obj1 = new actiTime();
		obj1.testLogin(driver);

	}

}

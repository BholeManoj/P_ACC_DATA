package actiTime_Test;

import org.openqa.selenium.WebDriver;

import Utility.StartUp;

import actiTime_main.saucedemo_main;

public class saucedemo {

	public void test1(WebDriver driver)
	{
		saucedemo_main ob = new saucedemo_main(driver);
		System.out.println("username and passowrd correct");
		String uName ="standard_user";
		String pName ="secret_sauce";
		ob.loginpage(uName, pName);
		ob.errorcheck();
		System.out.println("Test 1 Pass..........");
	}
	public void test2(WebDriver driver)
	{

		saucedemo_main ob = new saucedemo_main(driver);
		System.out.println("username is blank and passowrd correct");
		String uName ="";
		String pName ="secret_sauce";
		ob.loginpage(uName, pName);
		ob.errorcheck();
		System.out.println("Test 2  Pass..........");
	}
	public void test3(WebDriver driver)
	{

		saucedemo_main ob = new saucedemo_main(driver);
		System.out.println("username is correct and passowrd blank");
		String uName ="standard_user";
		String pName ="";
		ob.loginpage(uName, pName);
		ob.errorcheck();
		System.out.println("Test 3  Pass..........");
	}
	public void test4(WebDriver driver)
	{

		saucedemo_main ob = new saucedemo_main(driver);
		System.out.println("username is blank and passowrd blank");
		String uName ="";
		String pName ="";
		ob.loginpage(uName, pName);
		ob.errorcheck();
		System.out.println("Test 4  Pass..........");
	}
	public void test5(WebDriver driver)
	{

		saucedemo_main ob = new saucedemo_main(driver);
		System.out.println("username is blank and passowrd wrong");
		String uName ="standard_user";
		String pName ="s";
		ob.loginpage(uName, pName);
		ob.errorcheck();
		System.out.println("Test 5  Pass..........");
	}

	public static void main(String[] args) {
		System.out.println("code start");
		saucedemo obj = new saucedemo();
		StartUp obj1 = new StartUp();
		String url = "https://www.saucedemo.com/";
		WebDriver driver = obj1.startup("ch", url);
		obj.test1(driver);
//		driver.navigate().refresh();
//		obj.test2(driver);
//		driver.navigate().refresh();
//		obj.test3(driver);
//		driver.navigate().refresh();
//		obj.test4(driver);
//		driver.navigate().refresh();
//		obj.test5(driver);
		String ur = driver.getCurrentUrl();
		System.out.println(ur);
		System.out.println("code stop");

	}

}

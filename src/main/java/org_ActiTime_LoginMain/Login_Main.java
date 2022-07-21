 package org_ActiTime_LoginMain;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.StartUp;



public class Login_Main {

	
	WebDriver driver;
	public Login_Main(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindAll ( {@FindBy(id = "username")
	, @FindBy(xpath = "//input[@placeholder='Password']")
	, @FindBy(id = "loginButton")})
	List<WebElement> userName;
	
	public void testData(String uname , String Pwd) throws Exception
	{
			userName.get(0).sendKeys(uname);
			userName.get(1).sendKeys(Pwd);
			userName.get(2).click();	
	}
	public boolean testDataverify(int i)
	{
			return userName.get(i).isDisplayed();
	}
}

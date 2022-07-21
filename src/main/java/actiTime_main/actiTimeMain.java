package actiTime_main;

import java.util.List;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class actiTimeMain {
	WebDriver driver;
	public actiTimeMain(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindAll( { @FindBy(xpath = "//input[@id='username']") 
	,@FindBy(xpath = "//*[@name='pwd']")
	,@FindBy(id = "keepLoggedInCheckBox")
	,@FindBy(id = "loginButton")} )

	List<WebElement> username;
	public void username(String uname ,String passnam ) throws Exception
	{
		username.get(0).sendKeys(uname);
		username.get(1).sendKeys(passnam);
		username.get(2).click();
		username.get(3).click();
	}
	public void verifyuserName()
	{
	for(int a = 0 ; a<username.size();a++)
	{
		  Assert.assertEquals(true, username.get(a).isDisplayed());
	}
	}
}

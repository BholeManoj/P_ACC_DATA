package practise;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utility.StartUp;

public class test {
	
	WebDriver driver;
	public test(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindAll ( {@FindBy(id = "username")
	, @FindBy(xpath = "//input[@placeholder='Password']")
	, @FindBy(id = "loginButton")})
	List<WebElement> userName;
	
	public void testData() throws Exception
	{
		StartUp st = new StartUp();
		
		userName.get(0).sendKeys(st.dataFile("uName"));
		userName.get(1).sendKeys(st.dataFile("Pwd"));
		userName.get(2).click();
		
	}

	public static void main(String[] args) throws Exception {
		StartUp bu = new StartUp();
		WebDriver driver = bu.startup("ch", bu.dataFile("url"));
		test objj = new test(driver);
		objj.testData();


	}

}

package practice_main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTime_main {
	WebDriver driver;
public actiTime_main(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void Loginpage(String uName)
{
	
}
@FindBy(name = "username")
WebElement userName;

public void userName(String uName)
{
	 userName.sendKeys(uName);
}
@FindBy(name = "pwd")
WebElement passName;

public void passName(String pName)
{
	 passName.sendKeys(pName);
}
@FindBy(id = "loginButton")
WebElement Click;

public void click()
{
	Click.click();
}

}

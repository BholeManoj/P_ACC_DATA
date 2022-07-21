package actiTime_main;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.StartUp;

public class saucedemo_main {
	//constructor create
	WebDriver driver;
	public saucedemo_main(WebDriver driver)
	{
		this.driver = driver;
	}
	public void  loginpage(String uName , String pName)
	{
		List<WebElement> login = driver.findElements(By.xpath("//*[@class='input_error form_input']"));

		login.get(0).sendKeys(uName);
		login.get(1).sendKeys(pName);
		WebElement click = driver.findElement(By.xpath("//input[@id='login-button']"));
		click.click();
		if(!driver.getCurrentUrl().equalsIgnoreCase("https://www.saucedemo.com/"))
		{
			driver.navigate().back();
		}else
		{
			login.clear();
		}







	}

	public void errorcheck() {
		String data = "Epic sadface: Username and password do not match any user in this service";
		String data1 ="Epic sadface: Username is required";
		String data2 ="Epic sadface: Password is required";
		String data3 ="";
		StartUp obj1 = new StartUp();

		obj1.exwait(driver, "xpath", "//button[@class='error-button']", data);

		try {
			WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));
			if(error.getText().equalsIgnoreCase(data))
			{
				System.out.println("error ok present = " +data);
			}else if(error.getText().equalsIgnoreCase(data1))
			{
				System.out.println("error ok present = " +data1);
			}else if(error.getText().equalsIgnoreCase(data2))
			{
				System.out.println("error ok present = " +data2);
			}
		}catch(Exception e)
		{
			System.out.println("Login Done , Enjoy....................");
		}
	}
}


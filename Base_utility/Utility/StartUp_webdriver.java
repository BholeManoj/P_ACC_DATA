package Utility;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class StartUp_webdriver {


	public WebDriver startup( String bname , String url)
	{
		WebDriver driver = null;
		if(bname.equalsIgnoreCase("ch") || bname.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(bname.equalsIgnoreCase("edge") || bname.equalsIgnoreCase("edge"))
		{
		
		}	
		else if(bname.equalsIgnoreCase("ff") || bname.equalsIgnoreCase("firefox"))
		{
			
		}
		//maximize driver
		driver.manage().window().maximize();
		//invoke driver
		driver.get(url);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
		
	}

}

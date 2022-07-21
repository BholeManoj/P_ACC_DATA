package DemoQa;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class startUP {
	public WebDriver driver = null;
	public WebDriver startup( String bname , String url)
	{
		
		if(bname.equalsIgnoreCase("ch") || bname.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if(bname.equalsIgnoreCase("edge") || bname.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
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
	public void loadwait(WebDriver driver)
	{
		//explicit wait
		 WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
	      //alertIsPresent() condition applied
	      if(w.until(ExpectedConditions.alertIsPresent())==null)
	      System.out.println("Alert not exists");
	      else
	      System.out.println("Alert exists");
	}
	public void javascript(WebElement ele)
	{
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView()", ele);
		
	}

}

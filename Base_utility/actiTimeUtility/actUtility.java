package actiTimeUtility;




import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class actUtility {
	public WebDriver startup(String bname , String url)
	{
		WebDriver driver = null;
		if(bname.equalsIgnoreCase("ch") || bname.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver= new ChromeDriver();
		}
		else if(bname.equalsIgnoreCase("edge") || bname.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
			driver= new EdgeDriver();
		}	
		else if(bname.equalsIgnoreCase("ff") || bname.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver= new FirefoxDriver();
		}
		//maximize driver
		driver.manage().window().maximize();
		//invoke driver
		driver.get(url);
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
	}
	public String  selectAll(WebElement ele)
	{
		String s1 = "";
		Select sle = new Select(ele);
		List<WebElement> alloption = sle.getAllSelectedOptions();
		for(WebElement s :alloption )
		{
			s1 = s.getText();
			System.out.println(s1);
		}
		return s1;
	}
	public String select1st(WebElement ele)
	{
		String s1 = "";
		Select sle = new Select(ele);
		s1 =  sle.getFirstSelectedOption().getText();
		System.out.println(s1);
		return s1;
	}
	public void exwait(WebDriver driver  , String locator,String ele,String data)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

		if(data.equalsIgnoreCase("visibility"))
		{
			switch (locator)
			{
			case "id":
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ele)));
				break;
			case "name":
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(ele)));
				break;
			case "className":
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(ele)));
				break;
			case "xpath":
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(ele)));
				break;
			case "linkText":
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(ele)));
				break;
			}
		}else if(data.equalsIgnoreCase("invisibility"))
		{
			switch (locator)
			{
			case "id":
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id(ele)));
				break;
			case "name":
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.name(ele)));
				break;
			case "className":
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className(ele)));
				break;
			case "xpath":
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(ele)));
				break;
			case "linkText":
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.linkText(ele)));
				break;
			}
		}
	}
	public String get_config_reader(String userData) throws Exception
	{
		FileReader read = new FileReader("D://March_Batch//Maven_Project//Base_utility//actiTimeUtility//acti.properties");
		Properties prop = new Properties();
		prop.load(read);
		return prop.getProperty(userData);
	}
	public Properties init_prop() throws Exception
	{
		FileInputStream fis = new FileInputStream("D://March_Batch//Maven_Project//Base_utility//actiTimeUtility//acti.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop;
	}
	
}

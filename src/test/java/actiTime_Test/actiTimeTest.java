package actiTime_Test;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import actiTimeUtility.actUtility;
import actiTime_main.actiTimeMain;
public class actiTimeTest {
	private Properties prop;
	public WebDriver driver ;
	public actUtility obj = new actUtility();
	@BeforeSuite
	public void initBrowser() throws Exception
	{
		prop = obj.init_prop();
		driver =obj.startup(prop.getProperty("bName"), prop.getProperty("url"));
	}
	@Test
	public void  verifiLoginTc()
	{
		actiTimeMain ob = new actiTimeMain(driver);
		ob.verifyuserName();
	}
	@Test
	public void loginTC() throws Exception
	{
		actiTimeMain ob = new actiTimeMain(driver);
		ob.username(obj.get_config_reader("uName") , obj.get_config_reader("Pwd"));
	}
	
}

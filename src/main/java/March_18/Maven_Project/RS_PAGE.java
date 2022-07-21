package March_18.Maven_Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.StartUp;

public class RS_PAGE {
	WebDriver driver;
	 
	@FindBy(xpath ="//input[@id='autosuggest']")
	WebElement autoSug;
	@FindBy(xpath ="//input[@id='ctl00_mainContent_rbtnl_Trip_2']")
	WebElement radio;
	@FindBy(id ="MultiCityModelAlert")
	WebElement ok;
	@FindBy(id ="ctl00_mainContent_ddl_originStation1_CTXT")
	WebElement from;
	@FindBy(id ="ctl00_mainContent_ddl_destinationStation1_CTXT")
	WebElement to;
	@FindBy(id ="ctl00_mainContent_view_date1")
	WebElement datefrom;
	@FindBy(xpath ="(//div[@id='divpaxinfo'])[1]")
	WebElement slcqty;
	@FindBy(xpath ="//span[@id='hrefIncAdt']")
	WebElement qty;
	@FindBy(id ="btnclosepaxoption")
	WebElement done;
	
	
	
	
	
	
	
	public RS_PAGE(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}
	public void suggest()
	{
		autoSug.click();
		autoSug.sendKeys("in");
		autoSug.sendKeys(Keys.ARROW_DOWN);
		List<WebElement> as = driver.findElements(By.xpath("//*[@class='ui-menu-item']"));
		for(WebElement ls : as)
		{
			System.out.println(ls.getText());
			if(ls.getText().equalsIgnoreCase("India"))
			{
				ls.click();
			}
		}
	}
	public void slc()
	{
		radio.click();
		StartUp st = new StartUp();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(ok));
		ok.click();
	}
	public void fromTo()
	{
		from.click();
		List<WebElement> as = driver.findElements(By.xpath("//div[@id='dropdownGroup1']//li"));
		for(WebElement ls : as)
		{
			System.out.println(ls.getText());
			if(ls.getText().equalsIgnoreCase("Mumbai (BOM)"))
			{
				ls.click();
			}
		}
		to.click();
		

	List<WebElement> as1 = driver.findElements(By.xpath("//div[@id='dropdownGroup1']//li"));
	for(WebElement ls : as1)
	{
		System.out.println(ls.getText());
		if(ls.getText().equalsIgnoreCase("Delhi (DEL)"))
		{
			ls.click();
		}
	}
	 


}
public void dateset()
{
	datefrom.click();
	List<WebElement> as = driver.findElements(By.xpath("//*[@data-handler='selectDay']"));
	for(WebElement ls : as)
	{
		System.out.println(ls.getText());
		if(ls.getText().equalsIgnoreCase("7"))
		{
			ls.click();
		}
	}
}
public void setqty()
{
	slcqty.click();
//	for(int a = 1 ; a<=3;a++)
//	{
//		qty.click();
//	}
//	done.click();
	
}
}

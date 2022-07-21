package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.StartUp;

public class MulTiSelect {
	public static void main(String[] args) throws Exception {
		StartUp obj1 = new StartUp();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = obj1.startup("ch", url);
		WebElement body = driver.findElement(By.tagName("body"));
		for(int i = 0 ; i<=2;i++)
		{
			body.sendKeys(Keys.PAGE_DOWN);
		}
		
		Thread.sleep(2000);
		WebElement ch = driver.findElement(By.xpath("//div[contains(text(),'Select...')]"));
		System.out.println(ch.getTagName());
	
		ch.click();
		
		driver.findElement(By.xpath("//div[text()='Green']")).click();
		driver.findElement(By.xpath("//div[text()='Blue']")).click();
		driver.findElement(By.xpath("//div[text()='Black']")).click();
		driver.findElement(By.xpath("//div[text()='Red']")).click();
		String page = driver.getPageSource();
		System.out.println(page);
		
	
		
		
	}
}

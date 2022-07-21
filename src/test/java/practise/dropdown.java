package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utility.StartUp;

public class dropdown {
	public static void main(String[] args) {
		StartUp obj1 = new StartUp();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = obj1.startup("ch", url);
		
		driver.findElement(By.xpath("//*[@class=' css-1hwfws3']")).click();
		String page = driver.getPageSource();
		
		driver.findElement(By.xpath("//*[text()='Group 1, option 1']")).click();
		driver.findElement(By.xpath("//*[text()='Group 1, option 2']")).click();
		
		
	}
}

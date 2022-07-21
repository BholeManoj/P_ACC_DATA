package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utility.StartUp;

public class radio {

	public static void main(String[] args) {
		StartUp obj1 = new StartUp();
		String url = "https://demoqa.com/radio-button";
		WebDriver driver = obj1.startup("ch", url);
		driver.findElement(By.xpath("//*[text()='Yes']")).click();
		driver.findElement(By.xpath("//*[text()='Impressive']")).click();
		
	}

}

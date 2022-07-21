package DemoQa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import practise.test;


public class DemoqaAlert {
	public void click1(WebDriver driver	)
	{
		WebElement first = driver.findElement(By.id("alertButton"));
		//action
		first.click();
		System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}
	public void click2(WebDriver driver	)
	{
		WebElement second = driver.findElement(By.id("timerAlertButton"));
		//action
		startUP obj = new startUP();
		second.click();
		obj.loadwait(driver);
	      driver.switchTo().alert().accept();
		System.out.println("hi1");
		//obj.loadwait();
		System.out.println("hi2");
	}
	public void click3(WebDriver driver	)
	{
		WebElement three = driver.findElement(By.id("confirmButton"));
		//action
		three.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}
	public void click4(WebDriver driver	)
	{
		WebElement four = driver.findElement(By.id("promtButton"));
		//action
		startUP obj = new startUP();
		four.sendKeys(Keys.PAGE_DOWN);
		four.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Om Namh Shivay");
		driver.switchTo().alert().accept();
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("start --------- > ");
		startUP obj = new startUP();
		String url = "https://demo.automationtesting.in/Dynamic.html";
		//driver.get  //implicit wait  // maximize
		WebDriver driver = obj.startup("ch", url);
//		DemoqaAlert test = new DemoqaAlert();
//		test.click1(driver);
//		test.click2(driver);
//		test.click3(driver);
//		test.click4(driver);
		//driver.wait(2000);
		WebElement four = driver.findElement(By.xpath("//img[@id='angular']"));
		
		test obj1 = new test();
		
		System.out.println("End --------- > ");
		driver.close();

	}

}

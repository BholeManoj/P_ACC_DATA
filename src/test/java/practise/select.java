package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Utility.StartUp;
public class select {
	public static void main(String[] args) throws Exception {
		StartUp obj1 = new StartUp();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = obj1.startup("ch", url);
		WebElement body = driver.findElement(By.tagName("body"));
		body.sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		WebElement ch = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		ch.click();
		Select sle = new Select(ch);
		List<WebElement>  we = sle.getOptions();
		ArrayList <String> arr = new ArrayList<String>();
		//store in array List
		for(int i = 0;i<we.size();i++)
		{
			arr.add(we.get(i).getText());
		}
		ArrayList <String> arr1 = new ArrayList<String>(Arrays.asList
("Red", "Blue", "Green", "Yellow", "Purple", "Black", "White", "Voilet", "Indigo", "Magenta", "Aqua")) ;
		//compare both arrayList
		if(arr.equals(arr1))
		{
			System.out.println("list match");
		}
		else 
		{
			System.out.println("list not macth");
		}
	}
}

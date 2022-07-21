package test_Utility;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class test {
	public static void main(String[] args) throws Exception {
		utility obj  = new utility();
		String url = "https://demoqa.com/select-menu";
		WebDriver driver = obj.startup("ch", url);
		WebElement om = driver.findElement(By.xpath("//select[@id='cars']"));
		Select sle = new Select(om);
		sle.selectByValue("audi");//2
		sle.selectByValue("opel");//1
		obj.select1st(om);

		driver.close();
	}
}

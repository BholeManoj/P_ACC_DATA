package March_18.Maven_Project;
import org.openqa.selenium.WebDriver;
import Utility.StartUp;
public class RS_TEST {
	void cart(WebDriver driver)
	{
		RS_PAGE rs_page = new RS_PAGE(driver);
		rs_page.suggest();
		
		rs_page.slc();
		rs_page.fromTo();
		rs_page.dateset();
		rs_page.setqty();
	}
	public static void main(String[] args) {
		StartUp startup = new StartUp();
		String url = "https://rahulshettyacademy.com/dropdownsPractise/";
		WebDriver driver = startup.startup("ch", url);
		RS_TEST obj = new RS_TEST();
		obj.cart(driver);
	}
}

package March_18.Maven_Project;

import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
	void chrome_normal()
	{
		//normal method
		System.setProperty("webdriver.chrome.driver", "D:\\March_Batch\\Maven_Project\\driver\\chromedriver.exe");
		ChromeDriver obj = new ChromeDriver();
	}
	void chrome_root()
	{
		//root directory method
		System.setProperty("", "./driver/chromedriver.exe");
	}
	void chrome_user_dir()
	{
		//user directory method
				String path = System.getProperty("user.dir");
				System.setProperty("", path+"\\driver\\chromedriver.exe");
	}
	public static void main(String[] args) {
		AppTest obj = new AppTest();
	
		
	}

}

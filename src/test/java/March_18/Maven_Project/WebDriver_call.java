package March_18.Maven_Project;

import org.openqa.selenium.WebDriver;

import Utility.StartUp_webdriver;

public class WebDriver_call {

	public static void main(String[] args) {
		StartUp_webdriver obj = new StartUp_webdriver();
		String url = "https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.2.1";
		WebDriver driver = obj.startup("ch", url);
		

	}

}

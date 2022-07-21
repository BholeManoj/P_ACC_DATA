package Utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class config_reader {
	
	public String get_config_reader(String userData) throws Exception
	{
		FileReader read = new FileReader("D://March_Batch//Maven_Project//Base_utility//data.properties");
		Properties prop = new Properties();
		prop.load(read);
		return prop.getProperty(userData);
	}

}

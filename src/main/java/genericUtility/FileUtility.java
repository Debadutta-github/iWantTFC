package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	/**
	 * This method is used to read the data from property file
	 * @param Key
	 * @return
	 * @throws IOException 
	 */
	public String getDataFromProperty(String Key) throws IOException {
		FileInputStream fis = new FileInputStream(".src/main/resources/commonData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(Key);
		
	}

}

package unicodeTech.BasePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import unicodeTech.Utility.ExcelFileReader;

public class BaseInit {
	
	public static WebDriver driver=null;
	public static Properties siteData=null;
	public static Properties objectStorage=null;
	public static Logger logs=null;

	public static ExcelFileReader ts =null;
	public static ExcelFileReader tsa =null;
	public static ExcelFileReader tsb =null;
	public static ExcelFileReader tsc =null;
	
	public void startUP() throws IOException {
		
		logs=Logger.getLogger("devpinoyLogger");
		logs.info("Sitedata properties file is loading now");
		
		siteData=new Properties();
		FileInputStream fi= new FileInputStream("./src/main/resources/unicodeTech/propertiesData/SiteData.properties");
		siteData.load(fi);
		
		logs.info("Object Storage properties file is loading now");
		
		objectStorage=new Properties();
		fi= new FileInputStream("./src/main/resources/unicodeTech/propertiesData/ObjectStorage.properties");
		objectStorage.load(fi);
	}

}

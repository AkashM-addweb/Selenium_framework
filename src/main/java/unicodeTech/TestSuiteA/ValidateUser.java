package unicodeTech.TestSuiteA;

import org.openqa.selenium.By;

import unicodeTech.Utility.MyMethods;

public class ValidateUser extends ParentTestSuiteA{
	
	public void testValidateUser() {
		
		driver.get(siteData.getProperty("url"));
		
		MyMethods.signIN("demo@unicodetechnologies.in", "unicode");
		
		try {
			
		Boolean checkLogin = driver.findElement(By.linkText("Log Off")).isDisplayed();
		
		if(checkLogin) {
			logs.info("user is already logged in");
			System.out.println("Already logged in");
			MyMethods.signOUT();
			
			}
	
		}
		
		catch(Exception e) {
			logs.info("Invalid Username or Password");
		}
	}
}

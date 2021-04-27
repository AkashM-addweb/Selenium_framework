package unicodeTech.TestSuiteA;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import unicodeTech.Utility.MyMethods;

public class ValidateUser extends ParentTestSuiteA{
	
	@BeforeTest
	public void checkTestCase() {
		
//		MyMethods.checkTestSuiteExecution(file, sheetName, testSuiteID)
		boolean output= MyMethods.checkTestCaseExecution(tsa, "TestCases", this.getClass().getSimpleName());
		logs.info("checkBeforeTest()");

		if(output) {
			logs.info("Execution of the test case  " + this.getClass().getSimpleName()+ "  is set to Yes");
		}else {
			logs.info("Execution of the test case" + this.getClass().getSimpleName()+ "is set to No");
		}	
	}
	
	@Test(dataProvider="getTestDataFromXLS")
	public void testValidateUser(String email, String pwd) {
		
		driver.get(siteData.getProperty("url"));
		logs.info("URL Loaded");
		logs.info("Login with "+email+" and "+pwd);
		MyMethods.signIN(email,pwd);	
		
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
	
	@DataProvider
	public Object[][] getTestDataFromXLS() {		
//		MyMethods.getTestData(data, sheetName)
		return MyMethods.getTestData(tsa, "ValidateUser");		
	}
}

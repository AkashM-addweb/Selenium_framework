package unicodeTech.TestSuiteC;
	
	import java.util.List;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	
	public class BestSellerLinks extends ParentTestSuiteC {
	
		
		public void testBestSellerLinks() {
		driver.get(siteData.getProperty("url"));
			
		WebElement bestSeller=	isElementPresent("div_bestSellerLinks_xpath");
		List<WebElement> links= bestSeller.findElements(By.tagName("a"));
			
		for (WebElement bestLinks: links) {
		logs.info(bestLinks.getText());
			
		}
			
				
	}
		
}

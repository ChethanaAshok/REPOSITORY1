package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Genericbeforemethodaftermethod {
	public class Generic {
		public WebDriver driver;
		
		@BeforeMethod
		public void openApplication()
		{
			System.setProperty("webdriver.gecko.driver","./softwares1/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
		}
		@AfterMethod
		public void closeApplication()
		{
			driver.close();
		
		
			

		}
		
		

	}
}

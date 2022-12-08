package FirstTestNG1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertfbverification {
	@Test
	public void validLogin() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares1/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		Thread.sleep(4000);
		String title = driver.getTitle();
		Assert.assertEquals(title,"Facebook – log in or sign up");
		System.out.println("1");//1 is given to check whether executed or not
		
	}
}

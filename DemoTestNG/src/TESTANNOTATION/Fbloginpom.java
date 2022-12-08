package TESTANNOTATION;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty9.util.thread.ThreadPoolBudget;
import org.testng.annotations.Test;

import POM.POMCOMCEPT1;

public class Fbloginpom {
@Test
public void test1() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver","./softwares1/geckodriver.exe");
	WebDriver driver= new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	POMCOMCEPT1 p= new POMCOMCEPT1(driver);
	Thread.sleep(2000);
	p.Username("chethanajan9@gmail.com");
	Thread.sleep(2000);
	p.password("hanuman@09");
	Thread.sleep(2000);
	p.clicklogin();
	driver.navigate().refresh();
	Thread.sleep(2000);
	p.clicklogin();
}
}

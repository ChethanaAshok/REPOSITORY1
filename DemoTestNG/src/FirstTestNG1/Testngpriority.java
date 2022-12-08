package FirstTestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testngpriority {
	@Test(priority=1)
	public void test1()
	{
		Reporter.log("1",true);
	}
	@Test
	public void test2()
	{
		Reporter.log("2",true);
	}
	

}

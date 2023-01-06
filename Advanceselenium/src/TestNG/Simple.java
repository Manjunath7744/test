package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Simple 
{
	@Test
	public void test1()
	{
		Reporter.log("hello",false);
	}
	public void test2() 
	{
		Reporter.log("hiii",true);
	}
	@Test
	public void test3()
	{
		Reporter.log("hellooo",false);
	}

}

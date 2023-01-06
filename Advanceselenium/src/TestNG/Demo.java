package TestNG;

import java.util.concurrent.TimeUnit;
import org.testng.asserts.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo 
{
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		SoftAssert s=new SoftAssert();
		s.assertEquals(title, "Facebook - log in");
		driver.findElement(By.id("email")).sendKeys("abc");
		s.assertAll();
	
	}

}

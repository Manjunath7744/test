package drivers;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlipkartGeneric {
	WebDriver driver;
	@BeforeTest
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		 driver = new ChromeDriver();
		
	}
	@AfterTest
	public void after()
	{
		driver.quit();
	}
	@Test
	public void test()
	{
		driver.get("https://www.amazon.in");
		Dimension d = new Dimension(400, 500);
		driver.manage().window().setSize(d);
		Point p = new Point(300, 200);
		driver.manage().window().setPosition(p);
		driver.manage().window().maximize();
	}
	

}

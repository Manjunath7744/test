package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mainclass
{
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Pom p = new Pom(driver);
		p.Button();
		driver.navigate().refresh();
		p.mutton();
		driver.navigate().refresh();
		p.sachin();
	
	}
	
}

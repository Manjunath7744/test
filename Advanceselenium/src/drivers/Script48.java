package drivers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script48 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("hhtps://www.amazon.com");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		for(int i=0;i<=3;i++)
		{
			jse.executeScript("window.scrollBy(0,500)");
		}
		for(int i=0;i<=3;i++)
		{
			jse.executeScript("window.scrollBy(0,-500)");
		}
		
	}

}

package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scipt23 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		driver.quit();
		
	}

}

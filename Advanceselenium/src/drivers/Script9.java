package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script9 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.irctc.co.in/nget/train");
}
}

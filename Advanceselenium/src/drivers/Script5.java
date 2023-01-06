package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/rajeshwarichapparad/Desktop/html/demo123.html");
		
		driver.findElement(By.xpath("html/body/div[1]/input"));

		
	}
	
}

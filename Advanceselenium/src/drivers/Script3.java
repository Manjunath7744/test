package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjY3ODg5MjgwLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("abc");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("1234567");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("3456789");
		
		driver.quit();
	}

}

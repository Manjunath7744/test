package drivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script54 
{
	public static void main(String[] args) 
	
	{
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjcwOTMyOTU3LCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		driver.findElement(By.id("email")).sendKeys("8123904115");
		driver.findElement(By.id("pass")).sendKeys("hii");
		driver.findElement(By.id("loginbutton")).click();
		
		
	}

}

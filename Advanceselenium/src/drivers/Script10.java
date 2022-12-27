package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script10 {
	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("asdfghjkl");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("asdfghjkl");
			
			driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}

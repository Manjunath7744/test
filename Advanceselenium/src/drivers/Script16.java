package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script16 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8123904115");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//a[.='Forgotten password?']")).click();
		driver.getCurrentUrl();
		driver.getTitle();
	}

}

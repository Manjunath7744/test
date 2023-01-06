package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		driver.findElement(By.xpath("//div[@title='Sign In']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("hellohii90@yahoo.com");
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		driver.findElement(By.xpath("//input[@id='login-passwrd']")).sendKeys("HEllo");
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		
	}

}

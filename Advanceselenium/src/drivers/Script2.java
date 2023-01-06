package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("Users/rajeshwarichapparad/Desktop/html/selenium1.html");
		driver.findElement(By.id("a")).sendKeys("ABC");
		driver.findElement(By.id("b")).sendKeys("1234");
		driver.findElement(By.id("c")).click();
		driver.findElement(By.id("a")).clear();
		driver.quit();
		
		
	}

}

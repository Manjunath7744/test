package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement src = driver.findElement(By.id("email"));
			 
		WebElement dstn = driver.findElement(By.id("pass"));
		 
		 a.dragAndDrop(src, dstn);
		 System.out.println("hello");
		
	}
}

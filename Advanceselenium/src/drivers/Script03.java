package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script03 {

	
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.youtube.com/");
			driver.findElement(By.cssSelector("input[id='search']")).sendKeys("Rolexx tamil dialogue");
			driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("yt-formatted-string[aria-label='🔥 ROLEX 🔥uncensored version by STATUS MANIA 4 months ago 2 minutes, 54 seconds 88,087 views'")).click();
			

	}

}

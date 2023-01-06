package drivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script31 {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users//Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		for(WebElement ele:links)
		{
			String link = ele.getAttribute("href");
			System.out.println(link);
		}
		
	}

}

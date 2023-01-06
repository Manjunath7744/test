package drivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script30 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/rajeshwarichapparad/Desktop/html/textfield1.html");
		List<WebElement> text = driver.findElements(By.xpath("//input"));
		int number = text.size();
		for(WebElement ele:text)
		{
			ele.sendKeys("hello");
		}
		for(int i=number-1;i>=0;i--)
		{
			WebElement ele = text.get(i);
			ele.clear();
			
		}
		
	}

}

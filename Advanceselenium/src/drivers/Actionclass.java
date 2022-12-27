package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/search?q=ssc&oq=ssc&aqs=chrome.0.69i59l4j0i131i433i512l2j0i433i512l2j0i131i433i512j0i433i512.1181j0j15&sourceid=chrome&ie=UTF-8");
		WebElement ele = driver.findElement(By.xpath("//a[.='Apply']"));
		Actions name = new Actions(driver);
		name.moveToElement(ele);
	
	}
}

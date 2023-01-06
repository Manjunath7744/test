package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script22 {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			WebElement ele = driver.findElement(By.name("email"));
			Point loc = ele.getLocation();
			System.out.println(loc);
			int x=loc.getX();
			int y = loc.getY();
			System.out.println(x);
			System.out.println(y);

	}

}

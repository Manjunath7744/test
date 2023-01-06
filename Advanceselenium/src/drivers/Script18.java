package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script18 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/rajeshwarichapparad/Desktop/html/textfield.html");
		WebElement ele = driver.findElement(By.xpath("//input[@value='abc']"));
		WebElement ele2 = driver.findElement(By.xpath("//input[@value='xyz']"));
	
		ele2.sendKeys(Keys.COMMAND+"a");
		ele2.sendKeys(Keys.DELETE);
		ele.sendKeys(Keys.COMMAND+"a");
		ele.sendKeys(Keys.COMMAND+"c");
		ele2.sendKeys(Keys.COMMAND+"v");
		
		
		
	}

}

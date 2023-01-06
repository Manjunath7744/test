package drivers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script42 {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String parent_window = driver.getWindowHandle();
		WebElement ele1 = driver.findElement(By.xpath("//span[.='Downloads']"));
		WebElement ele2 = driver.findElement(By.xpath("//span[.='Documentation']"));
		WebElement ele3 = driver.findElement(By.xpath("//span[.='Projects']"));
		WebElement ele4 = driver.findElement(By.xpath("//span[.='Support']"));
		ArrayList<WebElement> list = new ArrayList<WebElement>();
		list.add(ele1);
		list.add(ele2);
		list.add(ele3);
		list.add(ele4);
		Robot r = new Robot();
		for(WebElement ele:list)
		{
			ele.getSize();
			r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_SPACE);
			r.keyRelease(KeyEvent.VK_ALT);
			r.keyRelease(KeyEvent.VK_SPACE);
			r.keyPress(KeyEvent.VK_N);
			r.keyRelease(KeyEvent.VK_N);
			driver.switchTo().window(parent_window);
		}
	}

}

package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/      Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.get("file:///Users/rajeshwarichapparad/Desktop/html/123456.html");
		WebElement ele = driver.findElement(By.xpath("//select[@id='Hotel']"));
		Select s = new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("5");
		s.selectByVisibleText("Vada");
		s.deselectAll();
		
		

	}

}

package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/?hl=en-GB");
		driver.findElement(By.xpath("//a[@class='gb_2 gb_3 gb_9d gb_9c']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("manjunathchapparad");
		driver.findElement(By.xpath("//span[.='Next']")).click();

	}

}

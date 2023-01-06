package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Script55 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjcxMDE2OTcyLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		driver.findElement(By.id("email")).sendKeys("manjunathchapparad");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='loginbutton']")));
		
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		
	}

}

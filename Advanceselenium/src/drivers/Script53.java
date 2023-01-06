package drivers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script53 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ssc.nic.in/");
		WebElement ele = driver.findElement(By.xpath("//img[@id='captchaImg']"));
	
		File src = ele.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshots/1st.png");
		FileUtils.copyFile(src, trg);
		driver.quit();
		
		
}
}

package drivers;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateScript 

{
	public static void main(String[] args) throws IOException {
		Date d = new Date();
		String d1 = d.toString();
		String d2 = d1.replaceAll(":", "-");
		System.out.println(d1.toString());
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File destiantion = new File("./screenshots/"+d2+".png");
		FileUtils.copyFile(src, destiantion);
		driver.quit();
		
		
	}
	
	

}

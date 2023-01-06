package drivers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class property {
	@Test
	public void property() throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		FileInputStream fis = new FileInputStream("./properties.properties");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty("url");
		System.out.println(value);
		driver.get(value);
	}

}

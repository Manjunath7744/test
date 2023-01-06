package drivers;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script39 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.name("NewWindow")).click();
		
		String p_id = driver.getWindowHandle();
		Set<String> all_id = driver.getWindowHandles();
		for(String id:all_id)
		{
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(id);
			System.out.println(p_id);
			System.out.println(title);
		}

	}

}

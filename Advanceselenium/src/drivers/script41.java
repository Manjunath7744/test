package drivers;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script41 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		String p_id = driver.getWindowHandle();
		Set<String> all_id = driver.getWindowHandles();
		int  size = all_id.size();
		System.out.println(size);
		
		for(String id:all_id)
		{
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			if(p_id.equals(id))
			{
				driver.close();
			}
		}
	}

}

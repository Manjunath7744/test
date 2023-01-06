package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script8 {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/search?q=facebook&oq=&aqs=chrome.0.69i59i450.256516j0j7&sourceid=chrome&ie=UTF-8");
	driver.findElement(By.cssSelector("div[class='TbwUpd NJjxre']")).click();
	
}

}

package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script4 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kranti trailer");
	driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
	driver.findElement(By.cssSelector("yt-formatted-string class=\"style-scope ytd-video-renderer\" aria-label=\"Kranti First Look | Darshan Thoogudeepa | V Harikrishna | Shylaja Nag, B Suresha |Media House Studio by DBeatsMusicWorld 8 months ago 1 minute, 4 seconds 8,911,290 views\"")).click();
	
}
}

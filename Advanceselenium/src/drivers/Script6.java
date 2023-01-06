package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("Rolexxx dialogue");
		
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("img[class='yt-core-image--fill-parent-height yt-core-image--fill-parent-width yt-core-image yt-core-image--content-mode-scale-aspect-fill yt-core-image--loaded']")).click();
	}

}

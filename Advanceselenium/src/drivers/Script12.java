package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script12 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kgf teaser");
		driver.findElement(By.xpath("//button[@icon='yt-icons:search']")).click();
		driver.findElement(By.xpath("//yt-image/img[@src='https://i.ytimg.com/vi/yT8H8x8iTTk/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBUKXMhGa1JlOir4-NtbbKuSZulWg']")).click();
	}

}

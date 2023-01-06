package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script19 {
	public static void main(String[] args) {
		String s1="",s4="hiiihowru?";
		String s2="@gmail.com";
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		for(int i=0;i<100;i++)
		{
			
			s1=s1+s4.charAt(i);
			String s3=s1+s2;
			driver.get("https://www.facebook.com/");
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(s3);
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234567");
			driver.findElement(By.xpath("//button[@name='login']")).click();
			
			
		}
	}

}

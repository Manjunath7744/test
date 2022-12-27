package drivers;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
	
	  public static String amazon()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 14");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Apple iPhone 14 128GB (Product) RED']"));
		ele.click();
		Set<String> handles = driver.getWindowHandles();
		for(String window:handles)
		{
			driver.switchTo().window(window);
		}
		String value = driver.findElement(By.xpath("//span[.=' Inclusive of all taxes']/../..//span[2]/span[2]/span[2]")).getText();
		String value1 = value.replaceAll(",","");
		
		driver.quit();
		return value1;
		
	}
	  public static void main(String[] args) throws InterruptedException ,NumberFormatException
	  {
		
	
		int amazonvalue = Integer.parseInt(amazon());
		String s1 = flipkart();
		System.out.println(s1);
		int flipkartvalue = Integer.parseInt(s1);
		if(amazonvalue>flipkartvalue)
		{
			System.out.println("amazon is giving more discount");
		}
		
		if(amazonvalue==flipkartvalue)
		{
			System.out.println("no price difference");
		}
		
	}
	  public static String flipkart() throws InterruptedException
	  {
		  System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("//button[.='✕']")).click();
			driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("iphone 14");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(1000);
    		driver.findElement(By.xpath("//div[.='APPLE iPhone 14 (Blue, 128 GB)']")).click();
			
			Set<String> windows = driver.getWindowHandles();
			for(String window:windows)
			{
				driver.switchTo().window(window);
			}
			String value = driver.findElement(By.xpath("//div[.='Extra ₹2410 off']/../div[4]/div[1]/div[1]/div[1]")).getText();
			String value1 = value.replaceAll(",", "");
			String value2 = value1.replaceAll("₹", "");
			driver.quit();
			return value2;
			
			
	  }
}

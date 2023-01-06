package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider 
{
	@DataProvider(name="login")
	public String[][] getdata()
	{
		String [][] data= {{"qsp","123"},{"sachin","345"}};
		return data;
				
	}
	@Test(dataProvider="login")
	public void test(String un,String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://wwww.facebook.com");
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		
	}

}

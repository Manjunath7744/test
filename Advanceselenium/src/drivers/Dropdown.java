package drivers;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/rajeshwarichapparad/Desktop/html/selenium123.html");
		WebElement element = driver.findElement(By.tagName("select"));
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for(WebElement oneelement:options)
		{
			String elementvalue = oneelement.getText();
			System.out.println(elementvalue);
		}
		WebElement element2 = driver.findElement(By.id("1"));
		Select s1 = new Select(element2);
		ArrayList<String> a = new ArrayList<String>();
		
		List<WebElement> elements = s1.getOptions();
		for(WebElement element1:elements)
		{
			String text = element1.getText();
			a.add(text);
			
		}
		for(int i = a.size()-1;i>=0;i--)
		{
			System.out.println(i);
		}
		
		
	}

}

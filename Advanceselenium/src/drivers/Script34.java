package drivers;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script34 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///Users/rajeshwarichapparad/Desktop/html/123456.html");
		 TreeSet<String> name = new TreeSet<String>(Collections.reverseOrder());
		WebElement ele = driver.findElement(By.xpath("//select[@id='Hotel']"));
		Select s = new Select(ele);
		List<WebElement> options = s.getOptions();
		for(WebElement option:options)
		{
			 String text = option.getText();
			 name.add(text);
		}
		int n = name.size();
		System.out.println(n);
		for(String o:name)
		{
			System.out.println(o);
		}
	

	}

}

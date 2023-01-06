package drivers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script33 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///Users/rajeshwarichapparad/Desktop/html/123456.html");
	WebElement ele = driver.findElement(By.xpath("//select[@id='Hotel']"));
	ArrayList<String> a = new ArrayList<String>();
	Select s = new Select(ele);
	List<WebElement> option = s.getOptions();
	for(WebElement option1:option)
	{
		String text = option1.getText();
		a.add(text);
	}
	Collections.sort(a);
	for ( String o:a)
	{
		System.out.println(o);
	}
}
}

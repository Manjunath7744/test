package TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class hardassert extends Hardassertit {
	@Test
	public void untest()
	{
		driver.get("https://wwww.facebook.com");
		String title = driver.getTitle();
		Assert.assertEquals(title, "facebook login");
		driver.findElement(By.id("email")).sendKeys("sadfgh");
		
	}

}

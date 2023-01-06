package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	@FindBy(name = "login")

	private WebElement ele;
	public Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Button()
	{
		ele.click();
	}
	public void mutton() {
		ele.click();
	}
	public void sachin() {
	ele.click();
	}
	}
	



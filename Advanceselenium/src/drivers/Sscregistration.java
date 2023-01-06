package drivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sscregistration {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ssc.nic.in/Registration/Home");
		driver.manage().window().maximize();
		driver.findElement(By.id("rbAadharYes")).click();
		driver.findElement(By.id("AadharNumber")).sendKeys("555891431252");
		driver.findElement(By.id("VerifyAadharNumber")).sendKeys("555891431252");
		driver.findElement(By.id("Name")).sendKeys("Manjunath");
		driver.findElement(By.id("VerifyName")).sendKeys("Manjunath");
		driver.findElement(By.id("rbHaveEverChangedNameNo")).click();
		driver.findElement(By.id("FatherName")).sendKeys("venkappa");
		driver.findElement(By.id("VerifyFatherName")).sendKeys("venkappa");
		driver.findElement(By.id("MotherName")).sendKeys("devakka");
		driver.findElement(By.id("VerifyMotherName")).sendKeys("devakka");
		driver.findElement(By.id("DateOfBirth")).sendKeys("31/05/1997");
		driver.findElement(By.id("VerifyDateOfBirth")).sendKeys("31/05/1997");
		WebElement ele = driver.findElement(By.id("EducationBoard"));
		Select s = new Select(ele);
		s.selectByVisibleText("Karnataka Secondary Education Examination Board");
		WebElement ele1 = driver.findElement(By.id("ddlEducationBoard"));
		Select s1 = new Select(ele1);
		s1.selectByVisibleText("Karnataka Secondary Education Examination Board");
		driver.findElement(By.id("SecondaryRollNum")).sendKeys("20130420162");
		driver.findElement(By.id("VerifySecondaryRollNum")).sendKeys("20130420162");
		WebElement year = driver.findElement(By.id("Yearofpassing"));
		Select Yearofpassing = new Select(year);
		Yearofpassing.selectByVisibleText("2013");
		WebElement year1 = driver.findElement(By.id("ddlYearofpassing"));
		Select Yearofpassing1 = new Select(year1);
		Yearofpassing1.selectByVisibleText("2013");
		driver.findElement(By.id("rbMale")).click();
		driver.findElement(By.id("rbVerifyMale")).click();

		WebElement Levelofeducationqualification = driver.findElement(By.id("Levelofeducationqualification"));
		Select Levelofeducationqualification1 = new Select(Levelofeducationqualification);
		Levelofeducationqualification1.selectByVisibleText("Graduation");
		driver.findElement(By.id("MobileNum")).sendKeys("8123904115");
		driver.findElement(By.id("VerifyMobileNum")).sendKeys("8123904115");
		
		driver.findElement(By.id("EmailID")).sendKeys("manjunath@gmail.com");
		driver.findElement(By.id("VerifyEmailID")).sendKeys("manjunath@gmail.com");
		WebElement OriginState = driver.findElement(By.id("OriginState"));
		Select OriginStatelist = new Select(OriginState);
		OriginStatelist.selectByVisibleText("Karnataka");
		driver.findElement(By.id("btnsubmit1")).click();
		
		
		
		
		
		
		
		
		
	}

}

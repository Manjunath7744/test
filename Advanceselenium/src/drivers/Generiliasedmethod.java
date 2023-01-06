package drivers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.crypto.Data;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Generiliasedmethod 
{
	
	WebDriver driver;
	static String datavalue;
	
	public void openBrowser() throws Exception
	{
		
	
			System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/") ;
		
		
	}

	public void closeBrowser()
	{
		driver.quit();
		
	}
	@Test
	public void testFacebook() throws Exception
	{
		for(int i=0;i<4;i++)
		{
			openBrowser();
			driver.findElement(By.id("email")).sendKeys(getcellvalue());
			driver.findElement(By.id("pass")).sendKeys(getcellvalue1());
			driver.findElement(By.name("login")).click();
			closeBrowser();
		}
		
	}
	public static String getcellvalue() throws Exception
	{
		FileInputStream inputFile=new FileInputStream("./new file/testdata.xlsx");
		Workbook book = WorkbookFactory.create(inputFile);
		Sheet sheet = book.getSheet("Sheet2");
	
		for(int i=0;i<4;i++)
		{
			
			Row row = sheet.getRow(i);
			Cell cellValue = row.getCell(0);
			 datavalue = cellValue.toString();
			
			i++;
			break;
			
		}
		return datavalue;
		
	}
	
	public static String getcellvalue1() throws Exception
	{
		FileInputStream inputFile=new FileInputStream("./new file/testdata.xlsx");
		Workbook book = WorkbookFactory.create(inputFile);
		Sheet sheet = book.getSheet("Sheet2");
		for(int i=0;i<4;i++)
		{
			Row row = sheet.getRow(i);
			Cell cellValue = row.getCell(1);
			 datavalue = cellValue.toString();
			 i++;
				break;
				
			
		}
		return datavalue;
		
	}

}

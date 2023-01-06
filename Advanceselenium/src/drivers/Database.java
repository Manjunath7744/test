package drivers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Database 
{
	static WebDriver driver;
	public static void main(String[] args) throws EncryptedDocumentException, IOException  
	{
		FileInputStream fis = new FileInputStream("./new file/testdata.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet datasheet = book.getSheet("Sheet2");
		Row row1 = datasheet.getRow(0);
		Cell cell = row1.getCell(0);
		Cell cell2 = row1.getCell(1);
		String value = cell.toString();
		String value1=cell2.toString();
		facebook();
		driver.findElement(By.id("email")).sendKeys(value);
		driver.findElement(By.id("pass")).sendKeys(value1);
		driver.findElement(By.name("login")).click();
		
		
	}
	public static void facebook()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		 driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
	}
	
}
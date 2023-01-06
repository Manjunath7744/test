package drivers;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script44 {
public static void main(String[] args) throws EncryptedDocumentException, IOException  
{
	FileInputStream fis = new FileInputStream("./new file/testdata 2.numbers");
	Workbook book = WorkbookFactory.create(fis);
	Sheet sheet = book.getSheet("manjunath");
	
	System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	int count = links.size();
	for(int i=1;i<=count-1;i++)
	{
		
		Row row = sheet .createRow(i);
		Cell cell = row.createCell(0);
		cell.setCellValue(links.get(i).getAttribute("href"));
	}
	FileOutputStream fos = new FileOutputStream("./new file/testdata 2.xlsx");
	book.write(fos);
}
}

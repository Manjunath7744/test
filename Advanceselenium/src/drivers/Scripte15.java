package drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scripte15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarichapparad/Desktop/selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_1aeuamiuit_b&adgrpid=58746164597&hvpone=&hvptwo=&hvadid=617721280249&hvpos=&hvnetw=g&hvrand=9315685671070373863&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062064&hvtargid=kwd-298741529014&hydadcr=5903_2362026&gclid=EAIaIQobChMInc_wqp6_-wIViAVyCh3tPgn_EAAYASAAEgJ-UPD_BwE");
		driver.findElement(By.xpath("//img[@alt='Clothing']")).click();
		driver.findElement(By.xpath("//button[@aria-label='XL']")).click();
		driver.findElement(By.xpath("//img[@srcset='https://m.media-amazon.com/images/I/81adovbULeL._AC_UL320_.jpg 1x, https://m.media-amazon.com/images/I/81adovbULeL._AC_UL480_FMwebp_QL65_.jpg 1.5x, https://m.media-amazon.com/images/I/81adovbULeL._AC_UL640_FMwebp_QL65_.jpg 2x, https://m.media-amazon.com/images/I/81adovbULeL._AC_UL800_FMwebp_QL65_.jpg 2.5x, https://m.media-amazon.com/images/I/81adovbULeL._AC_UL960_FMwebp_QL65_.jpg 3x']")).click();
		driver.findElement(By.xpath("//input[@name='submit.buy-now']")).click();
	}

}

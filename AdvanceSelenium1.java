package intro;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceSelenium1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// count the no of links present in the whole webpage
		System.out.println("No of links in webpage are " + driver.findElements(By.tagName("a")).size());

		// count the no of links in the footer section
		// first need to give driver scope to footer section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println("No of links in webpage footer are " + footerDriver.findElements(By.tagName("a")).size());

		// count the no of links of first part of footer

		WebElement ColumnDriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(
				"No of links in webpage column footer are " + ColumnDriver.findElements(By.tagName("a")).size());

		// Open all the links in new tabs
		List<WebElement> AllLinks = ColumnDriver.findElements(By.tagName("a"));
		String keys = Keys.chord(Keys.CONTROL, Keys.ENTER);

		for (int i = 1; i < AllLinks.size(); i++) {
			AllLinks.get(i).sendKeys(keys);
		}

		// Print the page title of all opened tabs
		// here used driver instead of columnDriver because tabs belongs to driver
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();

		// String parent = it.next(); // to get back to main page again i have decalred
		
		while (it.hasNext()) {
			String child = it.next();
			System.out.println(driver.switchTo().window(child).getTitle()); // it starts iterting from the last tab
																			// opened
		}
		// driver.switchTo().window(parent); //Back to main page

	}

}

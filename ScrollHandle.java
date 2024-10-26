package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollHandle {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver",
			//	"C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");

		// WebDriver driver = new ChromeDriver();
System.setProperty("webdriver.edge.driver","C:\\personal\\Selenium\\drivers\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,600)"); // scrolling webpage

		
		Thread.sleep(3000);
		js.executeScript("document.querySelector('div.tableFixHead').scrollTop=5000");
	

		

	}

}

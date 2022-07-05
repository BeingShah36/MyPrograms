package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,600)"); // scrolling webpage

		
		Thread.sleep(3000);
		//js.executeScript("document.querySelector('div.tableFixHead').scrollTop=5000");
	
		js.executeScript("document.querySelector('td[normalize-space()='Pune']').scrollBy(0,500)");
		

	}

}

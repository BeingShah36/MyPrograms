package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
System.setProperty("webdriver.chrome.driver", "C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).contextClick().build().perform();
		a.moveToElement(driver.findElement(By.id("nav-search-bar-form"))).click().keyDown(Keys.SHIFT).sendKeys("mobile").doubleClick().build().perform();
	}

}

package intro;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitAssignment {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		//Explicit wait
	    WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		SignIn(driver,w);
		
		w.until(ExpectedConditions.titleContains("ProtoCommerce"));
		List<WebElement> d= driver.findElements(By.cssSelector("button.btn.btn-info"));
		
		//for(int i=0; i<d.size();i++)
		//{
		//	d.get(i).click();
		//}
		
		// with advanced for loop
		for(WebElement a : d)
		{
			a.click();
		}
		
		driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
	}
	
	public static void SignIn(WebDriver driver, WebDriverWait w) {
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
	
        driver.findElement(By.id("okayBtn")).click();
       WebElement d =  driver.findElement(By.cssSelector("select.form-control"));
       
       Select dropdown = new Select(d);
       dropdown.selectByIndex(0);
       
       driver.findElement(By.id("signInBtn")).click();
	}

}

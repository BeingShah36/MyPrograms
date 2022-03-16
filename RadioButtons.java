package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
	        driver.manage().window().maximize();
	        
	        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	        
	       // driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
	     //   Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
	        
	      //  System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	         
	        
	       // if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
	      //  {
	      //  	System.out.println("it is disable");
	      //  }

	        
	        // to select current date from calendar
	        
	        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.linkText("16")).click();
	}

}

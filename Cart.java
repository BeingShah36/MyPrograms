package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		
		 System.setProperty("webdriver.chrome.driver","C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
	        driver.manage().window().maximize();
	        
	        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	        
	       List<WebElement> a =  driver.findElements(By.cssSelector("h4.product-name"));
	       
	       for (int i=0 ; i<a.size() ; i++)
	       {
	    	   if(a.get(i).getText().contains("Beetroot"))
	    	   {
	    		  driver.findElements(By.xpath(("//button[text()='ADD TO CART']"))).get(i).click();
	    		  break;
	    	   }
	       }
	}

}

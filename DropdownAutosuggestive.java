package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownAutosuggestive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
	//	System.setProperty("webdriver.chrome.driver","C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//li.ui-menu-item
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		Thread.sleep(2000);
		
		List<WebElement> d= driver.findElements(By.cssSelector("li.ui-menu-item"));
		
		for (WebElement c:d)
		{
			if (c.getText().equalsIgnoreCase("india"))
			{
				c.click();
				break;
			}
		}
		
		//search finland from the drop down
		//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//driver.findElement(By.id("autosuggest")).sendKeys("land");
		//Thread.sleep(2000);
		//List<WebElement> a = driver.findElements(By.cssSelector("li.ui-menu-item"));
		
		//for (WebElement d : a)
	//	{
		//	if(d.getText().equalsIgnoreCase("finland"))
		//	{
		//		d.click();
		//		break;
		//	}
		//}
	}

}

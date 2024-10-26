package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) {
		
	//	System.setProperty("webdriver.chrome.driver","C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//should return false as check box is not selected
	//	Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		 // System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		//check box is now selected
	//	driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		//should return true as check box is now selected
	//	Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		
		//same program  as above but with minimized code
		WebElement a = driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		Assert.assertFalse(a.isSelected());
		a.click();
		Assert.assertTrue(a.isSelected());
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

	}

}

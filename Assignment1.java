package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
        System.setProperty("webdriver.chrome.driver","C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
        driver.manage().window().maximize();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement d = driver.findElement(By.id("checkBoxOption1"));
		d.click();
		Assert.assertTrue(d.isSelected());
		d.click();
		Assert.assertFalse(d.isSelected());
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}

package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropdownLoop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();	
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	driver.findElement(By.cssSelector("div.paxinfo")).click();
	
	Thread.sleep(2000);
	for(int i=0;i<4;i++)
	{
	driver.findElement(By.id("hrefIncChd")).click();
	}
	
	
	driver.findElement(By.id("btnclosepaxoption")).click();
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}

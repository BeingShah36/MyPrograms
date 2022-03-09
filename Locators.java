package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
    
   WebDriver driver = new ChromeDriver();

    driver.get("https://www.facebook.com/");
 //   driver.findElement(By.id("email")).sendKeys("alshahbaz100");
    
   System.out.println(driver.findElement(By.cssSelector("h2._8eso")).getText());
   // driver.findElement(By.cssSelector("input#email")).sendKeys("765868");
   // driver.findElement(By.name("pass")).sendKeys("457567568");
   // driver.findElement(By.name("login")).click();
   
   driver.findElement(By.linkText("Forgotten password?")).click();
   driver.findElement(By.xpath("//input[@name='email']")).sendKeys("aaaaa");
	}

}

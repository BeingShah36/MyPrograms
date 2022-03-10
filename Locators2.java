package intro;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import net.jodah.failsafe.internal.util.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String a = "shah";
		
		// creating object of the class to access getPassword method
		Locators2 l1 = new Locators2();
		String l2 = l1.getPassword(driver);
		
		// another method to 
		
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
			
		
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(a);
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(l2);
		
		driver.findElement(By.cssSelector("button.submit.signInBtn")).click();
		
		String c = driver.findElement(By.xpath("//p[text()='You are successfully logged in.']")).getText();
		
	  // assert.assertEquals(c, "You are successfully logged in.");
	   
	   org.testng.Assert.assertEquals(c,"You are successfully logged in.");
	   
	   String d = driver.findElement(By.xpath("//h2")).getText();
	   
	   org.testng.Assert.assertEquals(d,"Hello shah,");
	   
	   driver.findElement(By.cssSelector("button.logout-btn")).click();
	   driver.close();
	   

	

	}
 ///to parse the password
	
	public String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
	String s1 =	driver.findElement(By.xpath("//form/p")).getText();
	
/// s1= Please use temporary password 'rahulshettyacademy' to Login.
	
	String[] s2=s1.split("'");
	
	/// s2[0] = Please use temporary password
	/// s2[1] = rahulshettyacademy' to Login.
	
	String[] s3= s2[1].split("'");
	
	// s3[0]=rahulshettyacademy
	// s3[1]=to Login.
	
	return s3[0];
		
		
	}
}

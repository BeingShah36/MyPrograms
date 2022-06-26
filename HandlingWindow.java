package intro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		driver.findElement(By.cssSelector("a.blinkingText")).click();
		Set<String> a = driver.getWindowHandles(); // it brings all the windows and ids opened by driver into one set

		Iterator<String> b = a.iterator(); // to access the ids of windows

		String parentwindow = b.next(); // it will have access to first window(0th index)
		String childwindow = b.next(); // it will have the access to 1st index window

		driver.switchTo().window(childwindow); // focus will switch to 1st index window

	String c = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];   // focus is still on 1st index as we have not
																		// switched back to parent index
     
	driver.switchTo().window(parentwindow); //switched back to parent window
	driver.findElement(By.id("username")).sendKeys(c);
	
	}

}

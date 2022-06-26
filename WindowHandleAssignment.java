package intro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> a = driver.getWindowHandles();

		Iterator<String> b = a.iterator();
		String parent = b.next();
		String child = b.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//h3")).getText());
		
		//driver.close(); //difference between quit and close
		driver.quit();
		

	}

}

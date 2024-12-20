package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver",
		//		"C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");

		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver","C:\\personal\\Selenium\\drivers\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		 WebElement table = driver.findElement(By.id("product"));

		System.out.println(table.findElements(By.tagName("tr")).size());
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

		List<WebElement> row4 = table.findElements(By.tagName("tr")).get(3).findElements(By.tagName("td"));
		for (int i = 0; i < row4.size(); i++) {
			System.out.println(row4.get(i).getText());
		} 
		

	}

}

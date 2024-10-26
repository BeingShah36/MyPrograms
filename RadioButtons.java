package intro;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException, IOException {

	//	System.setProperty("webdriver.chrome.driver",
	//			"C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");

		System.setProperty("webdriver.edge.driver",
						"C:\\personal\\Selenium\\drivers\\edgedriver_win64\\msedgedriver.exe\\");
	//	WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("C:\\Users\\tony\\Desktop\\New folder\\img.png"));

		// driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		// Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());

		// System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		// if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		// {
		// System.out.println("it is disable");
		// }

		// to select current date from calendar

		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("16")).click();
	
	
		
	}

}

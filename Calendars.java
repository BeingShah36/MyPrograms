package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Calendars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver",
		//		"C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");

	//	WebDriver driver = new ChromeDriver();
				System.setProperty("webdriver.edge.driver","C:\\personal\\Selenium\\drivers\\edgedriver_win64\\msedgedriver.exe");
				
				WebDriver driver = new EdgeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		// String MonthHandle = driver.findElement(By.cssSelector("table[class=' table-condensed'] th[class='datepicker-switch']")).getText();
        //System.out.println(Month);
		//select august. here we have not use findelements because month field is same for all the months. at one place only month is changing
		// while(!MonthHandle.contains("August 2022"))
		
		while(!driver.findElement(By.cssSelector("table[class=' table-condensed'] th[class='datepicker-switch']")).getText().contains("August"))
		{
			
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
			
			//driver.findElement(By.cssSelector("table[class=' table-condensed'] th[class='next']")).click(); //to click next button
		}
		
		List<WebElement> Date = driver.findElements(By.className("day"));
		for (int i=0; i<Date.size(); i++)
		{
			String day = Date.get(i).getText();
			if(day.equalsIgnoreCase("9"))
			{
				Date.get(i).click();
				break;
			}
		}
	}

}

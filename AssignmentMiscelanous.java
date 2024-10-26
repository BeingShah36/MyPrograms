package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentMiscelanous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption3")).click();
		String CheckboxText = driver.findElement(By.xpath("//label[@for='honda']")).getText();
		System.out.println(CheckboxText);
		Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
		
		dropdown.selectByVisibleText(CheckboxText);
		driver.findElement(By.id("name")).sendKeys(CheckboxText);
		driver.findElement(By.id("alertbtn")).click();
		String popup = driver.switchTo().alert().getText();
		System.out.println(popup);
		if (popup.contains(CheckboxText))
		{
			System.out.println("text is present");
				
		}
		else
		{
			System.out.println("text is not present");
		} 
	}

}

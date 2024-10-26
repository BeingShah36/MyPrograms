package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.name("name")).sendKeys("23qeter");
		driver.findElement(By.name("email")).sendKeys("312312@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("rhhrth");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement d = driver.findElement(By.id("exampleFormControlSelect1"));
		Select a = new Select(d);
		a.selectByIndex(1);
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.name("bday")).sendKeys("12/3/2005");
		driver.findElement(By.cssSelector("input.btn.btn-success")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}

}

package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.Configuration;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver","C:\\personal\\Selenium\\drivers\\chromedriver-win64\\chromedriver.exe");
		
       ChromeOptions ops = new ChromeOptions();

       ops.addArguments("--remote-allow-origins=*");
       WebDriver driver= new ChromeDriver(ops) ;
       
		
		
		
	driver.manage().window().maximize();	
	
	// static dropdown - value will be already selected andtag starts from select
	//driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	//WebElement d = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
	//Select dropdown = new Select(d);
	//dropdown.selectByIndex(2);
	//System.out.println(dropdown.getFirstSelectedOption().getText());
	
	//dropdown.selectByVisibleText("USD");
	//System.out.println(dropdown.getFirstSelectedOption().getText());
	
	//dropdown.selectByValue("INR");
	//System.out.println(dropdown.getFirstSelectedOption().getText());

	
	//Dynamic dropdown - it doesnot have any value and data is loaded only when we select an item
	
	driver.get("https://www.spicejet.com/");
	driver.findElement(By.xpath("(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-10paoce r-13qz1uu'])[1]")).click();
	
	driver.findElement(By.xpath("//div[text()='Belagavi']")).click();
	Thread.sleep(3000);
	//driver.findElement(By.xpath("//div[text()='Ajmer']")).click();
	
	driver.findElement(By.xpath("//div[text()='International']")).click();
	driver.findElement(By.xpath("(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1kfrs79'])[2]")).click();
	}

}

package intro;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		String[] a = {"Brocolli","Beetroot","Tomato"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		AddCart(driver, a);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacadem");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	
	

	}
	
	public static void AddCart(WebDriver driver,String[] a)
	{

    List<WebElement> b =	driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i=0; i<b.size();i++)
		{
			String[] c = b.get(i).getText().split("-");
			// c = Brocolli - 1kg
		
			//c[0]="Brocolli " c[1]=" 1kg"
			String d = c[0].trim();
			// d = Brocolli
			

			//convert array into array list for easy search because arraylist has methods for search
	    List e = Arrays.asList(a);
		int j=0;
		if(e.contains(d))
		{
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		}
			
		if(j==a.length)
		{
			break;
		
		}
		
		}
		
	}
		

	}



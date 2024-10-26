package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartMyntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          System.setProperty("webdriver.chrome.driver", "C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/men-formal-shirts");
		
		List<WebElement> a = driver.findElements(By.cssSelector("product-productMetaInfo"));
		
		for (int i=0; i<a.size();i++)
		{
			String b = a.get(i).getText();
			if (b.contains("Men Solid Slim Fit Formal Shirt"))
			{
				driver.findElements(By.cssSelector("span.product-wishlistFlex.product-actionsButton.product-wishlist ")).get(i).click();
			}
		}
	}

}

package Shah.Selenium;

import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class StandAloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String item = "ZARA COAT 3";

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		driver.findElement(By.id("userEmail")).sendKeys("shah@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Shah@!123");
		driver.findElement(By.id("login")).click();

		List<WebElement> SaveList = driver.findElements(By.cssSelector(".mb-3"));

		WebElement product = SaveList.stream().filter(s -> s.findElement(By.xpath("//h5/b")).getText().equals(item))
				.findFirst().orElse(null);
		product.findElement(By.cssSelector(".fa-shopping-cart")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#toast-container"))); // avoiding
																												// intercept
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();

		List<WebElement> cartList = driver.findElements(By.xpath("//div[@class='cartSection']/h3")); // verifying items
																										// from cart
		boolean verify = cartList.stream().anyMatch(s -> s.getText().equals(item));

		Assert.assertTrue(verify);
		driver.findElement(By.cssSelector("li[class='totalRow'] button[type='button']")).click();
		driver.findElement(By.cssSelector("input[placeholder='Select Country']")).sendKeys("sia"); // search in
																									// autosuggestive
																									// box
// wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("ta-results")));
		List<WebElement> droplist = driver.findElements(By.cssSelector(".ta-item"));
		droplist.stream().filter(s -> s.getText().equals("Indonesia")).findAny().orElse(null).click();

		/*
		 * for (int i=0; i<droplist.size(); i++) {
		 * if(droplist.get(i).getText().equals("Indonesia")) //same code as above {
		 * droplist.get(i).click(); break; } }
		 */

		driver.findElement(By.cssSelector(".action__submit ")).click();
		String msg = driver.findElement(By.cssSelector(".hero-primary")).getText();
		System.out.println(msg);
		Assert.assertTrue(msg.equalsIgnoreCase("Thankyou for the order."));

		driver.quit();
	}

}

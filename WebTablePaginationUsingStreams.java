package practica;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePaginationUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		List<String> getPrice;
		do {
		List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
		getPrice = rows.stream().filter(s -> s.getText().contains("Cheese")).map(s -> price(s))
				.collect(Collectors.toList());
		getPrice.forEach(a->System.out.println(a));
		if(getPrice.size()<1) {
		driver.findElement(By.xpath("//a[@aria-label='Next']")).click();
		}
		}
		while(getPrice.size()<1);
		
		driver.close();

	}

	private static String price(WebElement s) {
		String ok = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return ok;

	}
	
	
	
}

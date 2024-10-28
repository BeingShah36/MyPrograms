package practica;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePriceStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	//	driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
	List<String> amount =	elementList.stream().filter(s->s.getText().contains("Rice")).map(s->price(s)).collect(Collectors.toList());
	amount.forEach(b->System.out.println(b));
//	System.out.println(amount);
	}

	private static String price(WebElement s) {
		// TODO Auto-generated method stub
		String ok = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return ok; //tr/td[1]/following-sibling::td[1]
	}

}

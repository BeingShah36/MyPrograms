package practica;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> a = driver.findElements(By.xpath("//tr/td[1]"));

		List<String> b = a.stream().map(s -> s.getText()).collect(Collectors.toList());
		List<String> c = a.stream().map(s -> s.getText()).sorted().collect(Collectors.toList());
		Assert.assertTrue(b.equals(c));
		System.out.println(b.get(1) +" "+ c.get(2));
	}

}

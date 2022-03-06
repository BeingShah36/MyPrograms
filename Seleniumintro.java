package intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seleniumintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//chrome driver
		//System.setProperty("webdriver.chrome.driver", "C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
		
	//firefox driver
		//System.setProperty("webdriver.gecko.driver", "C:\\personal\\Selenium\\drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
	
		//edge driver
		System.setProperty("webdriver.edge.driver", "C:\\personal\\Selenium\\drivers\\edgedriver_win64\\ msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	driver.close();
		
	}

}

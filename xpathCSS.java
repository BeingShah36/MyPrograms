package intro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathCSS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
   
		System.setProperty("webdriver.chrome.driver", "C:\\personal\\Selenium\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://www.freshersworld.com/user/register?src=homeheader");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
			
		//css using id tagname#id
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("8thrhrthh");
		
		//css using attributes tagname[attribute='value']
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rthrthrth");
		
		//css with cascade class tagname.classname1.classname2   
		driver.findElement(By.cssSelector("button.submit.signInBtn")).click();
		
		//css with class tagname.classname 
	    System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	    
	    
	    //xpath with text()function //tagname[text()='text of link'],, text() used only for links
	    driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
	    
	    //to wait till the transition of screen completes otherwise locators will not be found
	    Thread.sleep(1000);
	    
	    //css with multiple attributes tagname[attribute='value'][attribute='value']
		driver.findElement(By.cssSelector("input[type='text'][placeholder='Name']")).sendKeys("jjtyjtyj");
		
		//xpath with attributes //tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("gergergerg");
		
		//xpath with multiples attributes of same element  //tagname[@attribute1='value1' and @attribute1='value1']
		driver.findElement(By.xpath("//input[@type='text' and @placeholder='Phone Number']")).sendKeys("9864578564");
		
		//css with * if attributes keeps changing tagname[attribute*='value']
		driver.findElement(By.cssSelector("button[class*=pwd]")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
		
		//xpath with parent to child tag - personally dnt recommend. will not find unique locator
		driver.findElement(By.xpath("//form/input[1]")).clear();
		
		//xpath with attribute which is not unique but can be used with index //tagname[@attribute='value'][index]
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		//xpath using conatins()function ,//tagname[contains(@attribute,'value')] = will not comes in contain function, //tagname[contains(text(),'value')]
		driver.findElement(By.xpath("//input[contains(@placeholder,'Phone')]")).clear();
		
		//xpath with parent attribute and similar child tag with index which can traverse with / //tagname[@attribute='value']tagname[index]
	    driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	    
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("inputUsername")).sendKeys("alshahbaz@gmail.com");
	    
	    driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	    
	    driver.findElement(By.id("chkboxOne")).click();
	    
	    driver.findElement(By.cssSelector("button.submit.signInBtn")).click();
	    
		 
		 
			
		
		
	}

}

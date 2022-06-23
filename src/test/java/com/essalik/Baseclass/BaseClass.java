package com.essalik.Baseclass;

import java.time.Duration;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.essalik.utilityclasses.signupDetails;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {

	
	


	public static WebDriver driver;
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser){
		
		BrowserSetup(browser);
		
		 logger=Logger.getLogger(BaseClass.class.getName());
		PropertyConfigurator.configure("log4j.properties");
		signupDetails details=new signupDetails();
		
		driver.get(details.getUrl());
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//PopupExit();
		languageSet();
		//PopupExit();
		
		logger.info(browser+"driver launched");
	}
	
	
	@AfterTest
	public void browserQuit() {
		driver.quit();
	}
	
	
	public void BrowserSetup(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup(); 
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup(); 
			driver=new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup(); 
			driver=new EdgeDriver();
		}else {
			System.out.println("Browser is not existed");
		}
	}
	
	public void languageSet() {
		
		
		WebElement lan=	driver.findElement(By.xpath("//div[@class='caption']"));
		click(lan);
		
		
		driver.findElement(By.id("uk")).click();
	}
	
	public  void PopupExit() {
		try {
		WebElement el=driver.findElement(By.xpath("//div[@class='modal-body']//button[@aria-label='Close']"));
		
		Actions act=new Actions(driver);
		act.click(el).perform();}
		catch(Exception e) {
			System.out.println("PopupExit FAIL");
		}
	}
	

	
	public  void click(WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ele);
	return;}
	
	
	
	
	
}

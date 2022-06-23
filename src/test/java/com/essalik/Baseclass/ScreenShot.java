package com.essalik.Baseclass;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class ScreenShot extends BaseClass{
	
	
	public static void Take(String img) throws Exception{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"//screenshots//"+img+".png");
		FileUtils.copyFile(src, target);
		}
	
	public static void Take(WebElement ele,String img) throws Exception {
		
		
		File src=ele.getScreenshotAs(OutputType.FILE);
		File target=new File(".//screenshots//"+img+".png");
		FileUtils.copyFile(src, target);
		
	}
	
	 public WebElement shot() {
		 return driver.findElement(By.xpath("//section[@class='inner-page']"));
	 }
	
}
//.//screenshots//signup.step-1.png
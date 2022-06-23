package com.essalik.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class JavaScriptExceutor extends SignUp{
	
	
	
	public JavaScriptExceutor(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public  void click(WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ele);
	return;}
	

}

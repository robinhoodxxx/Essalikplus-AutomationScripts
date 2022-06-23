package com.essalik.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Subscription {
	
	 WebDriver driver;
		
		public Subscription(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath="//span[normalize-space()='Settings']")
		private WebElement Settings;
		
		@FindBy(xpath="//span[normalize-space()='Package Subscription']")
		private WebElement subscription;
		
		@FindBy(xpath="//div[@class='box-body']//div[2]//div[1]//div[4]//a[1]")
		private WebElement Baseplan;
		
		

		public void ClickSettings() {
			Settings.click();
		}

		public void ClickSubscription() {
			JavaScriptExceutor js=new JavaScriptExceutor(driver);
			js.click(subscription);
			
		}
		
		public void ClickBaseplan() {
			Baseplan.click();
		}
	
		
		

}

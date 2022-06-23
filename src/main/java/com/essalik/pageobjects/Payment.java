package com.essalik.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	
	 WebDriver driver;
		
		public Payment(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		

		@FindBy(id="paymentdiv_stripe")
		private WebElement cardpayment;
		
		@FindBy(id="email")
		private WebElement Email;
		
		@FindBy(xpath="//iframe[@name='stripe_checkout_app']")
		private WebElement iframe;
		
		@FindBy(id="card_number")
		private WebElement CardNumber;
		
		@FindBy(id="cc-exp")
		private WebElement Expiry;
		
		@FindBy(id="cc-csc")
		private WebElement CVC;
		
		@FindBy(id="'submitButton")
		private WebElement Paybtn;
		
		@FindBy(xpath="//div[@class='col-md-12']//a//img")
		private WebElement PaypalBtn;
		
//		@FindBy(xpath="//div[@class='content']//a[@class='close right']")
//		private WebElement CardPaymentExit;
		
		@FindBy(xpath="//div[@class='toast-message']")
		private WebElement sucess;
		
		public void ClickCardPayment() {
			try {
			cardpayment.click();}
			catch(Exception e) {
				driver.navigate().refresh();
				ClickCardPayment();
			}
		}
		
		public void ClickPaypal() {
			 PaypalBtn.click();
		}
		
		
		public void setEmail(String email) {
			driver.switchTo().frame(iframe);
			Email.sendKeys(email);
		}
		
		
		public void setCardNumber(String cardNo) {
			for(int i=0;i<cardNo.length();i+=4) {
			CardNumber.sendKeys(cardNo.substring(i, i+4));}
		}
		
		public void setExpiryDate(String ExpDt) {
			for(int i=0;i<ExpDt.length();i+=2)
			Expiry.sendKeys(ExpDt.substring(i, i+2));
		}

		public void setCVC(String CvcNo) {
			CVC.sendKeys(CvcNo);
		}
		
		public void ClickPay() {
			Actions act=new Actions(driver);
			act.sendKeys(Keys.TAB).perform();
			act.sendKeys(Keys.ENTER).perform();
			//Paybtn.click();
			
		}
		
		public void ClickCardPaymentExit() {
			driver.switchTo().frame(iframe).close();
		}
		
		public boolean IspaymentSucess() {
			try {
			return sucess.getText().equalsIgnoreCase("success");}
			catch(Exception e) {
				return false;
			}
		}
		
		
}

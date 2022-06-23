package com.essalik.testcases1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.essalik.Baseclass.BaseClass;
import com.essalik.Baseclass.ScreenShot;
import com.essalik.pageobjects.Payment;

public class Payments extends BaseClass{
	
	String DebitCardNo="4000000760000002";
	String email="budw@gmail.com";
	String Expdate="1223";  //12 means month 23 is the year
	String cvc="123";
	
	@Parameters("payment")
	@Test
	public void pay(String payment) throws Exception  {
		
		
		if(payment.equalsIgnoreCase("card")) {
			CardPayment();
		}
		else if(payment.equalsIgnoreCase("paypal")) {
			paypal();
		}
		
	}
	
	
	
	
	
	
	
	
	
	//payment options
	
	
	private void paypal() {
		Payment payment=new Payment(driver);
		
		payment.ClickPaypal();
		
	}




	private void CardPayment() throws Exception  {
		
		Payment payment=new Payment(driver);
		
		payment.ClickCardPayment();
		Thread.sleep(1500);
		payment.setEmail(email);
		payment.setCardNumber(DebitCardNo);
		payment.setExpiryDate(Expdate);
		payment.setCVC(cvc);
		payment.ClickPay();
		Thread.sleep(6000);
		
		
		if(payment.IspaymentSucess()) {
			
		logger.info("CardPayment sucess");
		Assert.assertTrue(true);
		
		}
		else {
			logger.info("CardPayment fail");
			ScreenShot.Take("card");
			Assert.assertTrue(false);
			Reporter.log("<a href=\"./screenshots/card.png\"  target=\"_blank\">failed screenshot</a>");
			
		}
		
	}
	
	

}

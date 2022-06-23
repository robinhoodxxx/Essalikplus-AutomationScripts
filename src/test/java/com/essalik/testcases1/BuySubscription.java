package com.essalik.testcases1;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.essalik.Baseclass.BaseClass;
import com.essalik.Baseclass.ScreenShot;
import com.essalik.pageobjects.Subscription;

public class BuySubscription extends BaseClass{
	
	@Test
	public void subscribe() throws Exception {
		Subscription sub=new Subscription(driver);
		
		sub.ClickSettings();
		sub.ClickSubscription();
		sub.ClickBaseplan();
		
		if(driver.getCurrentUrl().equalsIgnoreCase("https://dev.essalikplus.com/subscription/1/pay/1")) {
		logger.info("BuySubscription success");
		Assert.assertTrue(true);
		}
		else {
			logger.info("BuySubscription fail");
			ScreenShot.Take("BuySubscription");
			System.out.println(driver.getCurrentUrl());
			
			//System.out.println(driver.getTitle());
			Assert.assertTrue(false);
		}
	}

}

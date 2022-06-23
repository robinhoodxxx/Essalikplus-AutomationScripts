package com.essalik.testcases1;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.essalik.Baseclass.BaseClass;
import com.essalik.Baseclass.ScreenShot;
import com.essalik.pageobjects.SignIn;
import com.essalik.utilityclasses.signupDetails;

public class SignIn_Testcase extends BaseClass{
	signupDetails s=new signupDetails();
	private String username=s.getUserName();
	private String password=s.getPassword();
	
	
	@Test
	public void SignIn() throws Exception {
		SignIn sign=new SignIn(driver);
		
		
		sign.ClickSigninbtn();
		
		
		
		sign.setUsernameName(username);
		
		sign.setPassword(password);
		
		sign.ClickRemember();
		
		
		sign.ClickLoginBtn();
		
		
		
		if(driver.getTitle().startsWith("Home")) {
			
			sign.ClickEndTour();
			
			logger.info("signIn sucess");
			assertTrue(true);
			
		}
		else{
		String err=	sign.LoginErrorMsg();
			logger.info(err);
			ScreenShot.Take("login");
			assertTrue(false);
		}
		
	}

}

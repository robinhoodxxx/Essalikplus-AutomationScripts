package com.essalik.testcases1;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.essalik.Baseclass.BaseClass;
import com.essalik.Baseclass.ScreenShot;
import com.essalik.pageobjects.SignUpStep_1;
import com.essalik.pageobjects.SignUpStep_2;
import com.essalik.pageobjects.SignUpStep_3;
import com.essalik.utilityclasses.signupDetails;





public class Sign_Up_Testcase_1 extends BaseClass{
	
	
	
	signupDetails details=new signupDetails();
	
	
	
	@Test
	public void SignupTest() throws Exception {
		
    
		
		
		SignUpStep_1 sign=new  SignUpStep_1(driver);
		 
		 
		 sign.signUpBtn();
		 Thread.sleep(1500);
		 
		 sign.setTxtBussinessName(details.getBusinessName());
		 sign.setDate(details.getDate());
		 sign.setCurrency(details.getCurrency());
		 sign.setUpload_Logo(details.getLogo());
		 sign.setBusinessContactNumber(details.getBussinessNumber());
		 sign.setAlternateContactNumber(details.getAlternateBussinessNumber());
		 
		 sign.setLicence(details.getLicenceType());
		
		 sign.setIdentificationNum(details.getIdentification());
		
		 sign.setWebSite(details.getWebsite());
		 sign.setTimeZone(details.getTimeZone());
		 
		 ScreenShot.Take("step-1");
		
		 sign.ClickStep_1_Next();
		 
		 
		logger.info("Step_1 signup sucess");
		 
		 Assert.assertTrue(true);
		// System.out.println("step_1");
		
	}
	
	@Test
	public void SignupTestStep_2() throws Exception {
		SignUpStep_2 sign=new  SignUpStep_2(driver);
		sign.setTax_Name(details.getTaxName());
		
		sign.setTax_No(details.getTaxNo());
		
		sign.setCity(details.getcity());
		sign.setZipCode(details.getZipcode());
		sign.setBuildingNumber(details.getBussinessNumber());
		sign.setStName(details.getStreet());
		sign.setDstName(details.getdistrict());
		sign.setAddNo(details.getAdditional());
		sign.setUnitNo(details.getUnitNo());
		sign.setRegion(details.getRegion());
		sign.setFinacial(details.getFysm());
		
		 ScreenShot.Take("step-2");
		sign.ClickStep_2_Next();
	
		logger.info("Step_2 signup sucess");
		 Assert.assertTrue(true);
		 
		 //System.out.println("step_2");
		
		
	}
	@Test
	public void SignupTestStep_3() throws Exception {
		SignUpStep_3 sign=new  SignUpStep_3(driver);
		sign.setPrefix(details.getPrefix());
		sign.setFirstName(details.getFirstName());
		sign.setLastName(details.getLastname());
		
		sign.setEmail(details.getEmail());
		
		sign.setUserName(details.getUserName());
		
		sign.setPassword(details.getPassword());
		sign.setConformPassword(details.getPassword());
		sign.setTermsConditions();
		 ScreenShot.Take("signup");
		sign.ClickRegister();
		
		Thread.sleep(3000);
		
	
	if(driver.getTitle().startsWith("Home")) {
		
		Assert.assertTrue(true);
		logger.info("signup sucess");
		
	}else {
		getError();
		Assert.assertTrue(false);
		logger.info("signup fail");
		System.out.println(driver.getTitle());
		ScreenShot.Take("signup");
	}
		
	
		
		
		//System.out.println(driver.getTitle().equalsIgnoreCase(details.getUrl()));
	
	}
	
	
	public void getError() {
		SignUpStep_3 sign=new  SignUpStep_3(driver);
		
			
			try {
				
				
	     if(!sign.getEmailExistederror().equals("")) {
				
				logger.info(sign.getEmailExistederror());
				
			}
			
	     
	     if(!sign.getUsernameExisted().equals("")) {
				
				logger.info(sign.getUsernameExisted());
				
			}
			
			
			if(!sign.getPasserror().equals("")) {
				
				logger.info(sign.getPasserror());
				
			}
			
			if(!sign.getPasswordNotMatch().equalsIgnoreCase("")) {
				logger.info(sign.getPasswordNotMatch());
				
			}
			System.out.println("error");
			//logger.info(sign.getUsernameExisted()+" kk");
			}
			catch(Exception e) {
				System.out.println("No error");
			}
			
			
		}
	
	
	
	
	
	
}
	



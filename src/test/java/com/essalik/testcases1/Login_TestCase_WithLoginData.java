package com.essalik.testcases1;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.essalik.Baseclass.BaseClass;
import com.essalik.Baseclass.ScreenShot;
import com.essalik.pageobjects.SignIn;
import com.essalik.utilityclasses.XLUtils;



public class Login_TestCase_WithLoginData extends BaseClass{
	
	
	
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String username,String password) throws Exception
	
	
	
	{
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		
		
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
			sign.ClickSignOut();
			
		}
		else{
		String err=	sign.LoginErrorMsg();
			logger.info(err);
			ScreenShot.Take("login"+timeStamp);
			assertTrue(false);
			
		}
		
	}
	
	
	
	
	
	
	
	@DataProvider(name="LoginData")
	private String [][] getData() throws IOException
	{
		//System.out.println(System.getProperty("user.dir"));
		String path=System.getProperty("user.dir")+"/src/main/java/com/essalik/testdata/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);//1 0
			}
				
		}
	return logindata;
	}

}

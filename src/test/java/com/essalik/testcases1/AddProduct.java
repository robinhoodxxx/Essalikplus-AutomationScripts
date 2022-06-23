package com.essalik.testcases1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.essalik.Baseclass.BaseClass;
import com.essalik.Baseclass.ScreenShot;
import com.essalik.pageobjects.AddProducts;

public class AddProduct extends BaseClass{
	
	String ProductName="mobile";
	
	
	
	@Test
	public void addproduct() throws Exception   {
		AddProducts add=new AddProducts(driver);
		
		
		
		
		add.ClickProducts();
		add.ClickAddProduct();
		
		add.setProductName(ProductName);
		
		add.ClickUnit();
		
		
		add.setQuantity("2");
		add.setExTax("100");
		
	
		
		add.ClickSave();
		
		if(driver.getTitle().startsWith("Add Opening Stock")) {
		logger.info("AddProduct success");
		Reporter.log("AddProduct success");
		Assert.assertTrue(true);
		}
		else {
			logger.info("AddProduct fail");
			Reporter.log("AddProduct fail");
			ScreenShot.Take("AddProduct");
			Assert.assertTrue(false);
		}
		
			
		
	}

}

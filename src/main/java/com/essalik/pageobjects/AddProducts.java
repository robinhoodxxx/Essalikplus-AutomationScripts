package com.essalik.pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddProducts {
	
	 WebDriver driver;
		
		public AddProducts(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath="//span[normalize-space()='Products']")
		private WebElement Products;
		
		@FindBy(xpath="//button[normalize-space()='End tour']")
		private WebElement EndTour;
		

		@FindBy(xpath="//span[normalize-space()='Add Product']")
		private WebElement AddProduct;
		
		@FindBy(id="name")
		private WebElement ProductName;

        
		@FindBy(xpath="//span[@id='select2-unit_id-container']")
		private WebElement Unit;
		
		@FindBy(xpath="//li[@id='select2-unit_id-result-ihg8-334']")
		private WebElement Unitoption;
		
		@FindBy(xpath="//input[@id='alert_quantity']")
		private WebElement Quantity;
		
		@FindBy(id="single_dpp")
		private WebElement Etax;
		
		@FindBy(id="opening_stock_button")
		private WebElement Save;
		
		
		public void ClickEndTour() {
			
			JavaScriptExceutor js=new JavaScriptExceutor(driver);
			js.click(EndTour);
			
		}
		
		
		public void ClickProducts() {
			Products.click();

		}
		
		public void ClickAddProduct() {
			AddProduct.click();
		}
		
		public void setProductName(String name) {
			 ProductName.sendKeys(name);
		}
		
		public void ClickUnit() {
			Unit.click();
			ClickOption();
			
		}
		
		public void ClickOption() {
			Actions act=new Actions(driver);
			act.sendKeys(Keys.ARROW_DOWN).perform();
			act.sendKeys(Keys.ENTER).perform();
		}
		
		public void setQuantity(String quantity) {
			Quantity.sendKeys(quantity);
		}
		
		public void setExTax(String tax) {
			Etax.sendKeys(tax);
		}
		
		public void ClickSave() {
			Save.click();
		}

}

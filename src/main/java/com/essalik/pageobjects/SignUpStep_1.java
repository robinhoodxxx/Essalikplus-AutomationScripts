package com.essalik.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpStep_1 extends SignUp{

	public SignUpStep_1(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	@FindBy(xpath="//a[@class='nav-link scrollto menu_bt'][normalize-space()='SIGN UP']")
	private WebElement signupbtn ;
	
	
	
	@FindBy(id="name")
	private WebElement BussinessName ;
	
	@FindBy(id="start_date")
	private WebElement Date ;
	
	@FindBy(id="currency_id")
	private WebElement CountryName ;
	
	@FindBy(id="business_logo")
	private WebElement Upload_Logo ;
	
	@FindBy(id="mobile")
	private WebElement BusinessContactNumber;
	
	@FindBy(id="alternate_number")
	private WebElement AlternateContactNumber;
	
	@FindBy(id="other_seller_id")
	private WebElement Licence;
	
	@FindBy(id="crNumber")
	private WebElement SellerId;
	
	@FindBy(id="website")
	private WebElement WebSite;
	
	@FindBy(id="time_zone")
	private WebElement TimeZone;
	
	@FindBy(xpath="(//input[@value='Next'])[1]")
	private WebElement Next;

	
	@FindBy(id="mobile-error")
	private WebElement mobile_error;
	
	@FindBy(id="alternate_number_error")
	private WebElement alt_number_error;
	
	
	@FindBy(id="crNumber-error")
	private WebElement SellerId_error;
	
	

	public void signUpBtn() {
		
		JavaScriptExceutor js=new JavaScriptExceutor(driver);
		js.click(signupbtn);
	}

	public void setTxtBussinessName(String BussName) {
		 BussinessName.sendKeys(BussName);
	}

	public void setDate(String date) {
		try {
		Date.sendKeys(date);}
		catch(Exception e) {}
	}

	public void setCurrency(String currency) {
		
		if(currency.equals("")) return;
	try {
		Select sel=new Select(CountryName);
		char ch=Character.toUpperCase(currency.charAt(0));
		
		currency=ch+currency.substring(1);
		
		
       List<WebElement> list=sel.getOptions();
		
		for(WebElement el:list) {
			if(el.getText().startsWith(currency)) {
				el.click();
				break;
			}
		}
	}catch(Exception e) {}
	}
		

	public void setUpload_Logo(String upload_Logo) {
		try{Upload_Logo.sendKeys(System.getProperty("user.dir")+"//uploadBusinessLogo//"+upload_Logo);
		
		}catch(Exception e) {}
	}

	public void setBusinessContactNumber(String businessContactNumber) {
		BusinessContactNumber.sendKeys(businessContactNumber);
	}

	public void setAlternateContactNumber(String alternateContactNumber) {
		AlternateContactNumber.sendKeys(alternateContactNumber);
	}

	public void setLicence(String licence) {
		
	if(licence.equals("")) return;
	
	  try {  Select sel=new Select(Licence);
		sel.selectByVisibleText(licence);
	}catch(Exception e) {}
			
			
		
	}

	public void setIdentificationNum(String IdNum) {
		SellerId.sendKeys(IdNum);
	}

	public void setWebSite(String webSite) {
		WebSite.sendKeys(webSite);
	}

	public void setTimeZone(String timezone) {
		
		
		
		Select sel=new Select(TimeZone);
		sel.selectByValue(timezone);
	}

	public void ClickStep_1_Next() {
		JavaScriptExceutor js=new JavaScriptExceutor(driver);
		js.click(Next);
	}

	
	public void getBusNumError() {
		
		mobile_error.getText();
		
	}
	
     public void getAltNumError() {
		
    	 alt_number_error.getText();
		
	}

   public void getSellerId_error() {
	
	   SellerId_error.getText();
	
  }
	
}

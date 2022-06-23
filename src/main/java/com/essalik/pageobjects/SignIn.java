package com.essalik.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	 WebDriver driver;
	
	public SignIn(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//a[normalize-space()='SIGN IN']")
	private WebElement signinbtn;
	
	

	@FindBy(id="username")
	private WebElement UsernameName ;
	

	@FindBy(id="password")
	private WebElement Password ;
	
	@FindBy(xpath="//input[@name='remember']")
	private WebElement Remember;
	
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	private WebElement Login;
	
	@FindBy(xpath="//label[@for='landmark']")
	private WebElement LoginDataWrong;

	@FindBy(xpath="//button[normalize-space()='End tour']")
	private WebElement EndTour;
	
	@FindBy(xpath="//li[@class='dropdown user user-menu']")
	private WebElement DropDown;

	@FindBy(xpath="//a[normalize-space()='Sign Out']")
	private WebElement SignOut;
	
	
	
	
	public void ClickEndTour() {
		
		JavaScriptExceutor js=new JavaScriptExceutor(driver);
		js.click(EndTour);
		
	}
	
	
	public  void ClickSigninbtn() {
		
		 JavaScriptExceutor js=new JavaScriptExceutor(driver);
			js.click(signinbtn);
	}


	public void setUsernameName(String email) {
		UsernameName.sendKeys(email);;
	}


	public void setPassword(String password) {
		 Password.sendKeys(password);
	}

	
	public void ClickRemember() {
		Remember.click();
	}

	public void ClickLoginBtn() {
		 Login.click();
	}
	
	public String LoginErrorMsg() {
		return LoginDataWrong.getText();
	}
	
	
	public void ClickSignOut() {
		DropDown.click();
		SignOut.click();
	}
	
	

}

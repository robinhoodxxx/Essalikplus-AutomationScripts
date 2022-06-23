package com.essalik.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpStep_3 extends SignUp{

	public SignUpStep_3(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="surname")
	private WebElement Prefix;
	

	@FindBy(id="first_name")
	private WebElement FirstName;
	
	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy(id="email")
	private WebElement Email;
	
	@FindBy(id="username")
	private WebElement UserName;
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(id="confirm_password")
	private WebElement ConformPassword;
	
	@FindBy(id="option")
	private WebElement TermsConditions;
	
	@FindBy(xpath="//input[@value='Register']")
	private WebElement Register;
	
	@FindBy(xpath="//label[@id='password_validation_error']")
	private WebElement passerror;
	
	@FindBy(id="password_not_match")
	private WebElement PasswordNotMatch;
	
	

	@FindBy(id="email2-error")
	private WebElement EmailExisted;
	
	@FindBy(id="username2-error")
	private WebElement UsernameExisted;
	

	

	public void setPrefix(String prefix) {
		Prefix.sendKeys(prefix);
	}

	public void setFirstName(String firstName) {
		FirstName.sendKeys(firstName);
	}

	public void setLastName(String lastName) {
		LastName.sendKeys(lastName);
	}

	public void setEmail(String email) {
		Email.sendKeys(email);
	}

	public void setUserName(String userName) {
		UserName.sendKeys(userName);
	}

	public void setPassword(String password) {
		Password.sendKeys(password);
	}

	public void setConformPassword(String conformPassword) {
		ConformPassword.sendKeys(conformPassword);
	}

	public void setTermsConditions() {
		TermsConditions.click();
	}

	public void ClickRegister() {
		//Register.click();
		JavaScriptExceutor js=new JavaScriptExceutor(driver);
		js.click(Register);
		
		
		
	}

	public String getPasserror() {
		try {
		return passerror.getText();}
		catch(Exception e) {
			return "";
		}
	}
	
	
	public String getPasswordNotMatch() {
		try {
		return PasswordNotMatch.getText();}
		catch(Exception e) {
			return "";
		}
	}
	
	
	public String  getEmailExistederror() {
		try {
		return EmailExisted.getText();}
		catch(Exception e) {
			return "";
		}
	}

	public String  getUsernameExisted() {
		try{return UsernameExisted.getText();
		}
		catch(Exception e) {
			return "";
		}
	}
	
	
	
	
	
	
}

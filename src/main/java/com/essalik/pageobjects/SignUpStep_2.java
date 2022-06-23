package com.essalik.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpStep_2 extends SignUp{

	public SignUpStep_2(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(id="tax_label_1")
	private WebElement Tax_1;
	
	@FindBy(id="tax_number_1")
	private WebElement Tax_No;
	
	@FindBy(id="city")
	private WebElement City;
	
	@FindBy(id="zip_code")
	private WebElement ZipCode;
	
	@FindBy(id="building_no")
	private WebElement BuildingNumber;
	
	@FindBy(id="street_name")
	private WebElement StName;
	
	@FindBy(id="district_name")
	private WebElement DstName;
	
	@FindBy(id="additional_info")
	private WebElement AddNo;
	
	@FindBy(id="unit_no")
	private WebElement UnitNo;
	
	@FindBy(id="region")
	private WebElement Region;
	
	@FindBy(id="fy_start_month")
	private WebElement Finacial;
	
	@FindBy(xpath="//div[@id='form-2']//input[@value='Next']")
	private WebElement Step_2_Next;
	
	
	
	
	public void setTax_Name(String tax1) {
		if(tax1.equals(""))return;
		Tax_1.clear();
		tax1=tax1.toUpperCase();
		Tax_1.sendKeys(tax1);
	}

	public void setTax_No(String tax_No) {
		Tax_No.sendKeys(tax_No);
	}

	public void setCity(String city) {
		City.sendKeys(city);
	}

	public void setZipCode(String zipCode) {
		try {
		ZipCode.sendKeys(zipCode);}
		catch(Exception e) {}
	}

	public void setBuildingNumber(String buildingNumber) {
		BuildingNumber.sendKeys(buildingNumber);
	}

	public void setStName(String stName) {
		StName.sendKeys(stName);
	}

	public void setDstName(String dstName) {
		DstName.sendKeys(dstName);
	}

	public void setAddNo(String addNo) {
		AddNo.sendKeys(addNo);
	}

	public void setUnitNo(String unitNo) {
		UnitNo.sendKeys(unitNo);
	}

	public void setRegion(String region) {
		if(region.equals("")) return;
		try {
		region=Character.toUpperCase(region.charAt(0))+region.substring(1);
		Select sel=new Select(Region);
		sel.selectByValue(region);
		}
		catch(Exception e) {}
	}

	public void setFinacial(String finacial) {
		if(finacial.equals("")) return;
		
		try {
		finacial=Character.toUpperCase(finacial.charAt(0))+finacial.substring(1);
		Select sel=new Select(Finacial);
		sel.selectByVisibleText(finacial);}
		catch(Exception e) {}
		
	}

	public void ClickStep_2_Next() {
		JavaScriptExceutor js=new JavaScriptExceutor(driver);
		js.click(Step_2_Next);
	}




}

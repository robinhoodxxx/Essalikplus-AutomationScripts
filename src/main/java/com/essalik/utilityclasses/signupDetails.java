package com.essalik.utilityclasses;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class signupDetails {
	Properties pro;
	
	
	public signupDetails() {
	File src=new File("./DataEnter/signup");
	
	try {
		FileInputStream fis=new FileInputStream(src);
		pro =new Properties();
		pro.load(fis);
	}
	catch (Exception e) {
		System.out.println("Exception is "+ e.getMessage());
	}
	
	}
	
	
	public String getUrl() {
		return pro.getProperty("URL");
	}
	
	public String getBusinessName() {
		return pro.getProperty("BusinessName");
	}
	
	public String getDate() {
		return pro.getProperty("Start_Date");
	}
	
	public String getCurrency() {
		
	try {
	return pro.getProperty("Currency");}
	catch(Exception e) {
		return "";
	}
	}
	
	public String getLogo() {
		
		return pro.getProperty("UploadLogo");}
	
	public String getBussinessNumber() {
		return pro.getProperty("Business_Contact_Number");
	}
	
	
	public String getAlternateBussinessNumber() {
		return pro.getProperty("Alternate_Contact_Number");
	}
	
	public String getLicenceType() {
		try {
		return pro.getProperty("Licence_Type");}
		catch(Exception e) {
			System.out.println("exception licence");
			return "";
		}
	}
	
	
	
	public String getIdentification() {
		return pro.getProperty("Identification_Number");
	}
	
	public String getWebsite() {
		return pro.getProperty("Website");
	}
	
	public String getTimeZone() {
		if( pro.getProperty("TimeZone")==null) return "";
		
	return pro.getProperty("TimeZone");}
	
	
	
	                        /// step_2
	
	public String getTaxName() {
		try {
		return pro.getProperty("Tax_1_Name");}
		catch(Exception e) {
			return "";
		}
		}
	
	
      public String getTaxNo() {
		
		return pro.getProperty("Tax_No_1");}
      
      
      public String getcity() {
  		
  		return pro.getProperty("City");}
      
      
      public String getZipcode() {
  		
  		return pro.getProperty("ZipCode");}
      
      
      public String getBuildingName() {
  		
  		return pro.getProperty("Builiding_Number");}
      
      
      public String getStreet() {
  		
  		return pro.getProperty("Street_Name");}
      
      
      public String getdistrict() {
  		
  		return pro.getProperty("District_Name");}
      
      
      public String getAdditional() {
  		
  		return pro.getProperty("Additional_No");}
      
      public String getUnitNo() {
  		
  		return pro.getProperty("Unit_No");}
      
      public String getRegion() {
  		try {
  		return pro.getProperty("Region");}
  		catch(Exception e) {
  			return "";
  		}
  		}
      
      public String getFysm() {
  		try {
  		return pro.getProperty("Financial_Year_Start_Month");}
  		catch(Exception e) {
  			return "";
  		}
  		
      }
      
      
                         //step_3
      
      public String getPrefix() {
    		
    		return pro.getProperty("Prefix");}
      
      public String getFirstName() {
    		
    		return pro.getProperty("First_Name");}
      
      public String getLastname() {
    		
    		return pro.getProperty("Last_Name");}
      
      public String getEmail() {
    		
    		return pro.getProperty("Email");}
      
      public String getUserName() {
    		
    		return pro.getProperty("User_Name");}
      
      public String getPassword() {
  		
  		return pro.getProperty("Password");}
      
      public String getConformPass() {
  		
  		return pro.getProperty("Conform_Password");}
	
	
	
}

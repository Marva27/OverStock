package com.srinimarva.overstock.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
	
	@FindBy(xpath=".//*[@id='user-account']/div[1]/div/div[2]/span/a/span")
	WebElement lblCustomerName;
	
	public boolean verifyLoginIsSuccess(String customerName){
		try{
			String expectedText = "Hi "+customerName;
			if(lblCustomerName.getText().equals(expectedText)){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
	}

}

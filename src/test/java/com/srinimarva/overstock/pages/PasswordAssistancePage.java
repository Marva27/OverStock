package com.srinimarva.overstock.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordAssistancePage {
	
	@FindBy(xpath=".//*[@id='stage1reset']")
	WebElement btnResetPassword;
	
	@FindBy(xpath=".//*[@id='passwordReset']/div[2]/div/form/h2")
	WebElement h2PasswordAssistance;
	
	@FindBy(xpath=".//*[@id='pwdResetForm1']/div[2]")
	WebElement lblPasswordResetMsg;
	
	@FindBy(xpath=".//*[@id='pwdResetForm1']/div[1]/input")
	WebElement txtEmail;
	
	public boolean isPasswordAssistancePageDisplayed(){
		try{
			if(h2PasswordAssistance.isDisplayed()){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public void retrieveForgotPassword(String emailAddress) {
		try{
			txtEmail.sendKeys(emailAddress);
			btnResetPassword.click();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public boolean verifyPasswordReset(String alertMsg) {
		try{
			if(lblPasswordResetMsg.getText().equals(alertMsg)){
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

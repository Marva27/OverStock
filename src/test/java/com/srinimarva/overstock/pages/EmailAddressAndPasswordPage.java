package com.srinimarva.overstock.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailAddressAndPasswordPage {
	
	@FindBy(xpath=".//*[@id='email-data']/div[3]/span")
	WebElement btnEditEmailAddress;
	@FindBy(xpath=".//*[@id='password-data']/div[3]/span")
	WebElement btnEditPassword;
	@FindBy(xpath=".//*[@id='password-form']/form/div[4]/div[2]/button")
	WebElement btnSave;
	
	@FindBy(xpath=".//*[@id='main-content']/div/h1")
	WebElement h1PageTitle;
	
	@FindBy(xpath=".//*[@id='main-content']/div/div/div[1]/div/div")
	WebElement lblStatusUpdate;
	@FindBy(xpath=".//*[@id='password-form']/div[1]/div/div")
	WebElement lblPasswordChangeError;
	
	@FindBy(xpath=".//*[@id='password-form']/form/div[1]/div[2]/input")
	WebElement txtCurrentPassword;
	@FindBy(xpath=".//*[@id='password-form']/form/div[2]/div[2]/input")
	WebElement txtNewPassword;
	@FindBy(xpath=".//*[@id='password-form']/form/div[3]/div[2]/input")
	WebElement txtConfirmPassword;
	
	public boolean isPageDisplayed(String pageTitle) {
		try{
			if(h1PageTitle.getText().equals(pageTitle)){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public boolean verifyStatusMsg(String alertMessage) {
		try{
			if(lblStatusUpdate.getText().equals(alertMessage)){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public boolean verifyFailureMsg(String alertMessage) {
		try{
			if(lblPasswordChangeError.getText().equals(alertMessage)){
				return true;
			}else{
				return false;
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public void updatePassword(String currentPassword, String newPassword, String confirmPassword) {
		try{
			btnEditPassword.click();
			txtCurrentPassword.sendKeys(currentPassword);
			txtNewPassword.sendKeys(newPassword);
			txtConfirmPassword.sendKeys(confirmPassword);
			btnSave.click();
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
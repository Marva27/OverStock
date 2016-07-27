package com.srinimarva.overstock.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {
	
	@FindBy(xpath=".//*[@id='loginForm']/div[3]/button")
	WebElement btnSignIn;
	
	@FindBy(xpath=".//*[@id='msgIdmmrka']")
	WebElement lblAlertMsg;
	
	@FindBy(xpath=".//*[@id='loginForm']/div[3]/div/a")
	WebElement linkForgotPassword;
	
	@FindBy(xpath=".//*[@id='loginEmailInput']")
	WebElement txtEmail;
	@FindBy(xpath=".//*[@id='loginPasswordInput']")
	WebElement txtPassword;
	
	public void doLogin(String email, String password) {
		try{
			txtEmail.clear();
			txtEmail.sendKeys(email);
			txtPassword.clear();
			txtPassword.sendKeys(password);
			btnSignIn.click();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public boolean verifyAlertMsg(WebDriver browser, String alertMsg) {
		try{
			btnSignIn.click();
			WebDriverWait wait = new WebDriverWait(browser, 10);
			wait.until(ExpectedConditions.visibilityOf(browser.findElement(By.id("msgIdmmrka"))));
			//PageFactory.initElements(browser, SignInPage.class);
			System.out.println(lblAlertMsg.getText());
			if(lblAlertMsg.getText().trim().equals(alertMsg)){
				System.out.println(lblAlertMsg.getText().trim());
				System.out.println(alertMsg);
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

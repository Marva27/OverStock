package com.srinimarva.overstock.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainPage {
	
	@FindBy(xpath=".//*[@id='user-account']/div[1]/div/div[2]/span/a/span")
	WebElement lblCustomerName;
	
	@FindBy(xpath=".//*[@id='sign-in-out']")
	WebElement linkSignOut;
	
	@FindBy(xpath=".//*[@id='dropdown-user-temp']/ul/li[4]/a")
	WebElement mnuMyAccount;
	
	@FindBy(xpath=".//*[@id='search-input']")
	WebElement txtSearch;
	
	public void clickSearchTextbox() {
		try{
			txtSearch.click();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
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
	
	public void navigateToMyAccount(WebDriver browser){
		try{
			Actions actions = new Actions(browser);
			actions.moveToElement(lblCustomerName).build().perform();
			actions.moveToElement(mnuMyAccount).click().build().perform();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public void signOutFromAccount(WebDriver browser) {
		try{
			Actions actions = new Actions(browser);
			actions.moveToElement(lblCustomerName).build().perform();
			actions.moveToElement(linkSignOut).click().build().perform();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

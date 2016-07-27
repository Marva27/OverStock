package com.srinimarva.overstock.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath=".//*[@id='cboxClose']")
	WebElement btnCloseCoupon;
	@FindBy(xpath=".//*[@id='dropdown-user-temp']/ul/li[1]/a")
	WebElement btnSignIn;
	
	@FindBy(xpath=".//*[@id='user-account']/div[1]/div/div[2]/span/a")
	WebElement linkAccount;
	@FindBy(xpath=".//*[@id='search-nav-container']/div[4]/a/div[1]/span[1]")
	WebElement linkGetPaidToShop;
	
	public void closeCouponBox() {
		try{
			if(btnCloseCoupon.isDisplayed()){
				btnCloseCoupon.click();
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public void navigateToSignIn(WebDriver browser){
		try{
			Actions actions = new Actions(browser);
			actions.moveToElement(linkAccount).build().perform();
			actions.moveToElement(btnSignIn).click().build().perform();
			actions.moveToElement(linkGetPaidToShop).build().perform();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}

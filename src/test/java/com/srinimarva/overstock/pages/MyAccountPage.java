package com.srinimarva.overstock.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

	@FindAll({@FindBy(xpath=".//*[@id='left-menu']/li")})
	List<WebElement> mainMenuWithSubMenus;
	@FindAll({@FindBy(xpath=".//*[@id='left-menu']/li[6]/ul/li/a")})
	List<WebElement> mnuAccountSettingsSubMenuOptions;
	
	@FindBy(xpath=".//*[@id='search-input']")
	WebElement txtSearch;
	
	public void selectMenuOption(String menuOption, String subMenuOption, WebDriver browser) {
		try{
			for(WebElement mainMenu:mainMenuWithSubMenus){
				if(mainMenu.getText().equals(menuOption)){
					mainMenu.click();
					PageFactory.initElements(browser, MyAccountPage.class);
					if(!subMenuOption.equals("")){
						for(WebElement subMenu:mnuAccountSettingsSubMenuOptions){
							if(subMenu.getText().equals(subMenuOption)){
								subMenu.click();
								break;
							}
						}
					break;
					}
				}
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

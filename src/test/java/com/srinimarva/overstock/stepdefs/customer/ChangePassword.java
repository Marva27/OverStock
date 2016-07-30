package com.srinimarva.overstock.stepdefs.customer;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.srinimarva.overstock.pages.EmailAddressAndPasswordPage;
import com.srinimarva.overstock.pages.HomePage;
import com.srinimarva.overstock.pages.MainPage;
import com.srinimarva.overstock.pages.MyAccountPage;
import com.srinimarva.overstock.util.Utility;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ChangePassword {
	
	Utility utility;
	
	WebDriver browser;
	
	HomePage homePage;
	MainPage mainPage;
	MyAccountPage myAccountPage;
	EmailAddressAndPasswordPage emailAddressAndPasswordPage;
	
	@Given("^I am on the My Account page$")
	public void navigateToMyAccount() throws IOException {
		ChangePassword changePassword = new ChangePassword();
		Class classChangePassword = changePassword.getClass();
		utility=Utility.getInstance(classChangePassword.getSimpleName());
	    browser = Utility.getBrowser(utility);
	    mainPage = PageFactory.initElements(browser, MainPage.class);
	    mainPage.navigateToMyAccount(browser);
	    mainPage.clickSearchTextbox();
	}
	
	@When("^I select \"([^\"]*)\" menu option and select \"([^\"]*)\" sub-menu option$")
	public void selectMyAccountMenuOption(String mainMenu, String subMenu) {
	    myAccountPage = PageFactory.initElements(browser, MyAccountPage.class);
	    myAccountPage.selectMenuOption(mainMenu, subMenu, browser);
	}
	
	@Then("^I should see \"([^\"]*)\" page$")
	public void seeDesiredPage(String pageTitle) {
		emailAddressAndPasswordPage = PageFactory.initElements(browser, EmailAddressAndPasswordPage.class);
		Assert.assertTrue("Is Email Address And Password page displayed?",emailAddressAndPasswordPage.isPageDisplayed(pageTitle));
	}

	@When("^I enter Current Password, New Password, Confirm Password and hit the Save button$")
	public void changePasswordAndClickSave(DataTable table) throws IOException {
		try{
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//project.properties");
		    Properties properties = new Properties();
		    properties.load(fis);
		    List<List<String>> data = table.raw();
		    String emailAddress = properties.getProperty("Email");
		    String currentPassword = properties.getProperty("Password");
		    String newPassword = data.get(1).get(1);
		    String confirmPassword = data.get(2).get(1);
		    emailAddressAndPasswordPage.updatePassword(currentPassword, newPassword, confirmPassword);
		    emailAddressAndPasswordPage = PageFactory.initElements(browser, EmailAddressAndPasswordPage.class);
		    OutputStream os = new FileOutputStream(System.getProperty("user.dir")+"//src//test//resources//project.properties");
		    properties.setProperty("Email", emailAddress);
		    properties.setProperty("Password", newPassword);
		    properties.store(os, null);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	@Then("^I should see \"([^\"]*)\" and I sign out of my account$")
	public void seeAlertMessage(String alertMessage) {
		emailAddressAndPasswordPage = PageFactory.initElements(browser, EmailAddressAndPasswordPage.class);
	    Assert.assertTrue("Password successfully updated.",emailAddressAndPasswordPage.verifyStatusMsg(alertMessage));
	    mainPage = PageFactory.initElements(browser, MainPage.class);
	    mainPage.signOutFromAccount(browser);
	    homePage = PageFactory.initElements(browser, HomePage.class);
	    homePage.clickOkGotIt();
	}
	
	@Then("^I should see \"([^\"]*)\"$")
	public void seeFailureMsg(String failureMsg) {
		emailAddressAndPasswordPage = PageFactory.initElements(browser, EmailAddressAndPasswordPage.class);
		Assert.assertTrue("Password updated failed.",emailAddressAndPasswordPage.verifyFailureMsg(failureMsg));
	}

}

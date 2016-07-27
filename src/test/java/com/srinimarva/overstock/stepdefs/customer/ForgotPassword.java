package com.srinimarva.overstock.stepdefs.customer;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.srinimarva.overstock.pages.HomePage;
import com.srinimarva.overstock.pages.PasswordAssistancePage;
import com.srinimarva.overstock.pages.SignInPage;
import com.srinimarva.overstock.util.Utility;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForgotPassword {
	
	Utility utility;
	
	WebDriver browser;
	
	HomePage homePage;
	SignInPage signInPage;
	PasswordAssistancePage passwordAssistancePage;
	
	@Given("^I am on Password Assistance page$")
	public void navigateToPasswordAssistancePage() throws IOException {
		ForgotPassword forgotPassword = new ForgotPassword();
		Class classForgotPassword = forgotPassword.getClass();
		utility=Utility.getInstance(classForgotPassword.getName());
	    browser = Utility.getBrowser(utility);
	    homePage = PageFactory.initElements(browser, HomePage.class);
	    homePage.navigateToSignIn(browser);
	    signInPage = PageFactory.initElements(browser, SignInPage.class);
	    signInPage.clickForgotPassword();
	    passwordAssistancePage = PageFactory.initElements(browser, PasswordAssistancePage.class);
	}

	@When("^I enter a Email Address and hit Reset Password button$")
	public void attemptPasswordReset(DataTable table) {
	    List<List<String>> data = table.raw();
	    String emailAddress = data.get(1).get(1);
	    passwordAssistancePage.retrieveForgotPassword(emailAddress);
	}

	@Then("^I should see a message saying \"([^\"]*)\" Email Address entered$")
	public void i_should_see_a_message_saying_Email_Address_entered(String arg1) {
	    browser.quit();
	}

	@Then("^I should see a message saying \"([^\"]*)\"$")
	public void i_should_see_a_message_saying(String arg1) {
	   
	}

}

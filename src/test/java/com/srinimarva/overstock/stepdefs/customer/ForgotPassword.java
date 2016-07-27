package com.srinimarva.overstock.stepdefs.customer;

import org.openqa.selenium.WebDriver;

import com.srinimarva.overstock.pages.HomePage;
import com.srinimarva.overstock.pages.PasswordAssistancePage;
import com.srinimarva.overstock.pages.SignInPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForgotPassword {
	
	WebDriver browser;
	
	HomePage homePage;
	SignInPage signInPage;
	PasswordAssistancePage passwordAssistancePage;
	
	@Given("^I am on Sign In page$")
	public void navigateToSignInPage() {

	}
	
	@When("^I click the Forgot your password\\? link$")
	public void navigateToPasswordAssistance() {
		signInPage.clickForgotPassword();
	}
	
	@Then("^I should see Password Assistance page$")
	public void verifyPasswordAssistancePage() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^I enter a Email Address and hit Reset Password button$")
	public void i_enter_a_Email_Address_and_hit_Reset_Password_button(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	}

	@Then("^I should see a message saying \"([^\"]*)\" Email Address entered$")
	public void i_should_see_a_message_saying_Email_Address_entered(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^I should see a message saying \"([^\"]*)\"$")
	public void i_should_see_a_message_saying(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	}

}

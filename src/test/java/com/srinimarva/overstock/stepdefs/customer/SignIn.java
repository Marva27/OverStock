package com.srinimarva.overstock.stepdefs.customer;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.srinimarva.overstock.pages.HomePage;
import com.srinimarva.overstock.pages.MainPage;
import com.srinimarva.overstock.pages.SignInPage;
import com.srinimarva.overstock.util.Utility;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignIn {
	
	Utility utility;
	
	WebDriver browser;
	
	HomePage homePage;
	SignInPage signInPage;
	MainPage mainPage;
	
	@Given("^I navigate to Sign In page$")
	public void navigateToSignInPage() throws IOException {
		SignIn signIn = new SignIn();
		Class classSignIn = signIn.getClass();
		utility=Utility.getInstance(classSignIn.getSimpleName());
	    browser = Utility.getBrowser(utility);
	    homePage = PageFactory.initElements(browser, HomePage.class);
	    homePage.navigateToSignIn(browser);
	    browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    signInPage = PageFactory.initElements(browser, SignInPage.class);
	}

	@When("^I enter credentials and hit Sign In button$")
	public void attemptLogin(DataTable table) {
	    List<List<String>> data = table.raw();
	    String email = data.get(1).get(1);
	    String password = data.get(2).get(1);
	    signInPage = PageFactory.initElements(browser, SignInPage.class);
	    signInPage.doLogin(email, password);
	}

	@Then("^I should see Hi Customer Name$")
	public void greetCustomer(DataTable table) {
	    List<List<String>> data = table.raw();
	    String customerName = data.get(1).get(1);
	    mainPage = PageFactory.initElements(browser, MainPage.class);
	    mainPage.verifyLoginIsSuccess(customerName);
	}

	@Then("^I should see an alert message saying \"([^\"]*)\"$")
	public void seeAlertMsg(String alertMsg) {
		Assert.assertTrue("Invalid login attempt"+"-"+alertMsg, signInPage.verifyAlertMsg(browser, alertMsg));
	}
	
	@Then("^I close the browser$")
	public void i_close_the_browser() {
	    browser.quit();
	}

}

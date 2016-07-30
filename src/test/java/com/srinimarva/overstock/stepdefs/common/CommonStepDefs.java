package com.srinimarva.overstock.stepdefs.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.srinimarva.overstock.pages.HomePage;
import com.srinimarva.overstock.pages.SignInPage;
import com.srinimarva.overstock.util.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonStepDefs {
	
	Utility utility;
	WebDriver browser;
	HomePage homePage;
	SignInPage signInPage;
	
	@Given("^I open \"([^\"]*)\" browser to execute \"([^\"]*)\" test$")
	public void i_Open_Browser(String browserType, String featureName) throws IOException {
		utility = Utility.getInstance(featureName);
	    if(Utility.getBrowser(utility)==null){
	    	browser = utility.openBrowser(browserType, featureName);
	    }else{
	    	browser = Utility.getBrowser(utility);
	    }
	}

	@Given("^I connect to \"([^\"]*)\" website$")
	public void i_Connect_URL(String url) {
		browser.manage().deleteAllCookies();
	    browser.get(url);
	    browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    browser.manage().window().maximize();
	    homePage = PageFactory.initElements(browser, HomePage.class);
	    homePage.closeCouponBox();
	}
	
	@When("^I login to my account$")
	public void i_login_to_my_account() throws IOException {
	    FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//project.properties");
	    Properties properties = new Properties();
	    properties.load(fis);
	    homePage.navigateToSignIn(browser);
	    signInPage = PageFactory.initElements(browser, SignInPage.class);
	    signInPage.doLogin(properties.getProperty("Email"), properties.getProperty("Password"));
	}

}

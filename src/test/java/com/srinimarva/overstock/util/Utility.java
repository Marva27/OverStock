package com.srinimarva.overstock.util;

import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Utility {
	
	public WebDriver browser;
	public static HashMap<Utility,WebDriver> instanceBrowserMap = new HashMap<Utility,WebDriver>();
	public static HashMap<String,Utility> instanceMap = new HashMap<String,Utility>();;
	
	public static Utility getInstance(String instanceName) throws IOException {
		try{
			if(instanceMap.get(instanceName) == null){
				instanceMap.put(instanceName, new Utility());
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return instanceMap.get(instanceName);
	}
	
	public WebDriver openBrowser(String browserType, String featureName) {
		try{
			browser = instanceBrowserMap.get(featureName);
			if(browser==null) {
				if(browserType.equals(Constants.MOZILLA)) {
					browser = new FirefoxDriver();
				}else if(browserType.equals(Constants.CHROME)) {
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//test//resources//chromedriver");
					browser = new ChromeDriver();
				}else if(browserType.equals(Constants.INTERNETEXPLORER)) {
					browser = new InternetExplorerDriver();
				}
			}else{
				return browser;
			}
			instanceBrowserMap.put(instanceMap.get(featureName), browser);
			return browser;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return null;
		}
		
		
	}
	
	public static WebDriver getBrowser(Utility utility) {
		return instanceBrowserMap.get(utility);
	}

}

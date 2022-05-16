package com.vandvtechsolutions.inetbanking.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.vandvtechsolutions.inetbanking.pageobjects.LoginPage;
import com.vandvtechsolutions.inetbanking.testbase.TestBase;

public class LoginTC001 extends TestBase {

	//@Test
	//public void verifyLoginFunctionalityTC001()
	//{
	
	//LoginPage login = new LoginPage(driver);
	//login.setUsername(configdataprovider.getUserName()); 
	//login.setPassword(configdataprovider.getPassword());
	//login.clickOnLoginBtn();
	//}
	
	
	@Test
	public void verifyLoginFunctionalityTC001()
	{
	
	LoginPage login = new LoginPage(driver);
	login.setUsername(configdataprovider.getUserName());
	login.setPassword(configdataprovider.getPwrd());
	login.clickOnLoginBtn();
	
	}
	
}

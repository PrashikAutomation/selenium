package com.vandvtechsolutions.inetbanking.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.vandvtechsolutions.inetbanking.pageobjects.HomePage;
import com.vandvtechsolutions.inetbanking.pageobjects.LoginPage;
import com.vandvtechsolutions.inetbanking.testbase.TestBase;

public class HomeTC_001 extends TestBase
{

	HomePage homepage;
	
	@Test(priority = 1)
	public void verifyLoginFunctionalityTC001()
	{
	
	LoginPage login = new LoginPage(driver);
	login.setUsername(configdataprovider.getUserName());
	login.setPassword(configdataprovider.getPwrd());
	homepage = login.clickOnLoginBtn();
	
	}
	
	@Test(priority = 2, enabled = false)

 	public void navigateToEditCustomerPage()
	{
		homepage.clickonEditCustomerLink();
	}
	
	@Test(priority = 3)
	public void verifyLogoutFunctio0nality()
	{
		homepage.clickonLogoutLink();
		
		if(driver.getTitle().equals("Guru99 Bank Home Page")) {
			
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	}

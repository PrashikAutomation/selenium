package com.vandvtechsolutions.inetbanking.testcases;

import org.testng.annotations.Test;

import com.vandvtechsolutions.inetbanking.pageobjects.AddNewCustomerPage;
import com.vandvtechsolutions.inetbanking.pageobjects.HomePage;
import com.vandvtechsolutions.inetbanking.pageobjects.LoginPage;
import com.vandvtechsolutions.inetbanking.pageobjects.NewAccountPage;
import com.vandvtechsolutions.inetbanking.testbase.TestBase;

public class AddNewCustomerTC_001 extends TestBase{

	@Test
	public void adnewCustomerTest() throws InterruptedException
	{
		LoginPage login = new LoginPage (driver); 
		login.setUsername(configdataprovider.getUserName()); 
		login.setPassword(configdataprovider.getPwrd());
		HomePage homepage = login.clickOnLoginBtn();
		
		Thread.sleep(6000);
		
		AddNewCustomerPage addCust = homepage.clickonNewCustomerLink();
		
		addCust.setCustomerName("Prashik");
		addCust.clickonGenderRadioBtn("Male");
		
		addCust.setDob("10");
		Thread.sleep(3000);
		
		addCust.setDob("10");
		Thread.sleep(3000);
		addCust.setDob("1989");
		
		addCust.setAddress("Mira Road");
		addCust.setCity("Mumbai");
		
		addCust.setState("Maharashtra");
		addCust.setPincode("401107");
		
		addCust.setTelephoneNumber("9876543210");
		addCust.setEmailID("prashikgondane89@gmail.com");
		
		addCust.setPassword("abcde@123456");
		
		addCust.clickOnSubmitBtn();
		
	}
	
	
	
	
	
	
}

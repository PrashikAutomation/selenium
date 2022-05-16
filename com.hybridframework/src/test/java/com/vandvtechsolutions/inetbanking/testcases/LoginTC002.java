package com.vandvtechsolutions.inetbanking.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.vandvtechsolutions.inetbanking.pageobjects.LoginPage;
import com.vandvtechsolutions.inetbanking.testbase.TestBase;

public class LoginTC002 extends TestBase {

	@DataProvider
	public Object [][] getData() {
		
		return excelDataProvider.getExcelTestData("DTT_Login");
	}
	
	@Test(dataProvider = "getData")
	public void verifyLoginFunctionalityDDTest(Object username, Object password)
	{
	
	LoginPage login = new LoginPage(driver);
	login.setUsername((String)username);
	login.setPassword((String)password);
	
	login.clickOnLoginBtn();
	}
	
}

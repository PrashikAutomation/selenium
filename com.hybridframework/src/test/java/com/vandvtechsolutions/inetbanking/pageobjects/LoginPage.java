package com.vandvtechsolutions.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.vandvtechsolutions.inetbanking.utility.Helper;

public class LoginPage {

	// Login Page Object Repository

	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(name = "uid")
	WebElement txt_username;

	@FindBy(name = "password")
	WebElement txt_password;

	@FindBy(name = "btnLogin")
	WebElement loginBtn;

public void setUsername(String username)
{
	try {
		txt_username.clear();
		txt_username.sendKeys(username);		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
public void setPassword(String password)
{
	try {
		txt_password.clear();
		txt_password.sendKeys(password);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
public HomePage clickOnLoginBtn()
{
	try {
		
		loginBtn.click();
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);			//return new HomePage(driver);
			return new HomePage(driver);
		} 
		else {	
			if(Helper.isAlertPresent(driver));{
				driver.switchTo().alert().accept();
			}
			Assert.assertTrue(false);
			return new HomePage(driver);
		}
	} catch (Exception e) {
		e.printStackTrace();
		return new HomePage(driver);
	}
	
	
	
	
}

}


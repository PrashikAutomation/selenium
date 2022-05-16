package com.vandvtechsolutions.inetbanking.pageobjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vandvtechsolutions.inetbanking.utility.Helper;

public class HomePage {
	
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Home Page Layer
	
	@FindBy(linkText = "New Customer")
	WebElement newCustomerLink;
	
	@FindBy(linkText = "Edit Customer")
	WebElement editCustomer_Link;
	
	@FindBy(linkText = "Delete Customer")
	WebElement delete_Customer_Link;
	
	@FindBy(linkText = "New Account")
	WebElement newAccount_Link;
	
	@FindBy(linkText = "Edit Account")
	WebElement editAccount_Link;
	
	@FindBy(linkText = "Delete Account")
	WebElement deleteAccount_Link;
	
	@FindBy(linkText = "Deposit")
	WebElement accoundDeposit_Link;
	
	@FindBy(linkText = "Withdrawal")
	WebElement accountWithdrawal_Link;
	
	@FindBy(linkText = "Fund Transfer")
	WebElement FundTransferLink;
	
	@FindBy(linkText = "Change Password")
	WebElement changePassword_Link;
	
	@FindBy(linkText = "Balance Enquiry")
	WebElement balanceEnquire_Link;
	
	@FindBy(linkText = "Mini Statement")
	WebElement miniSatatement_Link;
	
	@FindBy(linkText = "Customised Statement")
	WebElement customisedStatement_Link;
	
	@FindBy(linkText = "Log out")
	WebElement logout_Link;
	
	
	public AddNewCustomerPage clickonNewCustomerLink()
	{
		try {
			newCustomerLink.click();
			return new AddNewCustomerPage(driver); 
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public EditCustomerPage clickonEditCustomerLink()
	{
		try {
			editCustomer_Link.click();
			return new EditCustomerPage();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public DeleteCustomerPage clickonDeleteCustomerLink()
	{
		try {
			delete_Customer_Link.click();
			return new DeleteCustomerPage();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public NewAccountPage clickonNewAccountLink()
	{
		try {
			newAccount_Link.click();
			return new NewAccountPage();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public void clickonLogoutLink()
	{
		try {
			logout_Link.click();
			if(Helper.isAlertPresent(driver)) {
				Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();
			}
		} catch (Exception e) {
			e.printStackTrace();
			 
		}
	}
}

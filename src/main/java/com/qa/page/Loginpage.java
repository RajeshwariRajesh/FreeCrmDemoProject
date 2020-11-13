
package com.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class Loginpage extends TestBase {

	@FindBy(name="username")
	WebElement userName;
	
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginButton;
	
	@FindBy(xpath="//a[ @href='https://register.freecrm.com/register/']")
	WebElement signUp;
	@FindBy(xpath="//a[@href='https://freecrm.com/pricing.html']")
	WebElement pricing;
	@FindBy(xpath="//a[ @href='https://freecrm.com/features.html']")
	WebElement features;
	
		
	//initialising elements
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public HomePage Login()
	{
		userName.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginButton.click();
		return new HomePage();
	}
	
	public boolean validateTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
		if(!title.contains("Error"))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	
	public void clickOnSignUp()
	{
		signUp.click();
		
		
	}
	public void clickOnPricing()
	{
		pricing.click();
	}
	public void clickOnFeatures()
	{
		features.click();
	}
}

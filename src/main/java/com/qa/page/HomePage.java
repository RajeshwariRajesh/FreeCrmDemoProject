package com.qa.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	@FindBy(xpath="//a[contains(text(),'User:DemoUser')]")
	WebElement Usernamelabel;
	
		
		
	

public HomePage() {
	PageFactory.initElements(driver, this);
}

public ContactsPage clickOnContactsPageLink()
{
	contactsLink.click();
	return new ContactsPage();
}
public ContactsPage clickOnDealsPageLink()
{
	dealsLink.click();
	return new ContactsPage();
}
public ContactsPage clickOntasksPageLink()
{
	tasksLink.click();
	return new ContactsPage();
}
public boolean verifycorrectusername()
{
	
	return Usernamelabel.isDisplayed();
}
}

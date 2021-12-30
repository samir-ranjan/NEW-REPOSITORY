package com.crm.comcast.objectrepositoryUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsInfoPage {
	WebDriver driver;
	public ContactsInfoPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "dvHeaderText")
	private WebElement contactSucMsg;
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getContactSucMsg() {
		return contactSucMsg;
	}
	
	

}

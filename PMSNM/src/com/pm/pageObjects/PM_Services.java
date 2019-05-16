package com.pm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pmsnm.baseTest.BasePagePM;

public class PM_Services extends BasePagePM
{
	public PM_Services(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Extension")
	private WebElement extension;
	
	@FindBy(linkText="Available Extensions")
	private WebElement availableExtensions;
	
	@FindBy(linkText="Individual Diversion")
	private WebElement individualDiversion;
	
	@FindBy(linkText="Mailbox")
	private WebElement mailbox;

	public WebElement getExtension() 
	{
		return extension;
	}

	public WebElement getAvailableExtensions() 
	{
		return availableExtensions;
	}

	public WebElement getIndividualDiversion() 
	{
		return individualDiversion;
	}

	public WebElement getMailbox() 
	{
		return mailbox;
	}
	
	
}

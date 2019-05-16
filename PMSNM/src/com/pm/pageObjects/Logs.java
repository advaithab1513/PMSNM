package com.pm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pmsnm.baseTest.BasePagePM;

public class Logs extends BasePagePM
{
	public Logs(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Audit Trail")
	private WebElement auditTrail;
	
	@FindBy(linkText="Events")
	private WebElement events;
	
	@FindBy(linkText="Security")
	private WebElement security;

	public WebElement getAuditTrail() 
	{
		return auditTrail;
	}

	public WebElement getEvents() 
	{
		return events;
	}

	public WebElement getSecurity() 
	{
		return security;
	}
}

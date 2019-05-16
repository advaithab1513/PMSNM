package com.snm.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogsPage 
{
	@FindBy(linkText="Audit Trail")
	private WebElement auditTrail;
	
	@FindBy(linkText="Events")
	private WebElement events;
	
	@FindBy(linkText="Security")
	private WebElement security;
	
	@FindBy(linkText="MDSH ")
	private WebElement MDSH;
}

package com.snm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemPage 
{
	public SystemPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Backup & Restore")
	private WebElement backupRestore;
	
	@FindBy(linkText="Batch Operation")
	private WebElement batchOperation;
	
	@FindBy(linkText="Hardware")
	private WebElement hardware;

	public WebElement getBackupRestore() {
		return backupRestore;
	}

	public WebElement getBatchOperation() {
		return batchOperation;
	}

	public WebElement getHardware() {
		return hardware;
	}
	
}

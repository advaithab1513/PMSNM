package com.snm.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeastCostRouting 
{
	@FindBy(linkText=" Least Cost Routing")
	private WebElement leastCostRouting;
	
	public LeastCostRouting(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
}

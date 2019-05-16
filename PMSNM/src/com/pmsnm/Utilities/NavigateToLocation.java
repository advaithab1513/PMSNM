package com.pmsnm.Utilities;

import org.openqa.selenium.WebDriver;

import com.snm.pageObjects.NumberPlan;
import com.snm.pageObjects.NumberSeries;
import com.snm.pageObjects.Number_Analysis_Page;
import com.snm.pageObjects.SNM_Main_Page;

public class NavigateToLocation 
{
	public void navigateToInternalNumSeriesPage(SNM_Main_Page smp,Number_Analysis_Page numAnalysisPage, 
			NumberPlan numberPlan, NumberSeries numberSeries, WebDriver driver)
	{
		smp.getNumber_Analysis().click();
		numAnalysisPage = new Number_Analysis_Page(driver);
		numAnalysisPage.getNumber_Plan_Link().click();
		System.out.println("After clicking NumberPlanLink");
		numberPlan = new NumberPlan(driver);
		numberPlan.getNumberSeries().click();
		System.out.println("After clicking NumberSeriesLink");
		numberSeries = new NumberSeries(driver);
		numberSeries.getAddButton().click();
		numberSeries.getInternalNumbers().click();
		numberSeries.getNextButton().click();
	}
	
	public void navigateToExternalNumSeriesPage(SNM_Main_Page smp,Number_Analysis_Page numAnalysisPage, 
			NumberPlan numberPlan, NumberSeries numberSeries, WebDriver driver)
	{
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		numberSeries.getAddButton().click();
		numberSeries.getExternalNumbers().click();
		numberSeries.getNextButton().click();
	}
}

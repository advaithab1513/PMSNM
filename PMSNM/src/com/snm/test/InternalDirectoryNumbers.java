package com.snm.test;

import java.lang.reflect.Method;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.pmsnm.Utilities.NavigateToLocation;
import com.pmsnm.Utilities.Login;
import com.pmsnm.baseTest.BasePage;
import com.snm.pageObjects.NumberPlan;
import com.snm.pageObjects.NumberSeries;
import com.snm.pageObjects.Number_Analysis_Page;
import com.snm.pageObjects.SNM_Login_Page;
import com.snm.pageObjects.SNM_Main_Page;
import com.snm.pageObjects.ToolsPage;

public class InternalDirectoryNumbers extends BasePage
{
	Number_Analysis_Page numAnalysisPage;
	NumberPlan numberPlan;
	NumberSeries numberSeries;
	ToolsPage tpage;
	SNM_Login_Page slp;
	SNM_Main_Page smp;
	NavigateToLocation navigate;
	
	@Test(groups={"regression", "smoke", "myGroup"})
	public void createDirectoryNumbers(Method method)
	{
		String methodName = method.getName();
		System.out.println(methodName);
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(1, 0)+"is Skipped because flag is set to NO");
			}
		
		numberSeries = new NumberSeries(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1,2,3);
		NavigateToLocation navigate = new NavigateToLocation();
		navigate.navigateToInternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.setDirectoryNumbersTextBox(snmTests.getData(1, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");	
	}
	
	@Test(groups="smoke")
	public void createCommonOperatorNumbers(Method method)
	{
		String methodName = method.getName();
		System.out.println(methodName);
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(2, 0)+"is Skipped because flag is set to NO");
			}
		
		numberSeries = new NumberSeries(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1,2,3);
		NavigateToLocation navigate = new NavigateToLocation();
		navigate.navigateToInternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.setCommonOperatorNumbers(snmTests.getData(2, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}
	
	@Test(groups="regression")
	public void createIndividualOperatorNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(3, 0)+"is Skipped because flag is set to NO");
			}
		
		numberSeries = new NumberSeries(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1,2,3);
		NavigateToLocation navigate = new NavigateToLocation();
		navigate.navigateToInternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.setIndividualOperatorNumbers(snmTests.getData(3, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}
	
	@Test(groups="regression")
	public void createCommonAbbreviatedNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(4, 0)+"is Skipped because flag is set to NO");
			}
		
		numberSeries = new NumberSeries(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1,2,3);
		NavigateToLocation navigate = new NavigateToLocation();
		navigate.navigateToInternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.setCommonAbbreviatedNumbers(snmTests.getData(4, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}
	
/*	@Test(groups="smoke")
	public void createEmergencyNumbersOperator(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(5, 0)+"is Skipped because flag is set to NO");
			}
		
		numberSeries = new NumberSeries(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1,2,3);
		NavigateToLocation navigate = new NavigateToLocation();
		navigate.navigateToInternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.getAdvanceButton().click();
		numberSeries.setEmergencyNumberToOperator(snmTests.getData(5, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}
	
	@Test(groups="regression")
	public void createIndividualAbbreviatedNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(6, 0)+"is Skipped because flag is set to NO");
			}
		
		numberSeries = new NumberSeries(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1,2,3);
		NavigateToLocation navigate = new NavigateToLocation();
		navigate.navigateToInternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.getAdvanceButton().click();
		numberSeries.setIndividualAbbreviatedNumbers(snmTests.getData(6, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}
	
	@Test(groups="smoke")
	public void createRouteDirectoryNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(7, 0)+"is Skipped because flag is set to NO");
			}
		
		numberSeries = new NumberSeries(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1,2,3);
		NavigateToLocation navigate = new NavigateToLocation();
		navigate.navigateToInternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.getAdvanceButton().click();
		numberSeries.setRouteDirectoryNumbers(snmTests.getData(7, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}
	
	@Test(groups="regression")
	public void createDialedNumberInformationService(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(8, 0)+"is Skipped because flag is set to NO");
			}
		
		numberSeries = new NumberSeries(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1,2,3);
		NavigateToLocation navigate = new NavigateToLocation();
		navigate.navigateToInternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.getAdvanceButton().click();
		numberSeries.setDialedNumberInfoService(snmTests.getData(8, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}
	
	@Test(groups="regression")
	public void createPagingNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(9, 0)+"is Skipped because flag is set to NO");
			}
		
		numberSeries = new NumberSeries(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1,2,3);
		NavigateToLocation navigate = new NavigateToLocation();
		navigate.navigateToInternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.getAdvanceButton().click();
		numberSeries.setPagingNumbers(snmTests.getData(9, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}
		
	@Test(groups="smoke")
	public void createGatewayRoutingNumbers(Method method) throws InterruptedException
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(10, 0)+"is Skipped because flag is set to NO");
			}
		
		String CLI = "Command Line Interface";
		numberSeries = new NumberSeries(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1,2,3);
		smp.getTools().click();		
		tpage = new ToolsPage(driver);
		tpage.getCommandLine().click();
		String parentWindow = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();
		for(String newWindow : window)
		{
				driver.switchTo().window(newWindow);
				if(driver.getTitle().equals(CLI))
				{
					System.out.println(driver.getTitle());
					driver.manage().window().maximize();
					System.out.println("Entered CLI Window");
					driver.switchTo().frame("CommandLine");
					tpage.getCommandField().sendKeys(snmTests.getData(10, 2));
					tpage.getCmdApply().click();
					driver.close();
				}
		}
		driver.switchTo().window(parentWindow);		
		smp.getNumber_Analysis().click();
		NavigateToLocation navigate = new NavigateToLocation();
		navigate.navigateToInternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.getAdvanceButton().click();
		numberSeries.setGatewayRoutingNumbers(snmTests.getData(10, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}*/
	
	
}

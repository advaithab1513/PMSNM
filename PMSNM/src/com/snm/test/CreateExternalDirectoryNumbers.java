package com.snm.test;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.pmsnm.Utilities.NavigateToLocation;
import com.pmsnm.baseTest.BasePage;
import com.snm.pageObjects.NumberPlan;
import com.snm.pageObjects.NumberSeries;
import com.snm.pageObjects.Number_Analysis_Page;
import com.snm.pageObjects.SNM_Login_Page;
import com.snm.pageObjects.SNM_Main_Page;

public class CreateExternalDirectoryNumbers extends BasePage
{
	SNM_Main_Page smp;
	NumberPlan numberPlan;
	NumberSeries numberSeries;
	Number_Analysis_Page numAnalysisPage;
	SNM_Login_Page slp;
	
	@Test()
	public void createExternalCoordinatedDestination(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
		}
		smp = new SNM_Main_Page(driver);
		slp = new SNM_Login_Page(driver);
		numberPlan = new NumberPlan(driver);
		numberSeries = new NumberSeries(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		new NavigateToLocation().navigateToExternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.setExternalCoordinationDestination(snmTests.getData(31, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
		
	}
	
	@Test()
	public void createExternalDestination(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
		}
		smp = new SNM_Main_Page(driver);
		slp = new SNM_Login_Page(driver);
		numberPlan = new NumberPlan(driver);
		numberSeries = new NumberSeries(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		new NavigateToLocation().navigateToExternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.setExternalDestination(snmTests.getData(32, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}
	
	@Test()
	public void createLeastCostRoutingAccessNumbers(Method method)

	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
		}
		smp = new SNM_Main_Page(driver);
		slp = new SNM_Login_Page(driver);
		numberPlan = new NumberPlan(driver);
		numberSeries = new NumberSeries(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		new NavigateToLocation().navigateToExternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.setLeastCostRoutingAccessNumbers(snmTests.getData(33, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}
	
	@Test()
	public void createCommonDirectInDialingOperatorNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
		}
		smp = new SNM_Main_Page(driver);
		slp = new SNM_Login_Page(driver);
		numberPlan = new NumberPlan(driver);
		numberSeries = new NumberSeries(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		new NavigateToLocation().navigateToExternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.setCommonDirectIndialingOperatorNumbers(snmTests.getData(34, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}
	
	@Test()
	public void createOwnNodeNumber(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
		}
		smp = new SNM_Main_Page(driver);
		slp = new SNM_Login_Page(driver);
		numberPlan = new NumberPlan(driver);
		numberSeries = new NumberSeries(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		new NavigateToLocation().navigateToExternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.setOwnNodeNumber(snmTests.getData(35, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}
	
	@Test()
	public void createCommonPublicDirectoryNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
		}
		smp = new SNM_Main_Page(driver);
		slp = new SNM_Login_Page(driver);
		numberPlan = new NumberPlan(driver);
		numberSeries = new NumberSeries(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		new NavigateToLocation().navigateToExternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.setCommonPublicDirNumbers(snmTests.getData(36, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}
	
	@Test()
	public void createAccessNumbersMobileExtensionWithoutAuthorization(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
		}
		smp = new SNM_Main_Page(driver);
		slp = new SNM_Login_Page(driver);
		numberPlan = new NumberPlan(driver);
		numberSeries = new NumberSeries(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		new NavigateToLocation().navigateToExternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.setAccessNumbersForMobileExtensionWithoutAuth(snmTests.getData(37, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}
	
	@Test()
	public void createAccessNumbersMobileExtensionWithAuthorization(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
		}
		smp = new SNM_Main_Page(driver);
		slp = new SNM_Login_Page(driver);
		numberPlan = new NumberPlan(driver);
		numberSeries = new NumberSeries(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		new NavigateToLocation().navigateToExternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.setAccessNumbersForMobileExtensionWithAuth(snmTests.getData(38, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}
	
	@Test()
	public void createAccessNumbersMobileExtensionWithoutAuthorizationAndDialTone(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
		}
		smp = new SNM_Main_Page(driver);
		slp = new SNM_Login_Page(driver);
		numberPlan = new NumberPlan(driver);
		numberSeries = new NumberSeries(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		new NavigateToLocation().navigateToExternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.setAccessNumbersForMobileExtensionDialTone(snmTests.getData(39, 1));
		numberSeries.getApplyButton().click();
		driver.switchTo().alert().accept();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}
	
	@Test()
	public void createPublicDestinationLeastCostRouting(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
		}
		smp = new SNM_Main_Page(driver);
		slp = new SNM_Login_Page(driver);
		numberPlan = new NumberPlan(driver);
		numberSeries = new NumberSeries(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		new NavigateToLocation().navigateToExternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.setPublicDestinationLCR(snmTests.getData(40, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}
	
	@Test()
	public void createFictitiousDestinationNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
		}
		smp = new SNM_Main_Page(driver);
		slp = new SNM_Login_Page(driver);
		numberPlan = new NumberPlan(driver);
		numberSeries = new NumberSeries(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		new NavigateToLocation().navigateToExternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.setFictitiousDestinationNumbers(snmTests.getData(41, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}
	
	@Test()
	public void createDirectInwardServiceAccess(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
		}
		smp = new SNM_Main_Page(driver);
		slp = new SNM_Login_Page(driver);
		numberPlan = new NumberPlan(driver);
		numberSeries = new NumberSeries(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		new NavigateToLocation().navigateToExternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.setDirectInwardServiceAccess(snmTests.getData(42, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Test()
	public void createFictitiousDestinations(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
		}
		smp = new SNM_Main_Page(driver);
		slp = new SNM_Login_Page(driver);
		numberPlan = new NumberPlan(driver);
		numberSeries = new NumberSeries(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		new NavigateToLocation().navigateToExternalNumSeriesPage(smp, numAnalysisPage, numberPlan, numberSeries, driver);
		numberSeries.setFictitiousDestinationNumbers(snmTests.getData(43, 1));
		numberSeries.getApplyButton().click();
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Add operation successful for:");
	}*/
	

}

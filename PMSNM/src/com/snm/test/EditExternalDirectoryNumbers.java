package com.snm.test;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.pmsnm.Utilities.NavigateToLocation;
import com.pmsnm.Utilities.SelectDropDownValue;
import com.pmsnm.baseTest.BasePage;
import com.snm.pageObjects.NumberPlan;
import com.snm.pageObjects.NumberSeries;
import com.snm.pageObjects.Number_Analysis_Page;
import com.snm.pageObjects.SNM_Login_Page;
import com.snm.pageObjects.SNM_Main_Page;

public class EditExternalDirectoryNumbers extends BasePage
{
	SNM_Main_Page smp;
	NumberPlan numberPlan;
	NumberSeries numberSeries;
	Number_Analysis_Page numAnalysisPage;
	SNM_Login_Page slp;
	
	@Test()
	public void editExternalCoordinatedDestination(Method method)
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
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 14);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(43, 1), numberSeries.getExternalCoordinationDestination());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Change operation successful for:");
		
	}
	
	@Test()
	public void editExternalDestination(Method method)
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
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 13);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(44, 1), numberSeries.getExternalDestination());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Change operation successful for:");
	}
	
	@Test()
	public void editLeastCostRoutingAccessNumbers(Method method)

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
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 19);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(45, 1), numberSeries.getLeastCostRoutingAccessNumbers());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Change operation successful for:");
	}
	
	@Test()
	public void editCommonDirectInDialingOperatorNumbers(Method method)
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
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 10);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(46, 1), numberSeries.getCommonDirectIndialingOperatorNumbers());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Change operation successful for:");
	}
	
	@Test()
	public void editOwnNodeNumber(Method method)
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
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 21);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(47, 1), numberSeries.getOwnNodeNumber());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Change operation successful for:");
	}
	
	@Test()
	public void editCommonPublicDirectoryNumbers(Method method)
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
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 20);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(48, 1), numberSeries.getCommonPublicDirNumbers());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Change operation successful for:");
	}
	
	@Test()
	public void editAccessNumbersMobileExtensionWithoutAuthorization(Method method)
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
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 4);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(49, 1), numberSeries.getAccessNumbersForMobileExtensionWithoutAuth());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Change operation successful for:");
	}
	
	@Test()
	public void editAccessNumbersMobileExtensionWithAuthorization(Method method)
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
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 5);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(50, 1), numberSeries.getAccessNumbersForMobileExtensionWithAuth());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Change operation successful for:");
	}
	
	@Test()
	public void editAccessNumbersMobileExtensionWithoutAuthorizationAndDialTone(Method method)
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
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 6);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(51, 1), numberSeries.getAccessNumbersForMobileExtensionDialTone());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Change operation successful for:");
	}
	
	@Test()
	public void editPublicDestinationLeastCostRouting(Method method)
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
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 15);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(52, 1), numberSeries.getPublicDestinationLCR());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Change operation successful for:");
	}
	
	@Test()
	public void editFictitiousDestinationNumbers(Method method)
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
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 22);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(53, 1), numberSeries.getFictitiousDestinationNumbers());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Change operation successful for:");
	}
	
	@Test()
	public void editDirectInwardServiceAccess(Method method)
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
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 17);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(54, 1), numberSeries.getDirectInwardServiceAccess());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Change operation successful for:");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Test()
	public void editFictitiousDestinations(Method method)
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
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 14);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(55, 1), numberSeries.getExternalCoordinationDestination());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		Assert.assertEquals(numberSeries.getSuccessMessage().getText().trim(), "Change operation successful for:");
	}*/
}

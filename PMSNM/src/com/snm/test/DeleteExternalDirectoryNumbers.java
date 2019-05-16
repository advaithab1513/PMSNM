package com.snm.test;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.pmsnm.Utilities.SelectDropDownValue;
import com.pmsnm.baseTest.BasePage;
import com.snm.pageObjects.NumberPlan;
import com.snm.pageObjects.NumberSeries;
import com.snm.pageObjects.Number_Analysis_Page;
import com.snm.pageObjects.SNM_Login_Page;
import com.snm.pageObjects.SNM_Main_Page;
import com.snm.pageObjects.ToolsPage;

public class DeleteExternalDirectoryNumbers extends BasePage
{
	Number_Analysis_Page numAnalysisPage;
	NumberPlan numberPlan;
	NumberSeries numberSeries;
	ToolsPage tpage;
	SNM_Login_Page slp;
	SNM_Main_Page smp;
	SelectDropDownValue select;
	
	/*@Test(groups= {"smoke"})
	public void deleteExternalCoordinatedDestination(Method method)
	{
		String methodName = method.getName();
		System.out.println(methodName);
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
			}
		
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		numberSeries = new NumberSeries(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 14);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(31, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}	
	
	@Test()
	public void deleteExternalDestination(Method method)
	{
		String methodName = method.getName();
		System.out.println(methodName);
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
			}
		
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		numberSeries = new NumberSeries(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(),13);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(32, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(groups="smoke")
	public void deleteLeastCostRoutingAccessNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
			}
		
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		numberSeries = new NumberSeries(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 19);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(33, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}	
	
	@Test()
	public void deleteCommonDirectInDialingOperatorNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
			}
		
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		numberSeries = new NumberSeries(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 10);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(34, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}	
	
	@Test(groups= {"regression", "smoke"})
	public void deleteOwnNodeNumber(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
			}
		
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		numberSeries = new NumberSeries(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(),21);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(35, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}	
	
	@Test()
	public void deleteCommonPublicDirectoryNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
			}
		
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		numberSeries = new NumberSeries(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(),20);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(36, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}	
	
	@Test()
	public void deleteAccessNumbersMobileExtensionWithoutAuthorization(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
			}
		
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		numberSeries = new NumberSeries(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 4);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(37, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}	
	
	@Test()
	public void deleteAccessNumbersMobileExtensionWithAuthorization(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
			}
		
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		numberSeries = new NumberSeries(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 5);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(38, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}	
	
	@Test()
	public void deleteAccessNumbersMobileExtensionWithoutAuthorizationAndDialTone(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
			}
		
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		numberSeries = new NumberSeries(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 6);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(39, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}	
	
	@Test()
	public void deletePublicDestinationLeastCostRouting(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
			}
		
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		numberSeries = new NumberSeries(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 15);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(40, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}*/
	
	@Test()
	public void deleteFictitiousDestinationNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
			}
		
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		numberSeries = new NumberSeries(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 22);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(41, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Test()
	public void deleteDirectInwardServiceAccess(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
			}
		
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		numberPlan = new NumberPlan(driver);
		numAnalysisPage = new Number_Analysis_Page(driver);
		numberSeries = new NumberSeries(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		smp.getNumber_Analysis().click();
		numAnalysisPage.getNumber_Plan_Link().click();
		numberPlan.getNumberSeries().click();
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 17);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(42, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}*/
}

package com.snm.test;

import java.lang.reflect.Method;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.pmsnm.Utilities.Login;
import com.pmsnm.Utilities.SelectDropDownValue;
import com.pmsnm.baseTest.BasePage;
import com.snm.pageObjects.NumberPlan;
import com.snm.pageObjects.NumberSeries;
import com.snm.pageObjects.Number_Analysis_Page;
import com.snm.pageObjects.SNM_Login_Page;
import com.snm.pageObjects.SNM_Main_Page;

public class editingInternalNumberSeries extends BasePage
{
	public SNM_Main_Page smp;
	public SNM_Login_Page slp;
	public NumberPlan numberPlan;
	public NumberSeries numberSeries;
	public Number_Analysis_Page numAnalysisPage;
		
	@Test()
	public void editDirectoryNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
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
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 3);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(21, 1), numberSeries.getDirectoryNumbersTextBox());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}

	@Test
	public void editCommonOPeratorNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
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
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 9);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(22, 1), numberSeries.getCommonOperatorNumbers());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}

	@Test
	public void editIndividualOperatorNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
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
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 11);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(23, 1), numberSeries.getIndividualOperatorNumbers());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void editCommonAbbreviatedNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
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
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 7);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(24, 1), numberSeries.getCommonAbbreviatedNumbers());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void editEmergencyOperatorToNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
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
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 12);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(25, 1), numberSeries.getEmergencyNumberToOperator());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void editIndividualAbbreviatedNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
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
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 8);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(26, 1),numberSeries.getIndividualAbbreviatedNumbers());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void editRouteDirectoryNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
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
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 16);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(27, 1), numberSeries.getRouteDirectoryNumbers());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void editDialedNumberInformationService(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
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
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 18);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(28, 1), numberSeries.getDialedNumberInfoService());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void editPagingNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
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
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 23);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(29, 1), numberSeries.getPagingNumbers());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void editGatewayRoutingNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
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
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 24);
		numberSeries.getNumberSeriesViewButton().click();
		try 
		{
			numberSeries.editAnyNumberSeries(driver, numberSeries, snmTests.getData(30, 1), numberSeries.getGatewayRoutingNumbers());
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
}

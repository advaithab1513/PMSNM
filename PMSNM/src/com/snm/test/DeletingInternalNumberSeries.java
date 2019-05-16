package com.snm.test;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.testng.Assert;
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

public class DeletingInternalNumberSeries extends BasePage
{
	Number_Analysis_Page numAnalysisPage;
	NumberPlan numberPlan;
	NumberSeries numberSeries;
	ToolsPage tpage;
	SNM_Login_Page slp;
	SNM_Main_Page smp;
	SelectDropDownValue select;
	ArrayList<Integer> list = new ArrayList<Integer>();	
	
	@Test(groups= {"smoke"})
	public void deletingDirectoryNumbers(Method method)
	{
		String methodName = method.getName();
		System.out.println(methodName);
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(11, 0)+"is Skipped because flag is set to NO");
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
		numberSeries = new NumberSeries(driver);
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 3);
		numberSeries.getNumberSeriesViewButton().click();
		//numberSeries.getDeleteDirectoryNumbers().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(1, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}	
	
	@Test()
	public void deletingCommonOPeratorNumbers(Method method)
	{
		String methodName = method.getName();
		System.out.println(methodName);
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(12, 0)+"is Skipped because flag is set to NO");
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
		numberSeries = new NumberSeries(driver);
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(),9);
		numberSeries.getNumberSeriesViewButton().click();
		//numberSeries.getDeleteDirectoryNumbers().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(2, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(groups="smoke")
	public void deletingIndividualOperatorNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(13, 0)+"is Skipped because flag is set to NO");
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
		numberSeries = new NumberSeries(driver);
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 11);
		numberSeries.getNumberSeriesViewButton().click();
		//numberSeries.getDeleteDirectoryNumbers().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(3, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}	
	
	@Test()
	public void deletingCommonAbbreviatedNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(14, 0)+"is Skipped because flag is set to NO");
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
		numberSeries = new NumberSeries(driver);
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 7);
		numberSeries.getNumberSeriesViewButton().click();
		//numberSeries.getDeleteDirectoryNumbers().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(4, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}	
	
	@Test(groups= {"regression", "smoke"})
	public void deletingEmergencyOperatorToNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(15, 0)+"is Skipped because flag is set to NO");
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
		numberSeries = new NumberSeries(driver);
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(),12);
		numberSeries.getNumberSeriesViewButton().click();
		//numberSeries.getDeleteDirectoryNumbers().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(5, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}	
	
	/*@Test()
	public void deletingIndividualAbbreviatedNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(16, 0)+"is Skipped because flag is set to NO");
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
		numberSeries = new NumberSeries(driver);
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(),8);
		numberSeries.getNumberSeriesViewButton().click();
		//numberSeries.getDeleteDirectoryNumbers().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(6, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}	*/
	
	@Test()
	public void deletingRouteDirectoryNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(17, 0)+"is Skipped because flag is set to NO");
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
		numberSeries = new NumberSeries(driver);
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 16);
		numberSeries.getNumberSeriesViewButton().click();
		//numberSeries.getDeleteDirectoryNumbers().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(7, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}	
	
	@Test()
	public void deletingDialedNumberInformationService(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(18, 0)+"is Skipped because flag is set to NO");
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
		numberSeries = new NumberSeries(driver);
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 18);
		numberSeries.getNumberSeriesViewButton().click();
		//numberSeries.getDeleteDirectoryNumbers().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(8, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}	
	
	@Test()
	public void deletingPagingNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(19, 0)+"is Skipped because flag is set to NO");
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
		numberSeries = new NumberSeries(driver);
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 23);
		numberSeries.getNumberSeriesViewButton().click();
		//numberSeries.getDeleteDirectoryNumbers().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(9, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}	
	
	@Test()
	public void deletingGatewayRoutingNumbers(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmTests.getData(20, 0)+"is Skipped because flag is set to NO");
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
		numberSeries = new NumberSeries(driver);
		new SelectDropDownValue().selectByIndex(numberSeries.getNumberSeriesDropDown(), 24);
		numberSeries.getNumberSeriesViewButton().click();
		//numberSeries.getDeleteDirectoryNumbers().click();
		try 
		{
			numberSeries.deleteAnyNumberSeries(driver, numberSeries, snmTests.getData(10, 3));
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}	
}

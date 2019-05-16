package com.snm.test;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

//import com.pmsnm.baseTest.BasePageSNM
import com.pmsnm.Utilities.ExcelReadAndWrite;
import com.pmsnm.Utilities.Login;
import com.pmsnm.Utilities.StoreAndRetreiveDataFromMap;
import com.pmsnm.baseTest.BasePage;
import com.snm.pageObjects.SNM_Login_Page;
import com.snm.pageObjects.SNM_Main_Page;

public class ValidateSNMLogin extends BasePage
{
	SNM_Login_Page slp;
	SNM_Main_Page smp;
	WebElement loggedInAccountInfo;
			
	
		@Test()
		public void validateSnmValidLoginCredentails(Method method)
		{	
			String methodName = method.getName();
			String flag = snmLoginSheet.getTestCaseFlag(excelPath, 5, methodName);
			System.out.println(flag);
				if(flag.equals("N"))
				{
					throw new SkipException("TestCase "+snmLoginSheet.getData(1, 0)+"is Skipped because flag is set to NO");
				}
			
				slp = new SNM_Login_Page(driver);
				smp = new SNM_Main_Page(driver);
				login.loginToSNM(slp, snmLoginSheet, 1,2,3);
				loggedInAccountInfo =  smp.getLoggedInUserAccount();
				Assert.assertTrue(loggedInAccountInfo.isDisplayed());
		}
		
		@Test()
		public void validUsernameInvalidPassword(Method method)
		{
			
			String methodName = method.getName();
			String flag = snmLoginSheet.getTestCaseFlag(excelPath, 5, methodName);
			System.out.println(flag);
				if(flag.equals("N"))
				{
					throw new SkipException("TestCase "+snmLoginSheet.getData(2, 0)+"is Skipped because flag is set to NO");
				}
			
			slp = new SNM_Login_Page(driver);
			smp = new SNM_Main_Page(driver);
			login.loginToSNM(slp, snmLoginSheet, 2,2,3);
			Assert.assertEquals(slp.getErrorMessage().getText().trim(), snmLoginSheet.getData(2, 4));
		}
		
	
	@Test()
	public void invalidUsernameValidPassword(Method method)
	{
		String methodName = method.getName();
		String flag = snmLoginSheet.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmLoginSheet.getData(3, 0)+"is Skipped because flag is set to NO");
			}
		
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 3,2,3);
		Assert.assertEquals(slp.getErrorMessage().getText().trim(), snmLoginSheet.getData(3, 4));
	}
	
	@Test()
	public void invalidUsernameInvalidPassword(Method method)
	{
		String methodName = method.getName();
		String flag = snmLoginSheet.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+snmLoginSheet.getData(4, 0)+"is Skipped because flag is set to NO");
			}
		
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		login.loginToSNM(slp, snmLoginSheet, 4,2,3);
		Assert.assertEquals(slp.getErrorMessage().getText().trim(), snmLoginSheet.getData(4, 4));
	}
}

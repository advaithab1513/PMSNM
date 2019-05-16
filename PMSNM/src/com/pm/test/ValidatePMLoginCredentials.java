package com.pm.test;

import java.lang.reflect.Method;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.pm.pageObjects.PM_Login_Page;
import com.pmsnm.baseTest.BasePagePM;
import com.snm.pageObjects.SNM_Main_Page;

public class ValidatePMLoginCredentials extends BasePagePM
{
	PM_Login_Page plp;
	SNM_Main_Page smp;
	WebElement loggedInAccountInfo;
			
	
		@Test(groups="smoke")
		public void validatePMValidLoginCredentails(Method method)
		{	
			String methodName = method.getName();
			String flag = PMLoginSheet.getTestCaseFlag(excelPath, 5, methodName);
			System.out.println(flag);
				if(flag.equals("N"))
				{
					throw new SkipException("TestCase "+PMLoginSheet.getData(1, 0)+"is Skipped because flag is set to NO");
				}
			
				plp = new PM_Login_Page(driver);
				smp = new SNM_Main_Page(driver);
				login.loginToPM(plp, PMLoginSheet, 1,2,3);
				loggedInAccountInfo =  smp.getLoggedInUserAccount();
				Assert.assertTrue(loggedInAccountInfo.isDisplayed());
		}
		
		@Test()
		public void validPMUsernameInvalidPassword(Method method)
		{
			
			String methodName = method.getName();
			String flag = PMLoginSheet.getTestCaseFlag(excelPath, 5, methodName);
			System.out.println(flag);
				if(flag.equals("N"))
				{
					throw new SkipException("TestCase "+PMLoginSheet.getData(2, 0)+"is Skipped because flag is set to NO");
				}
			
			plp = new PM_Login_Page(driver);
			smp = new SNM_Main_Page(driver);
			login.loginToPM(plp, PMLoginSheet, 2,2,3);
			Assert.assertEquals(plp.getLoginErrorMessage().getText().trim(), PMLoginSheet.getData(2, 4));
		}
		
	
	@Test()
	public void invalidPMUsernameValidPassword(Method method)
	{
		String methodName = method.getName();
		String flag = PMLoginSheet.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+PMLoginSheet.getData(3, 0)+"is Skipped because flag is set to NO");
			}
		
		plp = new PM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		login.loginToPM(plp, PMLoginSheet, 3,2,3);
		Assert.assertEquals(plp.getLoginErrorMessage().getText().trim(), PMLoginSheet.getData(3, 4));
	}
	
	@Test(groups="smoke")
	public void invalidPMUsernameInvalidPassword(Method method)
	{
		String methodName = method.getName();
		String flag = PMLoginSheet.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+PMLoginSheet.getData(4, 0)+"is Skipped because flag is set to NO");
			}
		
		plp = new PM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		login.loginToPM(plp, PMLoginSheet, 4,2,3);
		Assert.assertEquals(plp.getLoginErrorMessage().getText().trim(), PMLoginSheet.getData(4, 4));
	}
}

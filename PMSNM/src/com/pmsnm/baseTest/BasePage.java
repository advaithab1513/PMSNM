package com.pmsnm.baseTest;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.pmsnm.Utilities.AutoConstants;
import com.pmsnm.Utilities.ExcelReadAndWrite;
import com.pmsnm.Utilities.Login;
import com.pmsnm.Utilities.ScreenShot;
import com.pmsnm.Utilities.StoreAndRetreiveDataFromMap;

public class BasePage implements AutoConstants
{
	public WebDriver driver;
	public Login login;
	public static ExcelReadAndWrite snmLoginSheet;
	public static ExcelReadAndWrite snmTests;
	
	@BeforeSuite()
	public void initializeGlobalValues()
	{
		System.setProperty(chromeKey, chromePath);
		System.setProperty(firefoxKey, firefoxPath);
		snmLoginSheet = new ExcelReadAndWrite();
		snmTests = new ExcelReadAndWrite();
		snmLoginSheet.fetchExcelData("SNMLogin_Data", excelPath);
		snmTests.fetchExcelData("SNM_Tests", excelPath);
	}
	
	@BeforeClass()
	public void beforeClass()
	{
		login = new Login();
	}

	
	//@Parameters("browser")
	@BeforeMethod()
	public void beforeMethod(Method method)
	{
		/*System.out.println(snmLoginSheet);
		read.fetchExcelData("SNMLogin_Data", excelPath);
		String methodName = method.getName();
		String flag = read.getTestCaseFlag(excelPath, 5, methodName);
		System.out.println(flag);
			if(flag.equals("N"))
			{
				throw new SkipException("TestCase "+read.getData(1, 0)+"is Skipped because flag is set to NO");
			}*/
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(snmLoginSheet.getData(1, 1));
	}
	
	@AfterMethod()
	public void afterMethod(ITestResult res)
	{
		System.out.println("In after method");
		int status = res.getStatus();
		if(status==2)
		{
			String methodName = res.getMethod().getMethodName();
			ScreenShot.getScreenshot(driver, methodName);
		}
		
		driver.close();
	}
}

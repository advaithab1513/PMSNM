package com.pmsnm.baseTest;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.pmsnm.Utilities.AutoConstants;
import com.pmsnm.Utilities.ExcelReadAndWrite;
import com.pmsnm.Utilities.Login;
import com.pmsnm.Utilities.ScreenShot;
import com.pmsnm.Utilities.StoreAndRetreiveDataFromMap;

public class BasePagePM implements AutoConstants
{
	public WebDriver driver;
	public Login login;
	public static ExcelReadAndWrite PMLoginSheet;
	public static ExcelReadAndWrite PMUsers;
	//public static ExcelReadAndWrite snmNumberSeriesSheet;
	
	@BeforeSuite()
	public void initializeGlobalValues()
	{
		System.setProperty(chromeKey, chromePath);
		System.setProperty(firefoxKey, firefoxPath);
		PMLoginSheet = new ExcelReadAndWrite();
		PMLoginSheet.fetchExcelData("PMLogin_Data", excelPath);
		PMUsers = new ExcelReadAndWrite();
		PMUsers.fetchExcelData("Users", excelPath);
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
		driver.get(PMLoginSheet.getData(1, 1));
	}
	
	@AfterMethod(alwaysRun=true)
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

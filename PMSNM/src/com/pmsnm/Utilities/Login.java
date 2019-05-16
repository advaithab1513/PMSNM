package com.pmsnm.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pm.pageObjects.PM_Login_Page;
import com.snm.pageObjects.SNM_Login_Page;

public class Login 
{
	public void loginToSNM(SNM_Login_Page slp, ExcelReadAndWrite snmLoginSheet ,int row, int uNameCell, int uPwdCell)
	{
		slp.setSnmUserNameField(snmLoginSheet.getData(row, uNameCell));
		slp.getSnmPasswordField().click();
		slp.setSnmPasswordField(snmLoginSheet.getData(row, uPwdCell));
		slp.getSnmUserLoginBtn().click();
	}
	
	
	public void loginToPM(PM_Login_Page plp, ExcelReadAndWrite PMLoginSheet ,int row, int uNameCell, int uPwdCell)
	{
		plp.setUserLoginTextBox(PMLoginSheet.getData(row, uNameCell));
		plp.getUserPasswordTextBox().click();
		plp.setUserPasswordTextBox(PMLoginSheet.getData(row, uPwdCell));
		plp.getUserLoginButton().click();
	}
	
	/*public void loginToSNM(SNM_Login_Page slp, ExcelReadAndWrite snmLoginSheet ,int row, int uNameCell, int uPwdCell, WebDriver driver)
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(snmLoginSheet.getData(1, 1));
		Syso
		slp.setSnmUserNameField(snmLoginSheet.getData(row, uNameCell));
		slp.getSnmPasswordField().click();
		slp.setSnmPasswordField(snmLoginSheet.getData(row, uPwdCell));
		slp.getSnmUserLoginBtn().click();
	}*/
	
}

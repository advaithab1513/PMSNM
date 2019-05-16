package com.snm.test;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.pmsnm.Utilities.MethodStatus;
import com.pmsnm.Utilities.SelectDropDownValue;
import com.pmsnm.baseTest.BasePage;
import com.snm.pageObjects.CSP;
import com.snm.pageObjects.NumberPlan;
import com.snm.pageObjects.NumberSeries;
import com.snm.pageObjects.Number_Analysis_Page;
import com.snm.pageObjects.SNM_Login_Page;
import com.snm.pageObjects.SNM_Main_Page;
import com.snm.pageObjects.SystemHardware;
import com.snm.pageObjects.SystemHardwareMediaGateway;
import com.snm.pageObjects.SystemPage;
import com.snm.pageObjects.TelephonyExtensionsPage;
import com.snm.pageObjects.TelephonyPage;

public class SNM_Configurations extends BasePage
{
	SNM_Main_Page smp;
	SNM_Login_Page slp;
	TelephonyPage telephonypage;
	TelephonyExtensionsPage telephonyExtensionsPage;
	CSP cspPage;
	SystemPage systemPage;
	SystemHardware sysHardware;
	SystemHardwareMediaGateway mediaGateway;
	SelectDropDownValue dropDown = new SelectDropDownValue();
	
/*	@Test()
	public void createCSP(Method method)
	{
		String methodName = method.getName();
		String flag = snmTests.getTestCaseFlag(excelPath, 5, methodName);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
		}
		smp = new SNM_Main_Page(driver);
		slp = new SNM_Login_Page(driver);
		telephonypage = new TelephonyPage(driver);
		telephonyExtensionsPage = new TelephonyExtensionsPage(driver);
		cspPage = new CSP(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		smp.getTelephony().click();
		telephonypage.getExtensions().click();
		telephonyExtensionsPage.getCSP().click();
		cspPage.getCSPAddButton().click();
		cspPage.setCSPName(snmTests.getData(67, 1));
		cspPage.getNextButtonTopID().click();
		cspPage.getNextButtonTopID().click();
		cspPage.getNextButtonTopID().click();
		cspPage.getCallWaitingToneInitation().click();
		dropDown.selectByIndex(cspPage.getCallWaitingToneBParty(), 3);
		cspPage.getCallWaitingToneCParty().click();
		dropDown.selectByIndex(cspPage.getIntrusionProtectionLevel(), 3);
		cspPage.getIndivaidualDoNotDisturb().click();
		cspPage.getActivationDeactivationOfDND().click();
		cspPage.getNextButtonTopID().click();
		cspPage.getFollowMe().click();
		dropDown.selectByIndex(cspPage.getDirectDiversionTo(), 1);
		cspPage.getDiversionOnBusy().click();
		cspPage.getDiversionOnNoAnswer();
		cspPage.getRemoteProgrammingOnFollowMe().click();
		cspPage.getRemoteProgrammingOnDirectDivesrion().click();
		cspPage.getRemoteProgrammingOnBusy().click();
		cspPage.getRemoteProgrammingOnECF().click();
		cspPage.getRemoteProgrammingOnNoReply().click();
		cspPage.getNextButtonTopID().click();
		cspPage.getApplyButton().click();
		Assert.assertEquals(cspPage.getResponseMessage().getText().trim(), "Add operation successful for:");		
	}*/
	
	@Test
	public void createMS(Method method) throws InterruptedException
	{	
		new MethodStatus().checkMethodStatus(method.getName(), snmTests);
		slp = new SNM_Login_Page(driver);
		smp = new SNM_Main_Page(driver);
		systemPage = new SystemPage(driver);
		sysHardware = new SystemHardware(driver);
		mediaGateway = new SystemHardwareMediaGateway(driver);
		login.loginToSNM(slp, snmLoginSheet, 1, 2, 3);
		smp.getSystem().click();
		systemPage.getHardware().click();
		sysHardware.getMediaGateway().click();
		mediaGateway.getAddButton().click();
		mediaGateway.getSelectMediaServer().click();
		mediaGateway.getNextButton().click();
		String indexValue = new SelectDropDownValue().getIndexValue(mediaGateway.getMGW_Dropdown());
		if(indexValue.equals("A"))
		{
			mediaGateway.setControlData(snmTests.getData(68, 1));
			mediaGateway.setDefaultGatewayValue(snmTests.getData(68, 2));
			mediaGateway.setMediaData(snmTests.getData(68, 1));
			mediaGateway.setSymbolicName(indexValue);
		}
		else if(indexValue.equals("B"))
		{
			driver.findElement(By.id("addMediaGateway_VOs.mediaGateway_VO[1].mediaGatewayControlData.controlLAN0")).sendKeys(snmTests.getData(68, 1));
			driver.findElement(By.id("addMediaGateway_VOs.mediaGateway_VO[1].mediaGatewayControlData.defaultGatewayLAN0")).sendKeys(snmTests.getData(68, 2));
			driver.findElement(By.id("addMediaGateway_VOs.mediaGateway_VO[1].mediaGatewayControlData.symbolicName")).sendKeys("1"+indexValue);
			driver.findElement(By.id("addMediaGateway_VOs.mediaGateway_VO[1].mediaGatewayMediaData[0].mediaLAN0")).sendKeys(snmTests.getData(68, 1));
		}
		mediaGateway.getApplyButton().click();
		Assert.assertEquals(mediaGateway.getResponseMessage().getText().trim(), "Add operation successful for:");
		mediaGateway.getDoneButton().click();
		mediaGateway.getMediaGatewayViewButton().click();
		String actual = driver.findElement(By.xpath("//td[contains(text(),'"+"1"+indexValue+"')]//following::td/img")).getAttribute("title");
		Assert.assertEquals(actual, "All Up");
		
	}
}

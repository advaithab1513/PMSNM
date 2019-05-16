package junk;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pmsnm.baseTest.BasePage;
import com.snm.pageObjects.SNM_Login_Page;
import com.snm.pageObjects.SNM_Main_Page;


public class TestListeners1
{
	SNM_Login_Page slp;
	SNM_Main_Page smp;
	WebElement loggedInAccountInfo;
	
	/*@Test(priority=1)
		public void validateSnmValidLoginCredentails() throws InterruptedException
		{		
				slp = new SNM_Login_Page(driver);
				smp = new SNM_Main_Page(driver);
				loggedInAccountInfo =  smp.getLoggedInUserAccount();
				slp.setSnmUserNameField(data.excelData.get("SNM_Data").get("UserName"));
				slp.getSnmPasswordField().click();
				slp.setSnmPasswordField(data.excelData.get("SNM_Data").get("invalidPassword"));
				slp.getSnmUserLoginBtn().click();
				Assert.assertTrue(loggedInAccountInfo.isDisplayed());
				Reporter.log("Logged in to SNM Successfully", true);
			
	}*/
	
	@Test
	public void method2()
	{
		System.out.println("method2");
	}
}

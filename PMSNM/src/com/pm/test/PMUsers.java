package com.pm.test;

import static org.testng.Assert.assertEquals;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.pm.pageObjects.PM_Login_Page;
import com.pm.pageObjects.PM_Main_Page;
import com.pm.pageObjects.PM_User;
import com.pm.pageObjects.PM_Users;
import com.pmsnm.Utilities.SelectDropDownValue;
import com.pmsnm.baseTest.BasePagePM;



public class PMUsers extends BasePagePM
{
	public PM_Login_Page PMLogin;
	public PM_Main_Page PMMainPage;
	public PM_Users users;
	public PM_User user;
	
/*	//@Test(groups="smoke",dependsOnGroups="myGroup")
	@Test(groups="smoke")
	public void createUser(Method method)
	{
		String name = method.getName();
		String flag = PMUsers.getTestCaseFlag(excelPath, 8, name);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+PMUsers.getData(1, 0)+"is Skipped because flag is set to NO");
		}
		PMLogin = new PM_Login_Page(driver);
		PMMainPage = new PM_Main_Page(driver);
		users= new PM_Users(driver);
		user = new PM_User(driver);
		login.loginToPM(PMLogin, PMLoginSheet, 1, 2, 3);
		
		int x = 0;
		String value;
		//creating Users in bulk
		for(int i=0; i<220; i++)
		{
			value = PMUsers.getData(1, 1);
			value = value+x;
			PMMainPage.getUsers().click();
			users.getUser().click();
			user.getAddButton().click();
			user.setFirstNamefield(value);
			user.setAlternateFirstName(value);
			user.setLastNamefield(value);
			user.setAltLastName(value);
			user.setUserIDField(value);
			user.setUserPasswordField(PMUsers.getData(1, 6));
			user.setUserConfirmPasswordField(PMUsers.getData(1, 6));
			user.setEmailIDField(PMUsers.getData(1, 7));
			new SelectDropDownValue().selectByIndex(user.getSelectDepartmentDropdown(), 0);
			user.getListFilterAddButton_mySelectedDepts().click();
			user.getApplyButton().click();
			Assert.assertEquals(user.getResponseMessage().getText().trim(), "Add operation successful for:");
			x++;
		}
	}*/

/*	@Test(groups="smoke")
	public void viewUserUsingWildcardStar(Method method)
	{
		String name = method.getName();
		String flag = PMUsers.getTestCaseFlag(excelPath, 8, name);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+PMUsers.getData(1, 0)+"is Skipped because flag is set to NO");
		}
		PMLogin = new PM_Login_Page(driver);
		PMMainPage = new PM_Main_Page(driver);
		users= new PM_Users(driver);
		user = new PM_User(driver);
		login.loginToPM(PMLogin, PMLoginSheet, 1, 2, 3);
		PMMainPage.getUsers().click();
		users.getUser().click();
		user.setUserSearchTextBox("*");
		user.getOnViewRangeButton().click();
		List<WebElement> list = user.getListOfCheckBoxes();
		System.out.println(list.size());
		if(list.size()>20)
		{
			Assert.assertTrue(driver.findElement(By.name("selectItem")).isDisplayed(), "Wildcard * is not displaying all the records");
		}
		else
		{
			Assert.fail("All records are not displayed");
		}
		
	}
*/	
/*	@Test(groups= {"regression","smoke"})
	public void verifyMessageWhenUsersAreNotPresent(Method method)
	{
		String name = method.getName();
		String flag = PMUsers.getTestCaseFlag(excelPath, 8, name);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+PMUsers.getData(1, 0)+"is Skipped because flag is set to NO");
		}
		PMLogin = new PM_Login_Page(driver);
		PMMainPage = new PM_Main_Page(driver);
		users= new PM_Users(driver);
		user = new PM_User(driver);
		login.loginToPM(PMLogin, PMLoginSheet, 1, 2, 3);
		PMMainPage.getUsers().click();
		users.getUser().click();
		user.setUserSearchTextBox(PMUsers.getData(1, 1));
		user.getOnViewRangeButton().click();
		List<WebElement> list = user.getListOfCheckBoxes();
		System.out.println(list.size());
		String message = user.getNoDataFoundMessage().getText().trim();
		Assert.assertEquals(message, "No data found");
		
	}*/

/*	@Test(groups="regression")
	public void deleteMultipleUsers(Method method) throws InterruptedException
	{
		String name = method.getName();
		String flag = PMUsers.getTestCaseFlag(excelPath, 8, name);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+PMUsers.getData(1, 0)+"is Skipped because flag is set to NO");
		}
		PMLogin = new PM_Login_Page(driver);
		PMMainPage = new PM_Main_Page(driver);
		users= new PM_Users(driver);
		user = new PM_User(driver);
		login.loginToPM(PMLogin, PMLoginSheet, 1, 2, 3);
		PMMainPage.getUsers().click();
		users.getUser().click();
		user.setUserSearchTextBox(PMUsers.getData(1, 1));
		user.getOnViewRangeButton().click();
		
		//findElements will return 0 if there are no elements specified.
		List<WebElement> list = user.getListOfCheckBoxes();
		System.out.println(list.size());
		if(list.size()==0)
		{
			System.out.println("No Elements are Present");
			Assert.assertEquals(user.getNoDataFoundMessage().getText().trim(), "No data found");
		}
		else
		{
			int iterations = list.size()/10;
			//int remainder = list.size()%10;
			if(iterations>0)
			{
				for(int i=0; i<iterations; i++)
				{
					for(int j=1; j<=10; j++)
					{
						driver.findElement(By.xpath("(//input[@name='selectItem'])["+j+"]")).click();
					}
					user.getRemoveSelected().click();
					driver.switchTo().alert().accept();
					Assert.assertEquals(user.getResponseMessage().getText().trim(), "Remove operation successful for:");
					Thread.sleep(5000);
				}
			}
			user.getOnViewRangeButton().click();
			List<WebElement> list1 = user.getListOfCheckBoxes();
			System.out.println(list1.size());
			if(list1.size()==0)
			{
				Thread.sleep(2000);
				System.out.println("No Elements are Present");
				Assert.assertEquals(user.getNoDataFoundMessage().getText().trim(), "No data found");
			}
			else
			{
				int remaining = list1.size();
				for(int j=1; j<=remaining; j++)
				{
					driver.findElement(By.xpath("(//input[@name='selectItem'])["+j+"]")).click();
				}
				user.getRemoveSelected().click();
				driver.switchTo().alert().accept();
				Assert.assertEquals(user.getResponseMessage().getText().trim(), "Remove operation successful for:");
			}

		}
		
	}*/
	
/*	@Test
	public void editUser(Method method)
	{
		String name = method.getName();
		String flag = PMUsers.getTestCaseFlag(excelPath, 8, name);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+PMUsers.getData(1, 0)+"is Skipped because flag is set to NO");
		}
		PMLogin = new PM_Login_Page(driver);
		PMMainPage = new PM_Main_Page(driver);
		users= new PM_Users(driver);
		user = new PM_User(driver);
		login.loginToPM(PMLogin, PMLoginSheet, 1, 2, 3);
		PMMainPage.getUsers().click();
		users.getUser().click();
		user.setUserSearchTextBox(PMUsers.getData(1, 1));
		user.getOnViewRangeButton().click();
		user.getUserEditSymbol().click();
		user.getUserIDField().clear();
		user.setUserIDField(PMUsers.getData(1, 1)+"0"+"Edited");
		user.getEditUserPageApplyButton().click();
		user.getDoneButton().click();
		user.getUserSearchTextBox().clear();
		user.setUserSearchTextBox(PMUsers.getData(1, 1)+"0"+"Edited");
		user.getOnViewRangeButton().click();
		Assert.assertTrue(user.getSelectCheckBox().isDisplayed(), "No, Edited Element Is Not Displayed");
		
	}*/
	
/*	@Test
	public void resultsDisplayPaging(Method method)
	{
		String name = method.getName();
		String flag = PMUsers.getTestCaseFlag(excelPath, 8, name);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+PMUsers.getData(1, 0)+"is Skipped because flag is set to NO");
		}
		PMLogin = new PM_Login_Page(driver);
		PMMainPage = new PM_Main_Page(driver);
		users= new PM_Users(driver);
		user = new PM_User(driver);
		login.loginToPM(PMLogin, PMLoginSheet, 1, 2, 3);
		PMMainPage.getUsers().click();
		users.getUser().click();
		user.setUserSearchTextBox(PMUsers.getData(1, 1));
		user.getOnViewRangeButton().click();
		new SelectDropDownValue().selectByIndex(user.getResultsPagingDropDown(), 1);
		user.getUsersResultsPagingGoButton().click();
		Assert.assertTrue(driver.findElement(By.id("changeThis219_img")).isDisplayed(), "No, all Elements are Not Displayed");
		
		
		
	}*/
	
/*	@Test
	public void VerifyUserHelpWindowText(Method method) throws InterruptedException
	{
		String name = method.getName();
		String flag = PMUsers.getTestCaseFlag(excelPath, 8, name);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+PMUsers.getData(1, 0)+"is Skipped because flag is set to NO");
		}
		PMLogin = new PM_Login_Page(driver);
		PMMainPage = new PM_Main_Page(driver);
		users= new PM_Users(driver);
		user = new PM_User(driver);
		login.loginToPM(PMLogin, PMLoginSheet, 1, 2, 3);
		PMMainPage.getUsers().click();
		users.getUser().click();
		user.getHelpLink().click();
		String parentWindow = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		String p1Actual;
		String p2Actual;
		String p3Actual;
		String p4Actual;
		String p5Actual;
		String p6Actual;
		String p7Actual;
		String p1Expected = "Users can be added one by one or be imported from files extracted from other user "
				+ "management systems. When the system is installed a System Setup Admin is added. "
				+ "All users except the System Setup Admin can be removed.";
		String p2Expected = "After installation it is recommended to create an extra System Setup Admin to keep as "
				+ "backup if something happens to the original System Setup Admin account, for example if the "
				+ "password is lost, otherwise the whole system must be reinstalled.";
		String p3Expected = "When a user is added, it is automatically assigned the security profile End User. "
				+ "An end user can be promoted to administrator by assigning the user a different security profile "
				+ "and defining access to departments and locations in the Administrator task.";
		String p4Expected = "The logged on administrator can only see the users, administrators and administrator users, "
				+ "that the logged on administrator has added. An administrator at a lower level could not "
				+ "see the administrator on a higher level in the hierarchy";
		String p5Expected = "Services, for example extensions and mailboxes, can be assigned to users. "
				+ "Services are provided by the configured subsystems.";
		String p6Expected = "The privilege Manage user data is required to add, change or remove users. "
				+ "Privileges are set in the Security Profile task.";
		String p7Expected = "User Defined Fields (UDFs) are defined in the UDF Mapping task by an administrator "
				+ "assigned the privilege Manage UDF data.";
		for(String window : set)
		{
			if(!window.equals(parentWindow))
			{
				driver.switchTo().window(window);
				p1Actual = driver.findElement(By.xpath("(//p)[1]")).getText().trim();
				p2Actual = driver.findElement(By.xpath("(//p)[2]")).getText().trim();
				p3Actual = driver.findElement(By.xpath("(//p)[3]")).getText().trim();
				p4Actual = driver.findElement(By.xpath("(//p)[4]")).getText().trim();
				p5Actual = driver.findElement(By.xpath("(//p)[5]")).getText().trim();	
				p6Actual = driver.findElement(By.xpath("(//p)[6]")).getText().trim();
				p7Actual = driver.findElement(By.xpath("(//p)[7]")).getText().trim();
				Assert.assertEquals(p1Actual, p1Expected);
				Assert.assertEquals(p2Actual, p2Expected);
				Assert.assertEquals(p3Actual, p3Expected);
				Assert.assertEquals(p4Actual, p4Expected);
				Assert.assertEquals(p5Actual, p5Expected);
				Assert.assertEquals(p6Actual, p6Expected);
				Assert.assertEquals(p7Actual, p7Expected);
				driver.close();
			}
		}
		driver.switchTo().window(parentWindow);
		Thread.sleep(3000);
	}*/
}

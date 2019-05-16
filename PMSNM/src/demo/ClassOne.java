package demo;

import org.testng.annotations.Test;

public class ClassOne 
{
	@Test(groups= {"group1"})
	public void createUser()
	{
		System.out.println("createUser");
	}
	
	@Test(groups= {"group1"})
	public void viewUser()
	{
		System.out.println("viewUser");
	}
	
	@Test(groups= {"group1"}, dependsOnMethods="viewUser")
	public void modifyUser()
	{
		System.out.println("modifyUser");
	}
	
	@Test(dependsOnGroups= {"group1"})
	public void deleteUser()
	{
		System.out.println("deleteUser");
	}
	
	@Test()
	public void batchUpdate()
	{
		System.out.println("academic");
	}

}

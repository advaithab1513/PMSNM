package junk;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestListeners2 
{
	@Test
	public void method3()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void method4()
	{
		Assert.fail();
	}
}

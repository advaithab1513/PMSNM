package com.snm.test;

import org.testng.annotations.Test;


public class POC2 
{
	@Test(groups="smoke")
	public void method4()
	{ 
		
	}

	@Test(groups={"regression","smoke"})
	public void method5()
	{ 
		
	}

	@Test(groups="smoke")
	public void method6()
	{ }
	
	@Test(groups="excludeGrp")
	public void method7()
	{ }
}

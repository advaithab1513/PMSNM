package com.snm.test;

import org.testng.annotations.Test;


public class POC1 
{
	@Test(groups="smoke")
	public void method1()
	{ 
		
	}

	@Test(groups={"regression","smoke"})
	public void method2()
	{ 
		
	}

	@Test(groups="regression")
	public void method3()
	{ }

	@Test(groups="exclude1Grp")
	public void method8()
	{ }
}

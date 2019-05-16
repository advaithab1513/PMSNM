package demo;

import org.testng.annotations.Test;

public class ClassThree 
{
	@Test()
	public void testOneClassThree()
	{
		System.out.println("method1 CLASSThree");
	}
	
	@Test
	public void testTwoClassThree()
	{
		System.out.println("method2 CLASSThree");
	}
	
	@Test(priority=5)
	public void testThreeClassThree()
	{
		System.out.println("method3 CLASSThree");
	}
	
	@Test
	public void testFourClassThree()
	{
		System.out.println("method4 CLASSThree");
	}
	
	@Test
	public void testFiveClassThree()
	{
		System.out.println("method5 CLASSThree");
	}
}

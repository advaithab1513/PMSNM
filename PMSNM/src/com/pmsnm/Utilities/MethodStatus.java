package com.pmsnm.Utilities;

import com.pmsnm.Utilities.AutoConstants;

import java.lang.reflect.Method;

import org.testng.SkipException;

public class MethodStatus 
{
	public void checkMethodStatus(String methodName, ExcelReadAndWrite snmTests)
	{
		System.out.println(snmTests);
		String flag = snmTests.getTestCaseFlag(AutoConstants.excelPath, 5, methodName);
		if(flag.equals("N"))
		{
			throw new SkipException("TestCase "+methodName+"is Skipped because flag is set to NO");
		}
	}
}

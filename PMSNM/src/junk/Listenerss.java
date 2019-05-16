package junk;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import demo.Test1;

public class Listenerss implements ITestListener
{

	Logger log = Logger.getLogger(Test1.class);
	
	@Override
	public void onTestStart(ITestResult result) 
	{
		//Logger log = Logger.getLogger(Test1.class);
		DOMConfigurator.configure("log4j.xml");
		log.debug("================================================================");
		log.debug("                On Start:" + result.getName());
		log.debug("================================================================");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		DOMConfigurator.configure("log4j.xml");
		log.debug("================================================================");
		log.debug("                On Success:" + result.getName());
		log.debug("================================================================");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		DOMConfigurator.configure("log4j.xml");
		log.debug("================================================================");
		log.debug("                On Failure:" + result.getMethod().getMethodName());
		log.debug("================================================================");
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("On SUccess Of The Method:" + result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		
	}
	
}

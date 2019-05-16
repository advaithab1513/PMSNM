package com.pmsnm.Utilities;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot 
{
	public static void getScreenshot(WebDriver driver, String methodName)
	{
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File src = screenShot.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/"+methodName+".png");
		try 
		{
			FileUtils.copyFile(src, dest);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}

package junk;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver,60);
		driver.get("http://10.211.162.172");
		driver.manage().window().maximize();
		
		/*RemoteWebDriver implements TakeScreenshot and WebDriver Interfaces so RemoteWebDriver has
		the implementation for getScreenshotAs method present in TakeScreenshot interface.
		Our driver classes chrome,firefox since extends RemoteWebdriver will obviously have
		implementation of getScreenshoyAs method.
		
		So in many cases we would have seen the below lines of code
		WebDriver driver = new ChromeDriver();
		TakesScreenshot scrnShot = (TakesScreenshot)driver;
				
		here we are converting from driver to TakeScreenshot becoz driver is declared as WebDriver
		and WebDriver doesn't have getScreenshotAs method so to solve this there are 2 options.
		1. convert driver to TakeScreenshot as shown below:
			TakesScreenshot scrnShot = (TakesScreenshot)driver;
		2. Declare like below so that u dont have to even use TakeScreenshot interface directly u can 
		do this as shown below:
		ChromeDriver driver = new ChromeDriver();
		File src = driver.getScreenshotAs(OutputType.FILE);
		//move the file to new destination
		File dest = new File("./Screenshots/Sshot.png");
		FileUtils.copyFile(src, dest);
		
		but preferred way is as shown below:
		
		WebDriver driver = new ChromeDriver();
		TakesScreenshot scrnShot = (TakesScreenshot)driver;
		File src = scrnShot.getScreenshotAs(OutputType.FILE);
		//move the file to new destination
		File dest = new File("./Screenshots/Sshot.png");
		FileUtils.copyFile(src, dest);
		*/
				
		TakesScreenshot scrnShot = (TakesScreenshot)driver;
		File src = scrnShot.getScreenshotAs(OutputType.FILE);
		//move the file to new destination
		File dest = new File("./Screenshots/Sshot.png");
		FileUtils.copyFile(src, dest);
		
		
	
	}
}

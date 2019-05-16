package junk;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;



public class Snm 
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
		driver.get("http://10.211.162.170");
		driver.manage().window().maximize();
		driver.findElement(By.name("userId")).sendKeys("mxone_admin");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("Mxone@456");
		driver.findElement(By.name("login")).click();
	/*	String actual = driver.findElement(By.xpath("//p[contains(text(),'settings')]")).getText();
		System.out.println(actual);
		System.out.println(actual.length());
		String expected = "This application handles the system settings for the MiVoice MX-ONE Service Node. For user settings please use the \"MiVoice MX-ONE Provisioning Manager\" application.";
		if(actual.equals(expected))
		{
			System.out.println("equal");
		}
		System.out.println(expected.length());
		Assert.assertEquals(actual, expected);*/
		//System.out.println(expected.length());
		driver.findElement(By.linkText("Logout")).click();
	}
}

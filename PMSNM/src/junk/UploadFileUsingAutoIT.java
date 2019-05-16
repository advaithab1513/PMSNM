package junk;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFileUsingAutoIT 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver,60);
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[contains(text(),'Help')]")).click();
		driver.findElement(By.xpath("//a[text()='Contact actiTIME Support']")).click();
		driver.findElement(By.xpath("//div/span[text()='Drag and drop file here or click to upload']")).click();
		Thread.sleep(2000);
		//String path = "C:\\Users\\mallikar\\Desktop\\Call_list_6_10.png";
		Runtime.getRuntime().exec("C:\\Users\\mallikar\\PMSNM_Automation\\PMSNM_Automation\\AutoItFiles\\ChromeUpload.exe");
		
		
		}
		
}

package junk;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CancelDownloadUsingAutoIT 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver,60);
		driver.manage().window().maximize();
		driver.get("https://docs.seleniumhq.org/download/");
		/*driver.findElement(By.xpath("//a[@href='https://bit.ly/2TlkRyu']")).click();
		Runtime.getRuntime().exec("C:\\Users\\mallikar\\Desktop\\224\\Download.exe");*/
		
		
		driver.findElement(By.xpath("//td[text()='Java']/..//a[text()='Download']")).click();
		Runtime.getRuntime().exec("C:\\Users\\mallikar\\Desktop\\224\\CancelDownload.exe");
		
		
	}
}

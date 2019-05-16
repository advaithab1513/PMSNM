package demo1;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junk.Listenerss;

public class Test2
{
	static WebDriver driver = null;
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}
	
	@Test
	public void method() throws Exception
	{
		Listenerss ls = new Listenerss();
		Logger log = Logger.getLogger(Test2.class);
		try
		{
		/*driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		//Logger log = Logger.getLogger("devpinoyLogger");
		DOMConfigurator.configure("log4j.xml");
		log.debug("Before opening the url");
		//driver.get("https://www.google.com/");
		log.info("After opening the google page");
		//driver.findElement(By.xpath("//input[@class='f gsfi']"));
		log.error("Found the google text box");
		}
		catch(Exception e)
		{
			log.error("Failed", e);
		}

	}	
		
}

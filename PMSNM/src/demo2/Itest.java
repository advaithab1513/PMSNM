package demo2;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import demo1.Test2;
import junk.Listenerss;

public class Itest 
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
		Logger log = Logger.getLogger(Itest.class);
		try
		{
		/*driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		//Logger log = Logger.getLogger("devpinoyLogger");
		DOMConfigurator.configure("log4j.xml");
		log.debug("hello");
		//driver.get("https://www.google.com/");
		log.info("world");
		//driver.findElement(By.xpath("//input[@class='f gsfi']"));
		log.error("Hello");
		}
		catch(Exception e)
		{
			log.error("Failed", e);
		}

	}	
}

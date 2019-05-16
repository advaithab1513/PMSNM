package junk;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CallList 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver,60);
		driver.get("http://[fd12:3456:789a:bcd2:5080::196]");
		driver.manage().window().maximize();
		driver.findElement(By.name("userId")).sendKeys("SProvider");
		driver.findElement(By.xpath("//input[@name='password']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SProvider@123");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.id("Services")).click();
		driver.findElement(By.id("Extension")).click();
		driver.findElement(By.name("rangeFields[1]")).sendKeys("10010", Keys.ENTER);
		driver.findElement(By.id("changeThis0_img")).click();
		driver.findElement(By.id("editItem_personalnumber")).click();
		ArrayList<String> list = new ArrayList<String>();
		list.add("10021");
		list.add("10022");
		list.add("10023");
		list.add("10024");
		list.add("10025");
		list.add("10026");
		list.add("10027");
		list.add("10028");
		list.add("10029");
		list.add("10030");
		
		
		String id = null; 
		for(int i=0; i<10; i++)
		{
			id = "changeThis";
			driver.findElement(By.id(id+i+"_img")).click();
			driver.findElement(By.name("onAdvancedButton")).click();
			
			for(int j=0; j<10; j++)
			{
				int x = 0;
				String seq = "myPersonalNumber_VO.PELPP.LISTs.LIST[0].CHOs.CHO[";
				String stime = "myPersonalNumber_VO.PELPP.LISTs.LIST[0].CHOs.CHO["+j+"].STIME";
				driver.findElement(By.id(seq+j+"].ANSPOS")).sendKeys(list.get(j));
				driver.findElement(By.id(stime)).clear();
				driver.findElement(By.id(stime)).sendKeys("7");
			}
			driver.findElement(By.xpath("(//input[@name='Apply'])[1]")).click();
		}
		
	
	}
}

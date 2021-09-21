package com.exceptionalcasesinstitution.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class Base2
{
	public static Properties prop1;
	public static WebDriver driver;
	
	
	public Base2()
	{
		try {
			prop1=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\BASHA\\Downloads\\ExceptionalCasesInstitution\\config2.properties");
			prop1.load(ip);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}	
			

	public static  void initialization2() throws Throwable {
		String browsewName=prop1.getProperty("browser");
		if(browsewName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\BASHA\\Downloads\\ExceptionalCasesInstitution\\target\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browsewName.equals("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver.exe");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(prop1.getProperty("url"));

	}




}



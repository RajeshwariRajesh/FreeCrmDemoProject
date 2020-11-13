package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.qa.util.TestUtil;



public class TestBase {
	public  static  WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	
	{
		try {
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\D5490-102812G\\eclipse-workspace\\FrameCRMDemo\\src\\main\\java\\com\\qa\\config\\config.properties");
				
		prop.load(file);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	public static void intialization()
	{
		String BrowserName=prop.getProperty("browser");
		if(BrowserName.equals("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\D5490-102812G\\Downloads\\chromedriver_win32\\chromedriver.exe");		
			driver = new ChromeDriver();
		}
		else if(BrowserName.equals("FF"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\D5490-102812G\\Downloads\\chromedriver_win32\\chromedriver.exe");	
			
					
			driver = new FirefoxDriver();
		}
		else if(BrowserName.equals("IE"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\D5490-102812G\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(prop.getProperty("URl"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_wait_time, TimeUnit.SECONDS);
	}
}

package com.selenium.SeleniumTest;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest {

	WebDriver driver;
	
	@Test
	public void checkGoogleTitle()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String tit=driver.getTitle();
		assertEquals("Google" ,tit);
		driver.close();
	}
	
}


     
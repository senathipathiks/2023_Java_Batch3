package com.demo.SeleniumProject;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest 
{
	WebDriver driver;
    
    @Test
    public void checkGoogleTitle()
    {
    	driver = new ChromeDriver();
    	driver.get("http://www.google.com");
    	String title = driver.getTitle();
    	assertEquals("Google",title);
    	driver.close();	
    }
}

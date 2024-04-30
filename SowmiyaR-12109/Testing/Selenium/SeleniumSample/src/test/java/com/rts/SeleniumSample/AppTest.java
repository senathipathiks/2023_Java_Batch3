package com.rts.SeleniumSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.assertEquals;
/**
 * Unit test for simple App.
 */
public class AppTest  
    
{
    
	WebDriver driver;
	
	@org.junit.Test
	public void checkGoodleTitle() {
		
		driver =new ChromeDriver();
		driver.get("http://www.google.com");
		String tit=driver.getTitle();
	   assertEquals("Google",tit);
	   driver.close();
	   
	}
}

package com.rts.SeleniumSample;

import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class AppTest 
    
{
   WebDriver driver;
   @Test
   public void ceckGoogleTitle()
   {
	   driver=new ChromeDriver();
	   driver.get("https://www.google.com");
	   String tit=driver.getTitle();
	   assertEquals("Google", tit);
	   driver.close();
	   
   }
}

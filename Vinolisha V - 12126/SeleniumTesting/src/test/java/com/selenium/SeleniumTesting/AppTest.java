package com.selenium.SeleniumTesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class AppTest
{
	
	static WebDriver driver;
	
	@Test
	public void checkGoogleTitle() {
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String tit=driver.getTitle();
		assertEquals("Google",tit);
		driver.close();
	}

}

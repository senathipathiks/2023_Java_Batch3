package com.rts.Automation_Selenium;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppMyTest {

	WebDriver driver;

	@Test
	public void checkTitle() {

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String tit = driver.getTitle();
		assertEquals("Google", tit);
		driver.close();
		
		// driver.quit() -->for bulk of test case

	}

}

package com.rts.seleniumExample;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.Duration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class UnitTestGoogle {
	
	static WebDriver driver;

	@BeforeAll
	public static void initial() {

		driver = new ChromeDriver();

	}

	@Test
	void test() {
		driver.get("http://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        
        String title = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();
        
        System.out.println("Title : "+title);
        System.out.println("Current Url : "+currentUrl);
        
        assertEquals("Google", title);
        driver.close();
	}
	
	

}

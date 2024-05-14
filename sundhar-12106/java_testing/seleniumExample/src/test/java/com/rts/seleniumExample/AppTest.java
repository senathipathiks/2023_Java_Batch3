package com.rts.seleniumExample;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	static WebDriver driver;

	@BeforeClass
	public static void initial() {

		driver = new ChromeDriver();

	}
	
    @Test
    public void openBrowser()
    {
        driver.get("http://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        
        String title = driver.getTitle();
        String currentUrl = driver.getCurrentUrl();
        
        System.out.println("Title : "+title);
        System.out.println("Current Url : "+currentUrl);
        
//        driver.findElement(By.name("q")).sendKeys("sachin",Keys.ENTER);
//        WebElement google_text = driver.findElement(By.name("q"));
//        google_text.sendKeys("Dhoni",Keys.ENTER);
        
//        google_text.lo
        assertEquals("Google", title);
        driver.close();
    }
    
    public void name() {
		
	}
}

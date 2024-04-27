package com.rts.Selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   WebDriver driver;
    @Test
    public void shouldAnswerWithTrue()
    {
        driver=new ChromeDriver();
        driver.get("http://www.google.com");
        String tit = driver.getTitle();
        assertEquals("Google", tit);
        driver.close(); 
//        driver.quit();
    }
}

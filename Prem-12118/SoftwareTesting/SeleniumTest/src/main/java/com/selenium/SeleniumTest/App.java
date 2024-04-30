package com.selenium.SeleniumTest;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
    public static void main( String[] args )
    {
    	
    	WebDriver driver = new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	driver.get("http:\\www.google.com");
    	
    	

    	String title=driver.getTitle();
    	String urlLoaded=driver.getCurrentUrl();
    	
    	System.out.println(title);
    	System.out.println(urlLoaded);
    	
    	
    	WebElement google_Text=driver.findElement(By.name("q"));
    	google_Text.sendKeys("Sachin");
    	driver.findElement(By.name("btnK")).click();
    	
    	
//    	driver.findElement(By.name("q")).sendKeys("Silambarasan TR");
//    	driver.findElement(By.name("btnK")).click();
    	
//    	driver.findElement(By.name("q")).sendKeys("Suriya");
//    	driver.findElement(By.name("btnI")).click();
    	
        
    }
}

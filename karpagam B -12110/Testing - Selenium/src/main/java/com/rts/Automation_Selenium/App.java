package com.rts.Automation_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
    	
    	WebDriver  driver= new ChromeDriver();
    	
    	//wait for browser to load (here it wait for 5s)
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	driver.get("https://www.google.com");
    	
    	//to check the title  and on which url it is loading
    	String title=driver.getTitle();
    	String urlLoaded=driver.getCurrentUrl();
    	
    	System.out.println(title);
    	System.out.println(urlLoaded);
    	
    	
    	//check whether it is working fine or not (using webElement)
//    	WebElement google_text=driver.findElement(By.name("q"));
//    	google_text.sendKeys("kalpana chawla");
//    	driver.findElement(By.name("btnK")).click();

    	
    	//check whether it is working fine or not (q is for textbox & btnK is name of google search button while inspecting)

//    	driver.findElement(By.name("q")).sendKeys("sachin");
//      driver.findElement(By.name("btnK")).click();
    	
    	
    	//using isDisplayed command in webElement
    	
//    	WebElement element=driver.findElement(By.id("hplogo"));
//    	boolean status=element.isDisplayed();
//    	System.out.println(status);
    	
    	//using isenabled command in webElement
    	
    	WebElement element = driver.findElement(By.name("q"));  
    	boolean status = element.isEnabled();  
    	// Check that if the Text field is enabled, if yes enter value  
    	if(status){  
    	element.sendKeys("hello");  
    	}  


    	
    	
    	

    	
    	
    	
    	
    	
    }
}

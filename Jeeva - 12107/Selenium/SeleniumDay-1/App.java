package com.teting.SeleniumSampl;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	
    // In this line, we are creating an instance of the ChromeDriver class,
    //which is a part of the Selenium WebDriver library. 
    	//The ChromeDriver class is used to automate the Chrome browser. 
    	//The instance created is stored in a variable named driver.
      //  WebDriver driver= new ChromeDriver(); // here Loaded
        
        
//In this line, we are using the driver instance to navigate to the Google homepage. 
//The get method is a method of the WebDriver interface, which is implemented by 
//the ChromeDriver class. The get method takes a string argument representing the URL 
//of the webpage to navigate to. In this case, we are navigating to "http://www.google.com".

        //	driver.get("http:\\www.google.com"); // actually telling to open the url
    
    
    // set browser TimeOut
        	
       WebDriver driverTimeout= new ChromeDriver(); // here Loaded
        driverTimeout.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driverTimeout.get("http:\\www.google.com");
    
        
        // Declare Using WebElement
        
        WebElement google_Text=driverTimeout.findElement(By.name("q"));
        google_Text.sendKeys("Messi");
        
        // Without WebElement
        
        driverTimeout.findElement(By.name("btnK")).click();
    
        
        // Check The Expected Page        
        String title=driverTimeout.getTitle();
        String urlLoaded=driverTimeout.getCurrentUrl();
        
        System.out.println("Title "+title);
        System.out.println("Url "+urlLoaded);
        
        
        
    
    
    
    
    }
}

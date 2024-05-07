package com.rts.SeleniumSample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https:\\www.google.com");
        
        // Testing whether the target page is loaded or not
        
        String title=driver.getTitle();
        String urlLoader=driver.getCurrentUrl();
        
        System.out.println(title);
        System.out.println(urlLoader);
        
//        driver.findElement(By.name("q")).sendKeys("Thalapathy Vijay");
//        driver.findElement(By.name("btnK")).click();
        
        WebElement google_Text=driver.findElement(By.name("q"));
        google_Text.sendKeys("Dhoni");
        
        driver.findElement(By.name("btnK")).click();
        
        
    }
}

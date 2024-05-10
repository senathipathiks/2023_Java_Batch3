package com.selenium.SeleniumTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.google.com");
        
//        driver.findElement(By.name("q")).sendKeys("vinolisha",Keys.ENTER);
        
//        driver.findElement(By.name("q")).sendKeys("vinolisha");
//        driver.findElement(By.name("btnK")).click();
        
        String title=driver.getTitle();
        String urlLoaded=driver.getCurrentUrl();
        
        System.out.println(title);
        System.out.println(urlLoaded);
        
        WebElement google_Text=driver.findElement(By.name("q"));
        google_Text.sendKeys("Vinolisha",Keys.ENTER);
        
    }
}

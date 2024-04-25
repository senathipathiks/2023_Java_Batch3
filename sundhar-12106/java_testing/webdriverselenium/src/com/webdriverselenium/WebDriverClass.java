package com.webdriverselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverClass {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();

		
		driver.get("http://www.google.com");
		driver.manage().window().maximize();  
		
		// Click on the Search button  
        driver.findElement(By.className("gLFyf")).click();
        
        driver.findElement(By.className("gLFyf")).sendKeys("relevantz.com",Keys.ENTER);
        
        
        driver.findElement(By.className("LC20lb")).click();
        
        driver.findElement(By.className("iubenda-cs-close-btn")).click();
        
        
        driver.findElement(By.id("menu-item-6964")).click();
        
        driver.findElement(By.id("menu-item-6447")).click();
        
        
	}

}

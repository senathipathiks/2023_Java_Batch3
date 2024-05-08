package com.demo.SeleniumProject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.google.com");

//        driver.findElement(By.name("q")).sendKeys("partha");

		WebElement google_Textbox = driver.findElement(By.name("q"));
		google_Textbox.sendKeys("Java");

		driver.findElement(By.name("btnK")).click();

		System.out.println("Title: "+driver.getTitle());
		System.out.println("Url: "+driver.getCurrentUrl());
		
		driver.quit();
	}
}

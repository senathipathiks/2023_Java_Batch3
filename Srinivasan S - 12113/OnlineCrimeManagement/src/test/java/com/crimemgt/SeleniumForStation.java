package com.crimemgt;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumForStation {

	WebDriver driver = new ChromeDriver();

	@Test
	void login() {
		driver.get("http://localhost:3000/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".log-in")).click();
		driver.findElement(By.name("slogin")).click();
		driver.findElement(By.id("stationId")).click();
		driver.findElement(By.id("stationId")).sendKeys("1001");
		driver.findElement(By.id("stationPassword")).click();
		driver.findElement(By.id("stationPassword")).sendKeys("M!1");
		driver.findElement(By.id("slogin"));
		driver.close();

	}
	
	@Test
	void allStation() {
		driver.get("http://localhost:3000/stationhome");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".log-in")).click();
		driver.findElement(By.name("station")).click();
		driver.close();

	}
	
	@Test
	void stationInfo() {
		driver.get("http://localhost:3000/stationhome");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".log-in")).click();
		driver.findElement(By.name("stationinfo")).click();
		driver.findElement(By.id("uback"));
		driver.close();

	}

	@Test
	void criminalInfo() {
		driver.get("http://localhost:3000/stationhome");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".log-in")).click();
		driver.findElement(By.name("criminal")).click();
		driver.findElement(By.id("uback"));
		driver.close();

	}
	
	@Test
	void pending() {
		driver.get("http://localhost:3000/stationhome");
		driver.manage().window().maximize();
		driver.findElement(By.id("stationcard1")).click();
		driver.findElement(By.id("uback"));
		driver.close();

	}
	
	@Test
	void solved() {
		driver.get("http://localhost:3000/stationhome");
		driver.manage().window().maximize();
		driver.findElement(By.id("stationcard2")).click();
		driver.findElement(By.id("uback"));
		driver.close();

	}
	
	@Test
	void withdrawn() {
		driver.get("http://localhost:3000/stationhome");
		driver.manage().window().maximize();
		driver.findElement(By.id("stationcard3")).click();
		driver.findElement(By.id("uback"));
		driver.close();

	}
//	
//	@Test
//	void logout() {
//		driver.get("http://localhost:3000/stationhome");
//		driver.manage().window().maximize();
//		driver.findElement(By.cssSelector(".log-in")).click();
//		driver.findElement(By.name("logout")).click();
//		driver.close();
//
//	}
}

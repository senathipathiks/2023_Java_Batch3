package com.tms.selenium;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AdminSelenium {

	static WebDriver driver;

	@BeforeClass
	void Intialization() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();

	}

	// admin Login From Landing Page
	@Test
	@Disabled
	void AdminLoginPage() throws InterruptedException {
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.get("http://localhost:3000/");
		Thread.sleep(1000);

		driver.findElement(By.id("admin")).click();

		WebElement element = driver.findElement(By.id("name"));
		element.sendKeys("admin");
		Thread.sleep(10000);
		WebElement element1 = driver.findElement(By.id("password"));
		element1.sendKeys("Admin@123");
		Thread.sleep(10000);

		driver.findElement(By.id("signin")).click();
		Thread.sleep(10000);
	}

	// admin Home Page pending & approved request
	@Test
//	@Disabled
	void AdminHome() throws InterruptedException {
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.get("http://localhost:3000/adminhome/");
//					Thread.sleep(1000);
//					driver.findElement(By.id("pending")).click();
//					Thread.sleep(1000);
//					driver.findElement(By.id("bookpt")).click();
//					Thread.sleep(1000);
//					driver.findElement(By.id("backk")).click();

		Thread.sleep(1000);
		driver.findElement(By.id("approved")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("backTo")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("rejected")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("home")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("landing")).click();

	}

	@AfterClass
	void End() {
		driver.close();

	}

}

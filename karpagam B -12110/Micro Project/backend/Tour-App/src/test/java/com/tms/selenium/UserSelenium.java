package com.tms.selenium;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class UserSelenium {

	static WebDriver driver;

	@BeforeClass
	void Intialization() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();

	}

	// user Login From Landing Page
	@Test
	@Disabled
	void LoginPagePetInsert() throws InterruptedException {
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.get("http://localhost:3000/");
		Thread.sleep(1000);
		String title = driver.getTitle();
		Thread.sleep(10000);
		String urlLoaded = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(urlLoaded);
		assertEquals("React App", title);

		driver.findElement(By.id("user")).click();

		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("kaviya");
		Thread.sleep(10000);
		WebElement element1 = driver.findElement(By.id("password"));
		element1.sendKeys("Kaviya@123");
		Thread.sleep(10000);

		driver.findElement(By.id("submit")).click();
		Thread.sleep(10000);
	}

	// user Registration
	@Test
//	@Disabled
	void userView() throws InterruptedException {
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.get("http://localhost:3000/register/");
		Thread.sleep(1000);

		WebElement element = driver.findElement(By.id("firstName"));
		element.sendKeys("Srini");
		Thread.sleep(1000);
		WebElement element1 = driver.findElement(By.id("lastName"));
		element1.sendKeys("Srini@1234");
		Thread.sleep(10000);
		WebElement element2 = driver.findElement(By.id("scheme"));
		element2.sendKeys("9489275402");
		Thread.sleep(10000);
		WebElement element3 = driver.findElement(By.id("mail"));
		element3.sendKeys("srini@gmail.com");
		Thread.sleep(10000);
		WebElement element4 = driver.findElement(By.id("address"));
		element4.sendKeys("Tenkasi");
		Thread.sleep(10000);

		driver.findElement(By.id("signup")).click();
	}

	// user home From user search & view booking
	@Test
	@Disabled
//	void userView() throws InterruptedException {
//		driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//		Thread.sleep(10000);
//		driver.get("http://localhost:3000/userhome/");
//		Thread.sleep(1000);
//
//		driver.findElement(By.id("viewbook")).click();
//
//		WebElement element = driver.findElement(By.id("search"));
//		element.sendKeys("wayanad");
//		Thread.sleep(10000);
//
//		driver.findElement(By.id("button")).click();
//		driver.findElement(By.id("book")).click();
//		Thread.sleep(10000);
//
//		driver.findElement(By.id("back")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.id("viewback")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.id("signout")).click();
//
//		WebElement element1 = driver.findElement(By.id("date"));
//		element1.sendKeys("12-06-2024");
//		Thread.sleep(10000);
//
//		driver.findElement(By.id("insertsubmit")).click();
//		Thread.sleep(10000);
//
//	}

	@AfterClass
	void End() {
		driver.close();

	}

}

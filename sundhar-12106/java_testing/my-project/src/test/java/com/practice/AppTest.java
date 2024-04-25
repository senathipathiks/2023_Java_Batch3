package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

	static WebDriver driver;

	@BeforeClass
	public static void initial() {

//		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void searchRelevantz() {
		driver.get("http://www.google.com");
		driver.manage().window().maximize();

		// Click on the Search button
		driver.findElement(By.className("gLFyf")).click();

		driver.findElement(By.className("gLFyf")).sendKeys("relevantz.com", Keys.ENTER);
	}

	@Test
	public void test2() {

		driver.findElement(By.className("LC20lb")).click();

		driver.findElement(By.className("iubenda-cs-close-btn")).click();

		driver.findElement(By.id("menu-item-6964")).click();

	}

}

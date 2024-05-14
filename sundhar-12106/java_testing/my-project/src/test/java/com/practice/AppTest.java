package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
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
//		driver = new ChromeDriver();
		driver = new EdgeDriver();
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
		driver.findElement(By.className("fjqXsI")).click();
//		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/span[2]/div/div/button")).click();
//		driver.findElement(By.xpath("//*[@id=\"themify_builder_content-5446\"]/div[1]/div/div/div/div/div[1]/div/div[1]/div/div/div/a")).click();
//		driver.findElement(By.className("bsp-slide-button")).click();

	}

}

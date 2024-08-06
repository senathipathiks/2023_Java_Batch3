package com.tms.selenium;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AdminLoginTest {
	private WebDriver driver;
	@SuppressWarnings("unused")
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@BeforeAll
	public void setUp() {
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@AfterAll
	public void tearDown() {
		driver.quit();
	}

	@Test
	@Disabled
	public void adminLogin() {
		driver.get("http://localhost:3000/");
		driver.manage().window().setSize(new Dimension(1311, 728));
		driver.findElement(By.cssSelector(".nav-item:nth-child(2) b")).click();
		{
			WebElement element = driver.findElement(By.linkText("Tourism Management System"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element, 0, 0).perform();
		}
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.cssSelector(".App")).click();
		driver.findElement(By.id(":r3:")).click();
		{
			WebElement element = driver.findElement(By.cssSelector(".MuiButtonBase-root"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		driver.findElement(By.id(":r3:")).sendKeys("Admin@123");
		{
			WebElement element = driver.findElement(By.tagName("body"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element, 0, 0).perform();
		}
		driver.findElement(By.cssSelector(".css-164r41r")).click();
		driver.findElement(By.id(":r3:")).click();
		driver.findElement(By.id(":r3:")).click();
		driver.findElement(By.id(":r3:")).click();
		{
			WebElement element = driver.findElement(By.id(":r3:"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		driver.findElement(By.id(":r3:")).click();
		driver.findElement(By.id(":r3:")).click();
		driver.findElement(By.id(":r3:")).click();
		{
			WebElement element = driver.findElement(By.id(":r3:"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		driver.findElement(By.id(":r3:")).click();
		driver.findElement(By.id(":r3:")).click();
		driver.findElement(By.id(":r3:")).click();
		driver.findElement(By.id(":r3:")).click();
		driver.findElement(By.id(":r3:")).click();
		{
			WebElement element = driver.findElement(By.id(":r3:"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		driver.findElement(By.id(":r3:")).click();
		{
			WebElement element = driver.findElement(By.cssSelector(".MuiButtonBase-root"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		driver.findElement(By.cssSelector(".MuiButtonBase-root")).click();
	}
}

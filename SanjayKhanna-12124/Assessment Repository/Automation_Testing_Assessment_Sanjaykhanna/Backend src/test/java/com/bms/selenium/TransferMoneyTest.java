package com.bms.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TransferMoneyTest {

	private WebDriver driver;

	@Test
	public void testDoTransation1() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://localhost:4040");
		driver.findElement(By.linkText("Transfer Money")).click();
	    driver.findElement(By.id("payeeId")).click();
	    driver.findElement(By.name("TS1")).click();
	    driver.findElement(By.id("amount")).click();
	    {
	      WebElement element = driver.findElement(By.cssSelector(".MuiButton-containedPrimary"));
	      Actions builder = new Actions(driver);
	      builder.moveToElement(element).perform();
	    }
	    driver.findElement(By.id("amount")).sendKeys("2000");
	    driver.findElement(By.cssSelector(".MuiButton-containedPrimary")).click();
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test
	public void testDoTransation2() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://localhost:4040");
		driver.findElement(By.linkText("Transfer Money")).click();
		driver.findElement(By.id("payeeId")).click();
	    driver.findElement(By.name("TS2")).click();
	    driver.findElement(By.id("amount")).click();
	    driver.findElement(By.id("amount")).sendKeys("20000000");
	    driver.findElement(By.cssSelector(".MuiButton-containedPrimary")).click();
		Thread.sleep(3000);
		driver.close();
	}
	
	
	@Test
	public void testDoTransation3() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://localhost:4040");
		driver.findElement(By.linkText("Transfer Money")).click();
		driver.findElement(By.id("payeeId")).click();
	    driver.findElement(By.name("TS1")).click();
	    driver.findElement(By.id("amount")).click();
	    driver.findElement(By.id("amount")).sendKeys("2000111");
	    driver.findElement(By.cssSelector(".MuiButton-containedPrimary")).click();
		Thread.sleep(3000);
		driver.close();
	}
	
	
}

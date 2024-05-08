package com.bms.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditPayeeTest {

	private WebDriver driver;

	@Test
	public void testEditPayee1() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://localhost:4040");
		driver.findElement(By.name("edit1")).click();
		driver.findElement(By.name("payeeName")).clear();
		driver.findElement(By.name("payeeName")).sendKeys("Test006");
		driver.findElement(By.name("nickName")).clear();
		driver.findElement(By.name("nickName")).sendKeys("TS6");
		driver.findElement(By.name("editBtn")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void testEditPayee2() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://localhost:4040");
		driver.findElement(By.name("edit2")).click();
		driver.findElement(By.name("payeeName")).clear();
		driver.findElement(By.name("payeeName")).sendKeys("Test005");
		driver.findElement(By.name("nickName")).clear();
		driver.findElement(By.name("nickName")).sendKeys("TS5");
		driver.findElement(By.name("editBtn")).click();
		Thread.sleep(2000);
		driver.close();
	}

	@Test
	public void testEditPayee3() throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("http://localhost:4040");
		driver.findElement(By.name("edit2")).click();
		driver.findElement(By.name("payeeName")).clear();
		driver.findElement(By.name("payeeName")).sendKeys("Test004");
		driver.findElement(By.name("nickName")).clear();
		driver.findElement(By.name("nickName")).sendKeys("TS5");
		driver.findElement(By.name("cancelBtn")).click();
		Thread.sleep(2000);
		driver.close();
	}

}

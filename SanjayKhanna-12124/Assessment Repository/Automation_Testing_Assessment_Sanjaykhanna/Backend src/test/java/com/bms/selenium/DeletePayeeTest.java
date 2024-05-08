package com.bms.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeletePayeeTest {
	
	private WebDriver driver;

	@Test
	public void testDeletePayee1() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://localhost:4040");
		driver.findElement(By.name("delete1")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("confirmBtn")).click();
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	public void testDeletePayee2() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://localhost:4040");
		driver.findElement(By.name("delete2")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("cancelBtn")).click();
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	public void testDeletePayee3() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("http://localhost:4040");
		driver.findElement(By.name("delete2")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("confirmBtn")).click();
		Thread.sleep(2000);
		driver.close();
	}

}

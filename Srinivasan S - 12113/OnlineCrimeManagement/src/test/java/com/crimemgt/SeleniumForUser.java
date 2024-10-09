package com.crimemgt;

import java.net.ConnectException;
import java.net.SocketException;

import org.eclipse.angus.mail.util.SocketConnectException;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumForUser {

	WebDriver driver = new ChromeDriver();

	@Test
	@Order(1)
	void login() {
		driver.get("http://localhost:3000/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".log-in")).click();
		driver.findElement(By.name("ulogin")).click();
		driver.findElement(By.id("userName")).click();
		driver.findElement(By.id("userName")).sendKeys("Prashanth");
		driver.findElement(By.id("userPassword")).click();
		{
			WebElement element = driver.findElement(By.cssSelector(".MuiButtonBase-root"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		driver.findElement(By.id("userPassword")).sendKeys("1234");
		driver.findElement(By.cssSelector(".MuiButtonBase-root")).click();
		driver.close();
	}

	@Test
	@Order(2)
	void personalInfo() {
		driver.get("http://localhost:3000/userHome");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".log-in")).click();
		driver.findElement(By.name("personal")).click();
		driver.findElement(By.id("view")).click();
		driver.findElement(By.id("close")).click();
		driver.findElement(By.id("uback")).click();
		driver.close();

	}

	@Test
	@Order(3)
	void stationInfo() {
		driver.get("http://localhost:3000/userHome");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".log-in")).click();
		driver.findElement(By.name("station")).click();
		driver.findElement(By.id("uback")).click();
		driver.close();

	}

	@Test
	@Order(3)
	void complaintInfo() {
		driver.get("http://localhost:3000/userHome");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".log-in")).click();
		driver.findElement(By.name("comp")).click();
		driver.findElement(By.id("uback")).click();
		driver.close();

	}

	@Test
	@Order(4)
	void regComplaint() {
		driver.get("http://localhost:3000/userHome");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("b:nth-child(1)")).click();
		driver.findElement(By.name("complaintType")).click();
		driver.findElement(By.id("description")).click();
		driver.findElement(By.id("description")).sendKeys("I have missed my certificates in bus");
		driver.findElement(By.id("incidentTime")).click();
		driver.findElement(By.id("incidentTime")).sendKeys("2024-06-02T19:58");
		driver.findElement(By.cssSelector(".MuiGrid-root:nth-child(7)")).click();
		driver.findElement(By.name("priority")).click();
		driver.findElement(By.cssSelector("body")).click();
//	    driver.findElement(By.id("demo-sample")).click();
		driver.findElement(By.cssSelector(".MuiButton-contained")).click();
		driver.close();
	}

	@Test
	@Order(5)
	void logout() {
		driver.get("http://localhost:3000/userHome");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".log-in")).click();
		driver.findElement(By.name("logout")).click();
		driver.findElement(By.id("dback")).click();

		driver.close();

	}

}

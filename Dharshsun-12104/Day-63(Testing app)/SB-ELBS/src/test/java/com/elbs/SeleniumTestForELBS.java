package com.elbs;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SeleniumTestForELBS {

	WebDriver driver = new ChromeDriver();

//	@Test
//	void insertTariffTest1() {
//		driver.get("http://localhost:3000/");
//		driver.manage().window().setSize(new Dimension(1382, 744));
//		driver.findElement(By.linkText("Tariff")).click();
//		driver.findElement(By.linkText("Add Tariff")).click();
//		WebElement element1 = driver.findElement(By.name("tariffCategory"));
//		element1.sendKeys("central-reserved");
//		WebElement element2 = driver.findElement(By.name("tariffAmount"));
//		element2.sendKeys("16");
//		WebElement element3 = driver.findElement(By.name("tariffStatus"));
//		element3.sendKeys("live");
//		driver.findElement(By.name("Insert")).click();
//		driver.switchTo().alert().accept();
//
//	}
//	
//	@Test
//	public void removeTariff() {
//		driver.get("http://localhost:3000/");
//		driver.manage().window().setSize(new Dimension(1382, 744));
//		driver.findElement(By.linkText("Tariff")).click();
//		driver.findElement(By.cssSelector("tr:nth-child(6) > .d-flex > .btn")).click();
//		assertThat(driver.switchTo().alert().getText(), is("  Are you sure?"));
//		driver.switchTo().alert().accept();
//	}
//	
//	 @Test
//	  public void tariffupdate() {
//	    driver.get("http://localhost:3000/");
//	    driver.manage().window().setSize(new Dimension(1382, 744));
//	    driver.findElement(By.linkText("Tariff")).click();
//	    driver.findElement(By.cssSelector("tr:nth-child(3) a > .btn")).click();
//	    driver.findElement(By.id("colFormLabelSm")).click();
//	    driver.findElement(By.id("colFormLabelSm")).sendKeys("state-subsidy");
//	    driver.findElement(By.id("colFormLabel")).click();
//	    driver.findElement(By.id("colFormLabelSm")).click();
//	    driver.findElement(By.id("colFormLabelSm")).sendKeys("farmer");
//	    driver.findElement(By.id("colFormLabel")).click();
//	    driver.findElement(By.id("colFormLabel")).sendKeys("0");
//	    driver.findElement(By.name("tariffStatus")).click();
//	    driver.findElement(By.name("tariffStatus")).sendKeys("updated");
//	    driver.findElement(By.cssSelector(".btn-primary")).click();
//	    assertThat(driver.switchTo().alert().getText(), is("Data updated successfully"));
//	  }
	
	

	@Test
	void testBillInsert() {
		driver.get("http://localhost:3000/");
		driver.manage().window().setSize(new Dimension(1388,744));
		driver.findElement(By.linkText("Bill")).click();
		driver.findElement(By.linkText("Add Bill")).click();
		WebElement unitAmount = driver.findElement(By.name("unitAmount"));
		unitAmount.sendKeys("18");
		WebElement billAmount = driver.findElement(By.name("billAmount"));
		billAmount.sendKeys("2000");
		WebElement billPaidStatus = driver.findElement(By.name("billPaidStatus"));
		billPaidStatus.sendKeys("paid");
		driver.findElement(By.name("Insert")).click();
	}
//
//	@Test
//	public void removebill() {
//		driver.get("http://localhost:3000/");
//		driver.manage().window().setSize(new Dimension(1382, 744));
//		driver.findElement(By.linkText("Bill")).click();
//		driver.findElement(By.cssSelector("tr:nth-child(3) .btn")).click();
//		assertThat(driver.switchTo().alert().getText(), is("  Are you sure?"));
//		driver.switchTo().alert().accept();
//	}
//
//	@Test
//	void testUserInsert() {
//		driver.get("http://localhost:3000/");
//		driver.manage().window().setSize(new Dimension(1382, 744));
//		driver.findElement(By.linkText("User")).click();
//		driver.findElement(By.linkText("Add User")).click();
//		WebElement element1 = driver.findElement(By.name("userName"));
//		element1.sendKeys("Sivaraj");
//		WebElement element2 = driver.findElement(By.name("userLocation"));
//		element2.sendKeys("Sivakasi");
//		WebElement element3 = driver.findElement(By.name("userSubsidies"));
//		element3.sendKeys("crackerfactory");
//		WebElement element4 = driver.findElement(By.name("billId"));
//		element4.sendKeys("9");
//		WebElement element5 = driver.findElement(By.name("tariffId"));
//		element5.sendKeys("33");
//		driver.findElement(By.name("Insert")).click();
//		driver.switchTo().alert().accept();
//		
//	}
//
//	@Test
//	public void deleteUser() throws InterruptedException {
//
//	    driver.get("http://localhost:3000/");
//	    driver.manage().window().setSize(new Dimension(1382, 744));
//	    driver.findElement(By.cssSelector("tr:nth-child(4) #remove")).click();
//	    assertThat(driver.switchTo().alert().getText(), is("Are you sure?"));
//        Thread.sleep(6000);
//		Alert acceptAlert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		acceptAlert.accept();
//
//	}
//
//	@Test
//	  public void updateusertest() {
//	    driver.get("http://localhost:3000/");
//	    driver.manage().window().setSize(new Dimension(1382, 744));
//	    driver.findElement(By.cssSelector("tr:nth-child(4) a > .btn")).click();
//	    driver.findElement(By.id("colFormLabelSm")).click();
//	    driver.findElement(By.id("colFormLabelSm")).sendKeys("Deepa");
//	    driver.findElement(By.id("colFormLabel")).click();
//	    driver.findElement(By.id("colFormLabel")).sendKeys("Cuddalore");
//	    driver.findElement(By.name("userSubsidies")).click();
//	    driver.findElement(By.name("userSubsidies")).sendKeys("private-startup");
//	    driver.findElement(By.name("billId")).click();
//	    driver.findElement(By.name("billId")).sendKeys("10");
//	    driver.findElement(By.name("tariffId")).click();
//	    driver.findElement(By.name("tariffId")).sendKeys("28");
//	    driver.findElement(By.cssSelector(".btn-primary")).click();
//	    assertThat(driver.switchTo().alert().getText(), is("Data updated successfully"));
//	    driver.switchTo().alert().accept();
//	  }

}

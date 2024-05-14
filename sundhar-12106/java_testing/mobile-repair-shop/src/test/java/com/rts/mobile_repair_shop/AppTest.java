package com.rts.mobile_repair_shop;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AppTest 
{
	private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  @Before
	  public void setUp() {
	    driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }
//	  @After
//	  public void tearDown() {
//	    driver.close();
//	  }
	  
	  
	  @Test
	  public void saveAppointment() throws InterruptedException {
	    driver.get("http://localhost:3000/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.id("book-btn1")).click();
	    Thread.sleep(2000);
	    
	    
	    driver.findElement(By.id("phoneModel")).sendKeys("Vivo");
	    
	    driver.findElement(By.id("repairDescription")).sendKeys("Display Broken due to Wierd usage");
	    
	    driver.findElement(By.id("appoint-btn")).click();
	    

		Thread.sleep(6000);
		Alert abc=driver.switchTo().alert();
		
		abc.accept();
	    
	    
	  //giving both wrong description
//		  driver.findElement(By.id("phoneModel")).click();
//		    driver.findElement(By.id("phoneModel")).sendKeys("vivo");
//		    driver.findElement(By.id("repairDescription")).click();
//		    driver.findElement(By.id("repairDescription")).sendKeys("Screen damage ");
//		    driver.findElement(By.cssSelector(".btn")).click();
//		    assertThat(driver.switchTo().alert().getText(), is("please fill the accepted characters in pModel vivo"));
	    
//	    driver.findElement(By.id("repairDescription")).click();
//	    driver.findElement(By.id("repairDescription")).sendKeys("Screen damage due to accident");
//	    driver.findElement(By.cssSelector(".btn")).click();
	    
//	    driver.findElement(By.id("repairDescription")).click();
//	    driver.findElement(By.id("phoneModel")).click();
//	    driver.findElement(By.id("phoneModel")).sendKeys("vivo v23");
//	    driver.findElement(By.id("repairDescription")).sendKeys("Screen damage due to accident");
//	    driver.findElement(By.id("appoint-btn")).click();
//	    assertThat(driver.getCurrentUrl(), is("http://localhost:3000/"));
	  }
	  
//	  void wrongScenario1() {
//		//giving both wrong description
//		  driver.findElement(By.id("phoneModel")).click();
//		    driver.findElement(By.id("phoneModel")).sendKeys("vivo");
//		    driver.findElement(By.id("repairDescription")).click();
//		    driver.findElement(By.id("repairDescription")).sendKeys("Screen damage ");
//		    driver.findElement(By.cssSelector(".btn")).click();
//		    assertThat(driver.switchTo().alert().getText(), is("please fill the accepted characters in pModel vivo"));
//	}
//	  
//	  void wrongScenario2() {
//		  //giving correct mobile model but wrong description
//		  driver.findElement(By.id("repairDescription")).click();
//		    driver.findElement(By.id("phoneModel")).click();
//		    driver.findElement(By.id("phoneModel")).sendKeys("vivo v23");
//		    driver.findElement(By.cssSelector(".btn")).click();
//		    driver.findElement(By.id("repairDescription")).sendKeys("Screen damage due to accident");
//		    assertThat(driver.switchTo().alert().getText(), is("please fill the accepted characters in pDesc Screen damage "));
//	}
//	  
//	  void correctScenario() {
//		
//	}
}

package apple.apple_app;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass_Framework {

	public static WebDriver driver;
	public FileInputStream fis;
	public Properties p;

	/**
	 * Open the Browser
	 * @throws IOException
	 */
	@BeforeMethod
	public void OpenBrowser() throws IOException {
		Reporter.log("open the browser", true);
		fis = new FileInputStream("./Date/AppleStore.txt");
		p = new Properties();
		p.load(fis);
		String Link = p.getProperty("URL");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Link);
	}

	/**
	 * Close the Browser
	 * @throws InterruptedException
	 */
	@AfterMethod
	public void CloseBrowser() throws InterruptedException {
		Reporter.log("close the browser", true);
		driver.close();
	}

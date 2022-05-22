import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() {

		setupDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

	}

	@BeforeMethod
	public void beforeMethod() {

	}

	@AfterMethod
	public void afterMethod() {

	}

	@AfterTest
	public void afterTest() {
		driver.quit();

	}

	void setupDriver() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + File.separator + "driver" + File.separator + "chromedriver_101.exe");
		driver = new ChromeDriver();

	}
}

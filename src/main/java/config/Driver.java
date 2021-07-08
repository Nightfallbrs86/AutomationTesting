package config;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

	private static WebDriver driver;

	public static WebDriver getDriver() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.manage().window().setSize(new Dimension(1200, 765));
		return driver;
	}

	public static void finish() {
		if (driver != null){
			driver.quit();
			driver = null;
		}
		
	}

}

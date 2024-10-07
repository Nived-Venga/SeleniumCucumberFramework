package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;

	public static WebDriver WebDriverManager() {

		driver = new ChromeDriver();
		return driver;

	}
}

package assignment.automation.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtil {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	static void setDriver(WebDriver driver) {
		DriverUtil.driver.set(driver);
	}

	public static WebDriver getWebDriver() {
		return driver.get();
	}

	public static String getScreenshot() {
		String name = getScreenshotName();
		name = name + ".png";
		File scrFile = ((TakesScreenshot) driver.get()).getScreenshotAs(OutputType.FILE);
		System.out.println("====>" + scrFile);

		try {
			File f = new File("Report\\" + name);
			System.err.println(f);
			FileUtils.copyFile(scrFile, f);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return name;
	}

	public static String getScreenshotName() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Calendar cal = Calendar.getInstance();
		return (dateFormat.format(cal.getTime()).toString());
	}

	public static void initDriver() {
		PropertyUtil propertyUtil = new PropertyUtil();
		String browser = propertyUtil.getProperty("selenium.browser");

		if (browser.equalsIgnoreCase("firefox")) {
			setDriver(new FirefoxDriver());
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
			setDriver(new ChromeDriver());
		} else {
			// Default browser is firefox
			setDriver(new FirefoxDriver());
		}
	}

	public static boolean isPresent(By by) {
		try {
			WebDriverWait wait = new WebDriverWait(getWebDriver(), 20000);
			wait.until(ExpectedConditions.presenceOfElementLocated(by));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static void quit() {
		driver.get().quit();
	}
}

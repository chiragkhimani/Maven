package automation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stpes {

	static WebDriver driver;

	private static ThreadLocal<Scenario> scenario = new ThreadLocal<Scenario>();

	public static Scenario getScenario() {
		return scenario.get();
	}

	public WebDriver getWebDriver() {
		return driver;
	}

	static void setScenario(Scenario s) {
		scenario.set(s);
	}

	@Before
	public void setUP(Scenario scenario) {
		System.out.println("Before");
		System.setProperty("webdriver.chrome.driver", "D:\\git\\Maven\\Maven\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		setScenario(scenario);

	}

	@Test
	public void testMtho() throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		Thread.sleep(3000);
		driver.findElement(By.id("button1")).click();
		Thread.sleep(3000);

		// Perform the click operation that opens new window

		// Switch to new window opened
		Set<String> windows = driver.getWindowHandles();
		for (String winHandle : windows) {
			System.out.println("Wondow Handle: " + driver.getCurrentUrl());
			driver.switchTo().window(winHandle);
			System.out.println(winHandle);
		}

	}

	@Given("^I have a calculator$")
	public void i_have_a_calculartor() {
		driver.get("http://www.google.com/");
		VerificationUtil.verifyTrue(true, "Condition Passed", "");
		VerificationUtil.verifyTrue(false, "Condition Passed", "Condition Failed");
	}

	@Test
	public void test() {
		System.out.println("Out");

	}

	@When("^I add (\\d+) and (\\d+)$")
	public void i_add_and(int arg1, int arg2) {
	}

	@Then("^the result should be (\\d+)$")
	public void the_result_should_be(int arg1) {
	}

	@After
	public void quite() {
		driver.quit();
	}

	public static String getScreenshot() {
		String name = getScreenshotName();
		name = name + ".png";
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
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
}

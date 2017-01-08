package automation;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
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
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Khichu\\git\\Maven\\Maven\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		setScenario(scenario);
	}

	@Given("^I have a calculator$")
	public void i_have_a_calculartor() {
		VerificationUtil util = new VerificationUtil();
		util.verifyTrue(true, "Condition Passed", "");
		util.verifyTrue(false, "Condition Passed", "Condition Failed");
		org.junit.Assert.assertTrue(false);
	}

	@When("^I add (\\d+) and (\\d+)$")
	public void i_add_and(int arg1, int arg2) {
	}

	@Then("^the result should be (\\d+)$")
	public void the_result_should_be(int arg1) {
	}

	@After
	public void quit() {

	}

	public String getScreenshot() {
		String name = getScreenshotName();
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("..\\Report\\" + name));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return name;
	}

	public String getScreenshotName() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		Calendar cal = Calendar.getInstance();
		return (dateFormat.format(cal.getTime()).toString());
	}
}

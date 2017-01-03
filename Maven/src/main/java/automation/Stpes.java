package automation;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stpes {

	WebDriver driver;

	private static ThreadLocal<Scenario> scenario = new ThreadLocal<Scenario>();

	public static Scenario getScenario() {
		return scenario.get();
	}

	static void setScenario(Scenario driver) {
		scenario.set(driver);
	}

	@Before
	public void setUP(Scenario scenario) {
		// System.out.println("Before");
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\git\\Maven\\Maven\\driver\\chromedriver.exe");
		// driver = new ChromeDriver();
		setScenario(scenario);
	}

	@Given("^I have a calculator$")
	public void i_have_a_calculartor() {
		VerificationUtil util = new VerificationUtil();
		util.verifyTrue(true, "Condition Passed", "");
		util.verifyTrue(false, "Condition Passed", "Condition Faile");
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

	public void getScreenshot() {
		String name;
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("..\\Report\\"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// DateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// Date date = new Date();
		// System.out.println(new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));
	}
}

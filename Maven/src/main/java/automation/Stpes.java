package automation;

import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stpes {

	static Scenario scenario;
	WebDriver driver;

	public Scenario getScenario() {
		return scenario;
	}

	@Before
	public void setUP(Scenario scenario) {
		// System.out.println("Before");
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\git\\Maven\\Maven\\driver\\chromedriver.exe");
		// driver = new ChromeDriver();
		this.scenario = scenario;
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
}

package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stpes {

	@Before
	public void setUP() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\khimanic\\workspace\\Maven\\MavenDemo\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.quit();
	}

	@Given("^I have a calculator$")
	public void i_have_a_calculator() {

	}

	@When("^I add (\\d+) and (\\d+)$")
	public void i_add_and(int arg1, int arg2) {
	}

	@Then("^the result should be (\\d+)$")
	public void the_result_should_be(int arg1) {
	}
}

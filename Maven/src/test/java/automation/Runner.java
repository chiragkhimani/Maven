package automation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, format = { "pretty", "html:target/cucumber-reports",
		"json:target/cucumber.json" }, glue = "automation", features = "D:\\git\\Maven\\Maven\\src\\test\\resources\\feature\\Demo.feature")
public class Runner {
}

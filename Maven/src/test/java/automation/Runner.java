package automation;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, format = { "pretty",
		"html:target/cucumber" }, glue = "automation", features = "D:\\Maven\\Maven\\src\\test\\resources\\feature\\Demo.feature")
public class Runner {
}

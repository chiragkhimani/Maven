package automation;

import org.openqa.selenium.WebElement;

public class VerificationUtil implements AssertProperties {
	Stpes s = new Stpes();

	public void verifyTrue(boolean condition, String passMsg, String failMsg) {
		if (condition) {
			Stpes.getScenario().write(String.format(verifyTruePass, passMsg));
		} else {
			Stpes.getScenario().write(String.format(verifyTrueFail, failMsg, s.getScreenshot()));
		}
	}

	public void verifyPresent(WebElement ele, String label) {

	}

	public void verifyVisible(WebElement ele, String label) {
		if (ele.isDisplayed()) {
			Stpes.getScenario().write(String.format(verifyVisiblePass, label));
		} else {
			Stpes.getScenario().write(String.format(verifyVisibleFail, label));
		}
	}

	public void verifyText(WebElement ele, String expectedText, String label) {
		if (ele.getText().equalsIgnoreCase(expectedText)) {
			Stpes.getScenario().write(String.format(verifyTextPass, label, expectedText, label, ele.getText()));
		} else {
			Stpes.getScenario().write(String.format(verifyTextFail, label, expectedText, label, ele.getText()));
		}
	}

	public void verifyTextContains(WebElement ele, String expectedText, String label) {
		if (ele.getText().contains(expectedText)) {
			Stpes.getScenario().write(String.format(verifyTextContainsPass, label, expectedText, label, ele.getText()));
		} else {
			Stpes.getScenario().write(String.format(verifyTextContainsFail, label, expectedText, label, ele.getText()));
		}
	}

}

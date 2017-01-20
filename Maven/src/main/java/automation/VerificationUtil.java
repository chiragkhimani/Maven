package automation;

import org.openqa.selenium.WebElement;
import org.testng.TestNG;
import org.testng.asserts.SoftAssert;

public class VerificationUtil implements AssertProperties {
	public static final SoftAssert softly = new SoftAssert();

	public static SoftAssert getAssert() {
		return softly;
	}

	public static void verifyTrue(boolean condition, String passMsg, String failMsg) {
		TestNG test = new TestNG();
		test.setVerbose(0);
		if (condition) {
			Stpes.getScenario().write(String.format(verifyTruePass, passMsg));
		} else {
			Stpes.getScenario().write(String.format(verifyTrueFail, failMsg, Stpes.getScreenshot()));
			System.setProperty("IS_FAILED", "true");
		}
	}

	public static void verifyPresent(WebElement ele, String label) {

	}

	public static void verifyVisible(WebElement ele, String label) {
		if (ele.isDisplayed()) {
			Stpes.getScenario().write(String.format(verifyVisiblePass, label));
		} else {
			Stpes.getScenario().write(String.format(verifyVisibleFail, label));
		}
	}

	public static void verifyText(WebElement ele, String expectedText, String label) {
		if (ele.getText().equalsIgnoreCase(expectedText)) {
			Stpes.getScenario().write(String.format(verifyTextPass, label, expectedText, label, ele.getText()));
		} else {
			Stpes.getScenario().write(String.format(verifyTextFail, label, expectedText, label, ele.getText()));
		}
	}

	public static void verifyTextContains(WebElement ele, String expectedText, String label) {
		if (ele.getText().contains(expectedText)) {
			Stpes.getScenario().write(String.format(verifyTextContainsPass, label, expectedText, label, ele.getText()));
		} else {
			Stpes.getScenario().write(String.format(verifyTextContainsFail, label, expectedText, label, ele.getText()));
		}
	}

	public static void close() {
	}

}

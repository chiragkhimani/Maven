package automation;

public class VerificationUtil implements AssertProperties {

	public void verifyTrue(boolean condition, String passMsg, String failMsg) {
		if (condition) {
			System.err.println("Condition Passed" + new Stpes().getScenario().getName());
			new Stpes().getScenario().write(String.format(verifyTruePass, passMsg));
		} else {
			System.err.println("Condition Failed" + new Stpes().getScenario());
			new Stpes().getScenario().write(String.format(verifyTrueFail, failMsg));
		}
	}

	// public void verifyPresent(WebElement ele, String label) {
	//
	// }
	//
	// public void verifyVisible(WebElement ele, String label) {
	// if (ele.isDisplayed()) {
	// scenario.write(String.format(verifyVisiblePass, label));
	// } else {
	// scenario.write(String.format(verifyVisibleFail, label));
	// }
	// }
	//
	// public void verifyText(WebElement ele, String expectedText, String label)
	// {
	// if (ele.getText().equalsIgnoreCase(expectedText)) {
	// scenario.write(String.format(verifyTextPass, label, expectedText, label,
	// ele.getText()));
	// } else {
	// scenario.write(String.format(verifyTextFail, label, expectedText, label,
	// ele.getText()));
	// }
	// }
	//
	// public void verifyTextContains(WebElement ele, String expectedText,
	// String label) {
	// if (ele.getText().contains(expectedText)) {
	// scenario.write(String.format(verifyTextContainsPass, label, expectedText,
	// label, ele.getText()));
	// } else {
	// scenario.write(String.format(verifyTextContainsFail, label, expectedText,
	// label, ele.getText()));
	// }
	// }

}

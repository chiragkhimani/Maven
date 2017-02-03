package assignment.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import assignment.automation.locator.LoginScreenLoc;
import assignment.automation.utils.DriverUtil;
import assignment.automation.utils.VerificationUtil;

public class LoginScreen extends LoginScreenLoc {
	WebDriver driver;

	public LoginScreen() {
		driver = DriverUtil.getWebDriver();
		PageFactory.initElements(driver, this);
	}

	public void verifyLoginScreen() {
		VerificationUtil.verifyVisible(getUserName(), "Login Username");
		VerificationUtil.verifyVisible(getPassword(), "Login Password");
		VerificationUtil.verifyVisible(getSignInBtn(), "Sign in button");
	}

	public void clickOnProceedToChkout() {
		getContAsGuestBtn().click();
	}

}

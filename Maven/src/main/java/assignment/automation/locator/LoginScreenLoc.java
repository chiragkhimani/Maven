package assignment.automation.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginScreenLoc {
	@FindBy(css = "#sgnBt")
	private WebElement signInBtn;

	@FindBy(css = "#gtChk")
	private WebElement contAsGuestBtn;

	@FindBy(xpath = "//input[@class='fld' and @type='password']")
	private WebElement password;

	@FindBy(xpath = "//div[@id='formDiv']//input[@class=\"fld\" and contains(@placeholder,'username')]")
	private WebElement userName;

	public WebElement getSignInBtn() {
		return signInBtn;
	}

	public WebElement getContAsGuestBtn() {
		return contAsGuestBtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getUserName() {
		return userName;
	}
	
	

}

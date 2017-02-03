package assignment.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import assignment.automation.locator.CheckoutPageLoc;
import assignment.automation.utils.DriverUtil;

public class CheckoutPage extends CheckoutPageLoc {
	WebDriver driver;

	public CheckoutPage() {
		driver = DriverUtil.getWebDriver();
		PageFactory.initElements(driver, this);
	}

	public void verifyItemInfo() {

	}
}

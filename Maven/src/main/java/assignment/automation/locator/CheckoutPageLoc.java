package assignment.automation.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CheckoutPageLoc {

	@FindBy(xpath = "//div[contains(@class,'item-title')]")
	private WebDriver itemName;

	@FindBy(xpath = "//div[contains(@class,'item-price')]/span")
	private WebDriver itemPrice;

	@FindBy(xpath = "//tr[@data-type=\"TOTAL\"]//span")
	private WebDriver totalPrice;

	public WebDriver getItemName() {
		return itemName;
	}

	public WebDriver getItemPrice() {
		return itemPrice;
	}

	public WebDriver getTotalPrice() {
		return totalPrice;
	}

}

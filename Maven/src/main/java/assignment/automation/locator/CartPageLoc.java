package assignment.automation.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPageLoc {

	@FindBy(xpath = "//div[@id='ShopCart']//table[@class=\"ItemInfoTable\"]/../..//a")
	private WebElement itemName;

	@FindBy(css = ".mbg-id")
	private WebElement sellerName;

	@FindBy(xpath = "//div[contains(@class,'itemInfoColcart')]//div[@class=\"fw-b\"]")
	private WebElement itemPrice;

	@FindBy(css = "#ptcBtnRight")
	private WebElement proceedToCheckOutBtn;

	@FindBy(css = "#asyncTotal")
	private WebElement totalPrice;

	public WebElement getItemName() {
		return itemName;
	}

	public WebElement getSellerName() {
		return sellerName;
	}

	public WebElement getItemPrice() {
		return itemPrice;
	}

	public WebElement getProceedToCheckOutBtn() {
		return proceedToCheckOutBtn;
	}

	public WebElement getTotalPrice() {
		return totalPrice;
	}

}

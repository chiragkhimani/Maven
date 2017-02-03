package assignment.automation.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailPageLoc {

	@FindBy(css = "#isCartBtn_btn")
	private WebElement addToCartBtn;

	@FindBy(css = "#vi-itm-cond")
	private WebElement itemCondition;

	@FindBy(css = "#itemTitle")
	private WebElement itemName;

	@FindBy(css = ".mbg-nw")
	private WebElement sellerName;

	@FindBy(css = "#prcIsum")
	private WebElement itemPrice;

	@FindBy(css = "#addNoThx")
	private WebElement noThanksBtn;

	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}

	public WebElement getItemCondition() {
		return itemCondition;
	}

	public WebElement getItemName() {
		return itemName;
	}

	public WebElement getSellerName() {
		return sellerName;
	}

	public WebElement getItemPrice() {
		return itemPrice;
	}

	public WebElement getNoThanksBtn() {
		return noThanksBtn;
	}

}

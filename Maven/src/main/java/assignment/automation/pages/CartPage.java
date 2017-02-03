package assignment.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.googlecode.totallylazy.numbers.Product;

import assignment.automation.locator.CartPageLoc;
import assignment.automation.utils.DriverUtil;
import assignment.automation.utils.VerificationUtil;

public class CartPage extends CartPageLoc {
	WebDriver driver;

	public CartPage() {
		driver = DriverUtil.getWebDriver();
		PageFactory.initElements(driver, this);
	}

	public void verifyCartPage() {
		VerificationUtil.verifyVisible(getProceedToCheckOutBtn(), "Add To cart button");
		VerificationUtil.verifyVisible(getItemPrice(), "Item price");
		VerificationUtil.verifyVisible(getItemName(), "Item Name");
	}

	public void verifyItemInfoOnCart() {
		String itemNameOnCart = ProductDetailPage.item.getItemName();
		String itemPrice = ProductDetailPage.item.getItemPrice();
		String itemSellerName = ProductDetailPage.item.getSellerName();
		VerificationUtil.verifyText(getItemName(), itemNameOnCart, "Item name on cart");
		VerificationUtil.verifyText(getItemPrice(), itemPrice, "Item price on cart");
		VerificationUtil.verifyText(getSellerName(), itemSellerName, "Item seller name on cart");
	}

	public void clickOnCheckOut() {
		VerificationUtil.verifyVisible(getProceedToCheckOutBtn(), "Proceed to checkout button");
		getProceedToCheckOutBtn().click();
	}
}

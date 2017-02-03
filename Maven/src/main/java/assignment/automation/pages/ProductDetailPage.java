package assignment.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import assignment.automation.locator.ProductDetailPageLoc;
import assignment.automation.utils.DriverUtil;
import assignment.automation.utils.ItemComponenant;
import assignment.automation.utils.VerificationUtil;

public class ProductDetailPage extends ProductDetailPageLoc {
	WebDriver driver;
	ItemComponenant itemComp = new ItemComponenant();
	static ItemComponenant item = new ItemComponenant();

	public ProductDetailPage() {
		driver = DriverUtil.getWebDriver();
		PageFactory.initElements(driver, this);
	}

	public void verifyItemOnPDPPage() {
		item.setItemName(getItemName().getText());
		System.out.println(getItemName().getText());
		item.setItemPrice(getItemPrice().getText());
		System.out.println(getItemPrice().getText());
		item.setSellerName(getSellerName().getText());
		System.out.println(getSellerName().getText());
	}

	public void addToCartBtn() {
		getAddToCartBtn().click();
		if (DriverUtil.isPresent(By.cssSelector("#addNoThx"))) {
			getNoThanksBtn().click();
		}
	}

	public void verifyProductDetailPage() {
		VerificationUtil.verifyVisible(getAddToCartBtn(), "Add To cart button");
		VerificationUtil.verifyVisible(getItemPrice(), "Item price");
		VerificationUtil.verifyVisible(getItemName(), "Item Name");
	}

}

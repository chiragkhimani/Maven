package assignment.automation.pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import assignment.automation.locator.ItemListingPageLoc;
import assignment.automation.utils.DriverUtil;
import assignment.automation.utils.VerificationUtil;

public class ItemListingPage extends ItemListingPageLoc {
	WebDriver driver;

	public ItemListingPage() {
		driver = DriverUtil.getWebDriver();
		PageFactory.initElements(driver, this);
	}

	public void verifyItemListingPage() {

	}

	public void verifyItemContainsKeyword() {

		String keyword1 = "TV";
		String keyword2 = "Sony";
		int i = 0;
		for (WebElement itemLink : itemLinks) {
			String itemText = itemLink.getText();
			VerificationUtil.verifyTrue(
					itemText.toLowerCase().contains(keyword2.toLowerCase())
							|| itemText.toLowerCase().contains(keyword1.toLowerCase()),
					"Item name " + itemLink.getText() + " contains word TV or Sony",
					"Item name " + itemLink.getText() + " NOT contains word TV or Sony");
			if (i == 5)
				break;
			i++;
		}
	}

	public void selectRandomProduct() {
		Random r = new Random();
		int index = r.nextInt(itemLinks.size() - 1);
		itemLinks.get(index).click();
	}

}

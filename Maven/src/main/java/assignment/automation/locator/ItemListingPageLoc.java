package assignment.automation.locator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemListingPageLoc {

	@FindBy(css = ".vip")
	public List<WebElement> itemLinks;

	@FindBy(xpath = "//a[@class='guidance-text-module__list-item__text-wrapper']/div[text()='50\" - 60\"']")
	public WebElement screenSize;

	public List<WebElement> getItemLinks() {
		return itemLinks;
	}

	public WebElement getScreenSize() {
		return screenSize;
	}

}

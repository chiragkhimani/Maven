package assignment.automation.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLoc {
	@FindBy(css = "#gh-ac")
	public WebElement searchBox;

	@FindBy(css = "#gh-btn")
	public WebElement searchBtn;

	public WebElement getSearchBox() {

		return searchBox;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

}

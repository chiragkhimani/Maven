package assignment.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import assignment.automation.locator.HomePageLoc;
import assignment.automation.utils.DriverUtil;
import assignment.automation.utils.PropertyUtil;

public class HomePage extends HomePageLoc {
	WebDriver driver;

	public HomePage() {
		driver = DriverUtil.getWebDriver();
		PageFactory.initElements(driver, this);
	}

	public void openWebSite() {
		PropertyUtil prop = new PropertyUtil();
		driver.get(prop.getProperty("env.baseurl"));
		driver.manage().window().maximize();
	}

	public void searchWithKeyword(String keyword) {
		getSearchBox().sendKeys(keyword);
		getSearchBtn().click();
	}

}

package assignment.automation.steps;

import assignment.automation.pages.CartPage;
import assignment.automation.pages.CheckoutPage;
import assignment.automation.pages.HomePage;
import assignment.automation.pages.ItemListingPage;
import assignment.automation.pages.LoginScreen;
import assignment.automation.pages.ProductDetailPage;
import assignment.automation.utils.DriverUtil;
import assignment.automation.utils.PropertyUtil;
import assignment.automation.utils.ReportUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {

	@Before
	public void setUP(Scenario scenario) {
		setUp(scenario);
	}

	PropertyUtil propUtil = new PropertyUtil();

	@Given("^user is on ebay homepage$")
	public void user_is_on_ebay_homepage() {
		HomePage homepage = new HomePage();
		homepage.openWebSite();

	}

	@Then("^verify item listing page should be displayed$")
	public void verify_item_listing_page_should_be_displayed() {
		ItemListingPage itemListingPage = new ItemListingPage();
		itemListingPage.verifyItemListingPage();
	}

	@Then("^verify all item name contains search keyword$")
	public void verify_all_item_name_contains_search_keyword() {
		ItemListingPage itemListingPage = new ItemListingPage();
		itemListingPage.verifyItemContainsKeyword();
	}

	@When("^user select any product from product listing page$")
	public void user_select_any_product_from_product_listing_page() {
		ItemListingPage itemListingPage = new ItemListingPage();
		itemListingPage.selectRandomProduct();
	}

	@Then("^verify product detail page should be displayed$")
	public void verify_product_detail_page_should_be_displayed() {
		ProductDetailPage pdp = new ProductDetailPage();
		pdp.verifyProductDetailPage();
	}

	@Then("^verify item details on product detail page$")
	public void verify_item_details_on_product_detail_page() {
		ProductDetailPage pdp = new ProductDetailPage();
		pdp.verifyItemOnPDPPage();
	}

	@When("^user click on add to cart button$")
	public void user_click_on_add_to_cart_button() {
		ProductDetailPage pdp = new ProductDetailPage();
		pdp.addToCartBtn();
	}

	@Then("^verify cart page should be displayed$")
	public void verify_cart_page_should_be_displayed() {
		CartPage cartPage = new CartPage();
		cartPage.verifyCartPage();
	}

	@Then("^verify item information on cart page$")
	public void verify_item_information_on_cart_page() {
		CartPage cartPage = new CartPage();
		cartPage.verifyItemInfoOnCart();
	}

	@When("^user click on checkout button$")
	public void user_click_on_checkout_button() {
		CartPage cartPage = new CartPage();
		cartPage.clickOnCheckOut();
	}

	@Then("^verify login screen should be displayed$")
	public void verify_login_screen_should_be_displayed() {
		LoginScreen login = new LoginScreen();
		login.verifyLoginScreen();
	}

	@When("^user click on proceed to checkout as guest$")
	public void user_click_on_proceed_to_checkout_as_guest() {
		LoginScreen login = new LoginScreen();
		login.clickOnProceedToChkout();
	}

	@Then("^verify item information on checkout page$")
	public void verify_item_information_on_checkout_page() {
		CheckoutPage checkOutPage = new CheckoutPage();
		checkOutPage.verifyItemInfo();
	}

	@When("^user search with keyword \"([^\"]*)\"$")
	public void user_search_with_keyword(String keyword) {
		HomePage homepage = new HomePage();
		homepage.searchWithKeyword(keyword);
	}

	private void setUp(Scenario scenario) {
		ReportUtil.setScenario(scenario);
		DriverUtil.initDriver();
	}

	@After
	public void quit() {
		DriverUtil.quit();
	}

}

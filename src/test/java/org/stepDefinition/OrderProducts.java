package org.stepDefinition;

import java.util.List;

import org.baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pages.CartPage;
import org.pages.CheckOutPage;
import org.pages.LoginPage;
import org.pages.ProductPage;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class OrderProducts extends BaseClass {

	@Given("User is on SauceDemo Login Page")
	public void user_is_on_SauceDemo_Login_Page() {
		getDriver();
		launchUrl("https://www.saucedemo.com/");
	}

	@Given("User should enter {string} and {string}")
	public void user_should_enter_and(String userName, String password) {
		LoginPage loginPage = new LoginPage();
		loginPage.login(userName, password);
	}

	@Given("User should add Product to the Cart")
	public void user_should_add_Product_to_the_Cart() {
		ProductPage productPage = new ProductPage();
		productPage.product();
	}

	@Given("User should checkout and enter {string},{string} and {string}")
	public void user_should_checkout_and_enter_and(String firstName, String lastName, String postalCode) {
		CartPage cartPage = new CartPage();
		cartPage.cart();
		CheckOutPage checkOutPage = new CheckOutPage();
		checkOutPage.checkOut(firstName, lastName, postalCode);
	}

	@Then("Validate whether ordered the correct product")
	public void validate_whether_ordered_the_correct_product() {
		WebElement element = driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		String text = element.getText();
		Assert.assertEquals("Sauce Labs Backpack", text);
		System.out.println("Correct Product is ordered");
		driver.quit();

	}

	@Given("Should get all the product list")
	public void should_get_all_the_product_list() {
		ProductPage productPage = new ProductPage();
		List<WebElement> products = productPage.getProducts();
		for (int i = 0; i < products.size(); i++) {
			String text = products.get(i).getText();
			System.out.println(text);
		}
	}

	@Then("Validate whether Sauce Labs Bolt T-Shirt product is available")
	public void validate_whether_Sauce_Labs_Bolt_T_Shirt_product_is_available() {
		ProductPage productPage = new ProductPage();
		List<WebElement> products = productPage.getProducts();
		for (int i = 0; i < products.size(); i++) {
			String text = products.get(i).getText();
			boolean contains = text.contains("Sauce Labs Bolt T-Shirt");
			if (contains == true) {
				System.out.println("Product is Available");
			}
		}
		driver.quit();
	}

	@Given("Getting the price of all Product and removing the dollar symbol")
	public void getting_the_price_of_all_Product_and_removing_the_dollar_symbol() {
		ProductPage productpage = new ProductPage();
		List<WebElement> pPrice = productpage.getProductPrice();
		for (int i = 0; i < pPrice.size(); i++) {
			String price = pPrice.get(i).getText();
			String replaceAll = price.replaceAll("[^0-9.]", "");
			System.out.println(replaceAll);
		}

	}

	@Then("Validate the price with product listing with product individual page")
	public void validate_the_price_with_product_listing_with_product_individual_page() {
		ProductPage productpage = new ProductPage();
		List<WebElement> pPrice = productpage.getProductPrice();
		for (int i = 0; i < pPrice.size(); i++) {
			String price = pPrice.get(i).getText();
			WebElement individualProductPrice = productpage.getIndividualProductPrice();
			String text = individualProductPrice.getText();
			boolean contains = price.contains(text);
			if (contains == true) {
				System.out.println("Price Listed in Individual Product Page");
			}
		}
		driver.quit();
	}

	@Given("User should enter invalid {string} and {string}")
	public void user_should_enter_invalid_and(String userName, String password) {
		LoginPage loginPage = new LoginPage();
		loginPage.login(userName, password);
	}

	@Then("Validate the error message")
	public void validate_the_error_message() {
		LoginPage loginPage = new LoginPage();
		WebElement invalid = loginPage.getInvalid();
		String text = invalid.getText();
		System.out.println(text);
		Assert.assertEquals("Epic sadface: Username and password do not match any user in this service", text);
		System.out.println("Error Message Verified");
		driver.quit();

	}

}

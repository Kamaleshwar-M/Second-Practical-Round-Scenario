package org.pages;

import java.util.List;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BaseClass {

	public ProductPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "add-to-cart-sauce-labs-backpack")
	private WebElement btnAdd;

	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	private WebElement cart;

	@FindBy(xpath = "//div[@class='inventory_item_name']")
	private List<WebElement> products;

	@FindBy(xpath = "//div[@class='inventory_item_price']")
	private List<WebElement> productPrice;

	@FindBy(xpath = "//div[text()='29.99']")
	private WebElement individualProductPrice;

	public WebElement getBtnAdd() {
		return btnAdd;
	}

	public WebElement getCart() {
		return cart;
	}

	public List<WebElement> getProducts() {
		return products;
	}

	public List<WebElement> getProductPrice() {
		return productPrice;
	}

	public WebElement getIndividualProductPrice() {
		return individualProductPrice;
	}

	public void product() {
		buttonClick(getBtnAdd());
		buttonClick(getCart());

	}

}

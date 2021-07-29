package org.pages;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseClass {

	public CartPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "checkout")
	private WebElement btnCheckOut;

	public WebElement getBtnCheckOut() {
		return btnCheckOut;
	}

	public void cart() {
		buttonClick(getBtnCheckOut());
	}
}

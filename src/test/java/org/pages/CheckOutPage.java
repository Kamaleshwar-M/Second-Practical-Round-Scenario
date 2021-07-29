package org.pages;

import org.baseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends BaseClass {
	
	public CheckOutPage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="first-name")
	private WebElement txtFirstName;
	
	@FindBy(id="last-name")
	private WebElement txtLastName;
	
	@FindBy(id="postal-code")
	private WebElement txtPostalCode;
	
	@FindBy(id="continue")
	private WebElement btnContinue;
	
	@FindBy(xpath="//div[@class='inventory_item_name']")
	private WebElement productName;

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtPostalCode() {
		return txtPostalCode;
	}
	
	public WebElement getProductName() {
		return productName;
	}

	public void checkOut(String firstName, String lastName, String postalCode) {
		typeText(getTxtFirstName(), firstName);
		typeText(getTxtLastName(), lastName);
		typeText(getTxtPostalCode(), postalCode);
		buttonClick(getBtnContinue());
	}
	
	
}

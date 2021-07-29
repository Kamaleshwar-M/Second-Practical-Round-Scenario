package org.baseClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void launchUrl(String url) {
		driver.get(url);

	}

	public List<WebElement> findElementByxpathList(String xpath) {
		List<WebElement> findElements = driver.findElements(By.xpath(xpath));
		System.out.println(findElements);
		return findElements;
	}

	public void buttonClick(WebElement element) {
		element.click();
	}

	public void typeText(WebElement element, String data) {
		element.sendKeys(data);
	}

	public void mouseHoverAction(WebElement target) {
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
	}

	public void rightClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick().perform();
	}

	public void doubleClick() {

		Actions a = new Actions(driver);
		a.doubleClick().perform();

	}

	public void dragAndDrop(WebElement source, WebElement target) {
		Actions dragDrop = new Actions(driver);
		dragDrop.dragAndDrop(source, target).perform();
	}

	public void dropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	public void dropDown(WebElement element, int value) {
		Select select = new Select(element);
		select.selectByIndex(value);
	}

	public String getValueByAttribute(WebElement element, String attribute) {
		attribute = element.getAttribute("value");
		System.out.println(attribute);
		return attribute;
	}

	public void getText(WebElement element) {
		element.getText();
		

	}

}
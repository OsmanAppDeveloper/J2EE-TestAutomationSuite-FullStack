package com.amazon.browserautomationlibs;

import org.openqa.selenium.WebDriver;

import com.amazon.enums.LocatorStrategy;
import com.amazon.utils.CustomException;

public class WebBrowserUserActions {
	private WebDriver driver;
	private WebElementInspection inspectWebElement;

	public WebBrowserUserActions(WebDriver driver) {
		this.driver = driver;
		setInspectWebElement(new WebElementInspection(driver));
	}

	public void type(LocatorStrategy locatorStrategy, Object obj, String data) throws CustomException {
		getInspectWebElement().getWebElement(locatorStrategy, obj).clear();
		getInspectWebElement().getWebElement(locatorStrategy, obj).sendKeys(data);
	}

	public void click(LocatorStrategy locatorStrategy, Object obj, String data) throws CustomException {
		getInspectWebElement().getWebElement(locatorStrategy, obj).click();

	}

	/**
	 * @return the driver
	 */
	private WebDriver getDriver() {
		return driver;
	}

	/**
	 * @param driver the driver to set
	 */
	private void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @return the webElement
	 */
	public WebElementInspection getInspectWebElement() {
		return inspectWebElement;
	}

	/**
	 * @param webElement the webElement to set
	 */
	public void setInspectWebElement(WebElementInspection webElement) {
		this.inspectWebElement = webElement;
	}
}

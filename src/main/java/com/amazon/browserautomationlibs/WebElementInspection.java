package com.amazon.browserautomationlibs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.amazon.constants.BrowserAutomationConstants;
import com.amazon.enums.LocateElementBy;
import com.amazon.utils.CustomException;

public class WebElementInspection {
	public WebElementInspection(WebDriver driver) {
		this.driver = driver;
	}

	private WebDriver driver;

	private WebElement webElement;

	public WebElement getWebElement(LocateElementBy locateElementBy, By elementFromUi) throws CustomException {
		try {
			WebElement element = null;
			switch (locateElementBy) {
			case ID:
				element = getDriver().findElement(elementFromUi);
				break;
			case NAME:
				element = getDriver().findElement(elementFromUi);
				break;
			case CLASS_NAME:
				element = getDriver().findElement(elementFromUi);
				break;
			case CSS_SELECTOR:
				element = getDriver().findElement(elementFromUi);
				break;
			case XPATH:
				element = getDriver().findElement(elementFromUi);
				break;
			case LINK_TEXT:
				element = getDriver().findElement(elementFromUi);
				break;
			case PARTIAL_LINK_TEXT:
				element = getDriver().findElement(elementFromUi);
				break;
			case TAG_NAME:
				element = getDriver().findElement(elementFromUi);
				break;
			default:
				break;
			}
			if (element == null) {
				throw new CustomException(BrowserAutomationConstants.ERROR_MESSAGE_001);
			} else {
				setWebElement(element);
				return getWebElement();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException(e.getMessage());
		}

	}
	/**
	 * @return the driver
	 */
	public WebDriver getDriver() {
		return driver;
	}

	/**
	 * @param driver the driver to set
	 */
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	/**
	 * @return the webElement
	 */
	public WebElement getWebElement() {
		return webElement;
	}
	/**
	 * @param webElement the webElement to set
	 */
	private void setWebElement(WebElement webElement) {
		this.webElement = webElement;
	}

}

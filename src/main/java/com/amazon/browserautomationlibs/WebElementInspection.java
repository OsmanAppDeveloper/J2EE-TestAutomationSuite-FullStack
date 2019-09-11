package com.amazon.browserautomationlibs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.amazon.enums.LocatorStrategy;
import com.amazon.utils.CustomException;

public class WebElementInspection {
	public WebElementInspection(WebDriver driver) {
		this.driver = driver;
	}

	private WebDriver driver;

	public WebElement getWebElement(LocatorStrategy locatorStrategy, Object obj) throws CustomException {
		try {
			WebElement element = null;
			switch (locatorStrategy) {
			case ID:
				element = getDriver().findElement(By.id(obj.toString()));
				break;
			case NAME:
				element = getDriver().findElement(By.name(obj.toString()));
				break;
			case CLASS_NAME:
				element = getDriver().findElement(By.className(obj.toString()));
				break;
			case XPATH:
				element = getDriver().findElement(By.xpath(obj.toString()));
				break;
			default:
				break;
			}
			if (element == null) {
				throw new CustomException("Set a Valid Locatory Strategy");
			} else {
				return element;
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

}

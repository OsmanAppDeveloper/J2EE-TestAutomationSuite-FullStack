package com.amazon.browserautomationlibs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.enums.ExpectedWaitCondition;

public class WebBrowserSynchronisation {

	private WebDriver driver;
	private WebDriverWait waitExplicit;
	private WebElement webElement;

	public WebBrowserSynchronisation(WebDriver driver) {
		this.driver = driver;
	}

	private static final long TIMEOUT = 20;

	public void waitExplicit(By webElement , ExpectedWaitCondition condition) {
		setWaitExplicit(new WebDriverWait(getDriver(), Duration.ofMinutes(TIMEOUT)));
		switch (condition) {
		case PRESENCE:
			getWaitExplicit().until(ExpectedConditions.visibilityOf((WebElement) webElement));
			break;
		case CLICKABLE:
			getWaitExplicit().until(ExpectedConditions.elementToBeClickable((WebElement) webElement));
			break;
		default:
			break;
		}

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
	 * @return the wait
	 */
	private WebDriverWait getWaitExplicit() {
		return waitExplicit;
	}

	/**
	 * @param wait the wait to set
	 */
	private void setWaitExplicit(WebDriverWait wait) {
		this.waitExplicit = wait;
	}

	/**
	 * @return the webElement
	 */
	private WebElement getWebElement() {
		return webElement;
	}

	/**
	 * @param webElement the webElement to set
	 */
	private void setWebElement(WebElement webElement) {
		this.webElement = webElement;
	}

}

package com.amazon.browserautomationlibs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amazon.enums.ExpectedWaitCondition;
import com.amazon.enums.LocateElementBy;
import com.amazon.utils.CustomException;

public class WebBrowserUserActions {
	private WebDriver driver;
	private WebElementInspection inspectWebElement;
	private WebBrowserSynchronisation synchronizeWebBrowser;

	public WebBrowserUserActions(WebDriver driver) {
		this.driver = driver;
	}

	public void type(LocateElementBy locateElementBy, By elementFromUi, String data) throws CustomException {
		try {
			getSynchronizeWebBrowser().waitExplicit(elementFromUi, ExpectedWaitCondition.VISIBILE);
			getInspectWebElement().getWebElement(locateElementBy, elementFromUi).clear();
			getInspectWebElement().getWebElement(locateElementBy, elementFromUi).sendKeys(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click(LocateElementBy locateElementBy,  By elementFromUi) throws CustomException {
		try {
			getSynchronizeWebBrowser().waitExplicit(elementFromUi, ExpectedWaitCondition.VISIBILE);
			getInspectWebElement().getWebElement(locateElementBy, elementFromUi).click();
		} catch (Exception e) {
			e.printStackTrace();
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

	/**
	 * @return the synchronizeWebBrowser
	 */
	public WebBrowserSynchronisation getSynchronizeWebBrowser() {
		return synchronizeWebBrowser;
	}

	/**
	 * @param synchronizeWebBrowser the synchronizeWebBrowser to set
	 */
	public void setSynchronizeWebBrowser(WebBrowserSynchronisation synchronizeWebBrowser) {
		this.synchronizeWebBrowser = synchronizeWebBrowser;
	}
}

package com.amazon.browserautomationlibs;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.amazon.enums.ExpectedWaitCondition;
import com.amazon.enums.LocateElementBy;
import com.amazon.utils.CustomException;

public class WebBrowserUserActions {
	private WebDriver driver;
	private WebElementInspection inspectWebElement;
	private WebElementSynchronisation synchronizeWebElement;

	public WebBrowserUserActions(WebDriver driver) {
		this.driver = driver;
	}

	public void type(LocateElementBy locateElementBy, By elementFromUi, String data) throws CustomException {
		try {
			getSynchronizedWebElement().waitExplicit(elementFromUi, ExpectedWaitCondition.VISIBILE);
			getInspectWebElement().getWebElement(locateElementBy, elementFromUi).clear();
			getInspectWebElement().getWebElement(locateElementBy, elementFromUi).sendKeys(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void click(LocateElementBy locateElementBy,  By elementFromUi) throws CustomException {
		try {
		//	getSynchronizedWebElement().waitExplicit(elementFromUi, ExpectedWaitCondition.VISIBILE);
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
		if (ObjectUtils.isEmpty(inspectWebElement)) {
			setInspectWebElement(new WebElementInspection(getDriver()));
			return inspectWebElement;
		}else {
			return inspectWebElement;
		}
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
	public WebElementSynchronisation getSynchronizedWebElement() {
		if (ObjectUtils.isEmpty(synchronizeWebElement)) {
			setSynchronizedWebElement(new WebElementSynchronisation(getDriver()));
			return synchronizeWebElement;
		}else {
			return synchronizeWebElement;
		}
	}

	/**
	 * @param synchronizeWebBrowser the synchronizeWebBrowser to set
	 */
	public void setSynchronizedWebElement(WebElementSynchronisation synchronizeWebBrowser) {
		this.synchronizeWebElement = synchronizeWebBrowser;
	}
}

package com.amazon.browserautomationlibs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class WebBrowserSessionManagement {

	public WebBrowserSessionManagement(WebDriver driver) {
		this.driver = driver;
	}

	private WebDriver driver;

	public void getTitle() {
		getDriver().getTitle();

	}

	public void maximizeBrowserWindow() {
		getDriver().manage().window().maximize();

	}

	private void getWebBrowserSesseionID() {
		SessionId session = ((RemoteWebDriver) getDriver()).getSessionId();

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

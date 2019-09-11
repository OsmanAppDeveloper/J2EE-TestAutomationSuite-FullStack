package com.amazon.browserautomationlibs;

import org.openqa.selenium.WebDriver;

import com.amazon.enums.NavigationType;

public class WebBrowserNavigation {

	private WebDriver driver;

	public WebBrowserNavigation(WebDriver driver) {
		this.setDriver(driver);
	}

	public void navigateWebPage(NavigationType navigationType, String url) {
		switch (navigationType) {
		case BACK:
			navigateBack();
			break;
		case FORWARD:
			navigateForward();
			break;
		case REFERSH:
			refreshPage();
			break;
		case TO_SPECIFIC_URL:
			navigateToUrl(url);
			break;
		default:
			break;
		}

	}

	private void navigateForward() {
		try {
			getDriver().navigate().forward();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void navigateBack() {
		try {
			getDriver().navigate().back();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void navigateToUrl(String url) {
		try {
			try {
				if (url != null) {
					getDriver().navigate().to(url);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void refreshPage() {
		try {
			getDriver().navigate().refresh();
		} catch (Exception e) {
			e.printStackTrace();
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

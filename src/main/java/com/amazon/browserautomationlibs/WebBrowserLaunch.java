package com.amazon.browserautomationlibs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.amazon.constants.BrowserAutomationConstants;
import com.amazon.enums.BrowserType;
import com.amazon.enums.Destination;
import com.amazon.enums.OperatingSystem;
import com.amazon.utils.CustomException;

public class WebBrowserLaunch {

	private WebDriver driver;

	/**
	 *
	 * @param os
	 * @param browserType
	 */
	public void openWebBrowserWithDefaultSettings(Destination desination, OperatingSystem os, BrowserType browserType) {
		try {
			switch (browserType) {
			case CHROME:
				openChromeBrowser(desination, os);
				break;
			case FIREFOX:
				openFireFoxBrowser(desination, os);
				break;
			case IE:
				openIEBrowser(desination, os);
				break;
			case EDGE:
				openEdgeBrowser(desination, os);
				break;
			default:
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	/**
	 *
	 * @param os
	 * @param browserType
	 */
	public void openWebBrowserWithDesiredSettings(Destination desination, OperatingSystem os, BrowserType browserType) {
		try {
			switch (browserType) {
			case CHROME:
				openChromeBrowser(desination, os);
				break;
			case FIREFOX:
				openFireFoxBrowser(desination, os);
				break;
			case IE:
				openIEBrowser(desination, os);
				break;
			case EDGE:
				openEdgeBrowser(desination, os);
				break;
			default:
				break;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	/**
	 * @return
	 * @throws Exception
	 */
	private String setWebBrowserBinaryLocation(String key, String value) throws CustomException {
		try {
			return System.setProperty(key, value);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException(e.getMessage());
		}

	}
/**
 *
 * @param desination
 * @param os
 */
	private void openChromeBrowser(Destination desination, OperatingSystem os) {
		try {
			setWebBrowserBinaryLocation(BrowserAutomationConstants.CHROME_SYSTEM_PROPERTY,
					BrowserAutomationConstants.CHROME_DRIVER_WINDOWS_LOCATION);
			setDriver(new ChromeDriver());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
/**
 *
 * @param desination
 * @param os
 */
	private void openFireFoxBrowser(Destination desination, OperatingSystem os) {
		try {
			setWebBrowserBinaryLocation(BrowserAutomationConstants.FIREFOX_SYSTEM_PROPERTY,
					BrowserAutomationConstants.FIREFOX_DRIVER_WINDOWS_LOCATION);
			setDriver(new ChromeDriver());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
/**
 *
 * @param desination
 * @param os
 */
	private void openIEBrowser(Destination desination, OperatingSystem os) {
		try {
			setWebBrowserBinaryLocation(BrowserAutomationConstants.IE_SYSTEM_PROPERTY,
					BrowserAutomationConstants.IE_DRIVER_WINDOWS_LOCATION);
			setDriver(new InternetExplorerDriver());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
/**
 *
 * @param desination
 * @param os
 */
	private void openEdgeBrowser(Destination desination, OperatingSystem os) {
		try {
			setWebBrowserBinaryLocation(BrowserAutomationConstants.EDGE_SYSTEM_PROPERTY,
					BrowserAutomationConstants.EDGE_DRIVER_WINDOWS_LOCATION);
			setDriver(new EdgeDriver());
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}
/**
 *
 * @return
 */
	public WebDriver getDriver() {
		return driver;
	}
/**
 *
 * @param driver
 */
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}

package com.amazon.browserautomationlibs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.amazon.enums.BrowserType;
import com.amazon.enums.OperatingSystem;

public class WebBrowserLaunch {

	private WebDriver driver;

	public void openWebBrowser(OperatingSystem os, BrowserType browserType) {
		switch (os) {
		case WINDOWS:
			
			break;

		case MAC:

			break;
		default:
			break;
		}

	}

	private void openChromeBrowser() {
		setDriver(new ChromeDriver());
	}

	private void openFireFoxBrowser() {
		setDriver(new FirefoxDriver());
	}

	private void openMicrosoftIEBrowser() {
		setDriver(new InternetExplorerDriver());
	}

	private void openMicrosoftEdgeBrowser() {
		setDriver(new EdgeDriver());
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}

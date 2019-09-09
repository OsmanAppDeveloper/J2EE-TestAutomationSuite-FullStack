package com.amazon.browserautomationlibs;

import com.amazon.enums.BrowserType;

public class BrowserAutomationImpl implements IBrowserAutomation {

	WebBrowserLaunch openBrowser;

	WebBrowserNavigation navigateBrowser;

	public void openWebBrowser(BrowserType browserType) {
		System.out.println("User Open Web Browser");
	}

	public void navigateWebBrowser() {
		System.out.println("User navigate to Home Page in Web Browser");
	}

}

package org.amazon.testautomationsuite.web.pageobjects;

import com.amazon.enums.BrowserType;
import com.amazon.enums.Destination;
import com.amazon.enums.NavigationType;
import com.amazon.enums.OperatingSystem;
import com.amazon.utils.CustomException;

public class LaunchWebAppPage extends BasePage {

	public void openWebBrowser(Destination desination, OperatingSystem os, BrowserType browserType)
			throws CustomException {
		try {
			getBrowserAutomation().getWebBrowserLaunchAPI().openWebBrowserWithDefaultSettings(desination, os,
					browserType);
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException(e.getMessage());
		}

	}

	public void navigateToUserLandingPage() throws CustomException {
		getBrowserAutomation().getWebBrowserNavigateAPI().navigateWebPage(NavigationType.TO_SPECIFIC_URL,
				"https://www.amazon.com");

	}

}

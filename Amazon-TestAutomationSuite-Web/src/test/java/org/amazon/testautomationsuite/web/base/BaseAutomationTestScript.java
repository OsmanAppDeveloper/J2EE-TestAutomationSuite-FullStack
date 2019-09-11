package org.amazon.testautomationsuite.web.base;

import com.amazon.browserautomationlibs.IBrowserAutomation;

public class BaseAutomationTestScript {
	private static IBrowserAutomation browserAutomation;

	/**
	 * @return the browserAutomation
	 */
	public static IBrowserAutomation getBrowserAutomationAPI() {
		return browserAutomation;
	}

	/**
	 * @param browserAutomation the browserAutomation to set
	 */
	public static void setBrowserAutomationAPI(IBrowserAutomation browserAutomation) {
		BaseAutomationTestScript.browserAutomation = browserAutomation;
	}
}

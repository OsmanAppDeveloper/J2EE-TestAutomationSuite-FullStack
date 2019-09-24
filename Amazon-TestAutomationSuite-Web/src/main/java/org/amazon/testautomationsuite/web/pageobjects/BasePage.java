package org.amazon.testautomationsuite.web.pageobjects;

import org.springframework.util.ObjectUtils;

import com.amazon.browserautomationlibs.BrowserAutomationImpl;
import com.amazon.browserautomationlibs.IBrowserAutomation;
import com.amazon.utils.CustomException;

public class BasePage {
	private IBrowserAutomation browserAutomation;

	/**
	 * @return the browserAutomation
	 * @throws CustomException
	 */
	public IBrowserAutomation getBrowserAutomation() throws CustomException {
		if (ObjectUtils.isEmpty(browserAutomation)) {
			setBrowserAutomation(new BrowserAutomationImpl());
			return browserAutomation;
		} else {
			return browserAutomation;
		}
	}
	/**
	 * @param browserAutomation the browserAutomation to set
	 */
	private void setBrowserAutomation(IBrowserAutomation browserAutomation) {
		this.browserAutomation = browserAutomation;
	}
}

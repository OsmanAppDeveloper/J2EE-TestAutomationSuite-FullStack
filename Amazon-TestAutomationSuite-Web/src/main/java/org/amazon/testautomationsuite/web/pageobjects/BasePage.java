package org.amazon.testautomationsuite.web.pageobjects;

import org.springframework.util.ObjectUtils;

import com.amazon.browserautomationlibs.BrowserAutomationImpl;
import com.amazon.browserautomationlibs.IBrowserAutomation;
import com.amazon.utils.CustomException;

public class BasePage {

	private static IBrowserAutomation browserAutomation;

	/**
	 * @return the browserAutomation
	 * @throws CustomException
	 */

	public static IBrowserAutomation getBrowserAutomation() throws CustomException {
		if (ObjectUtils.isEmpty(browserAutomation)) {
			return browserAutomation = new BrowserAutomationImpl();
		} else {
			return browserAutomation;
		}
	}

}

package org.amazon.testautomationsuite.web.base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.amazon.browserautomationlibs.BrowserAutomationImpl;
import com.amazon.browserautomationlibs.IBrowserAutomation;
import com.amazon.utils.CustomException;

public class BaseAutomationTestScriptSmoke {

	private IBrowserAutomation browserAutomation;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Smoke Suite Execution Started");
	}
	@BeforeTest
	public void beforeTest() throws CustomException {

	}
	@AfterTest
	public void afterTest() throws CustomException {
	getBrowserAutomation().getWebBrowserLaunchAPI().getDriver().quit();
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Smoke Suite Execution Finished");
	}

	/**
	 * @return the browserAutomation
	 * @throws CustomException
	 */
	public IBrowserAutomation getBrowserAutomation() throws CustomException {
		if (browserAutomation == null) {
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

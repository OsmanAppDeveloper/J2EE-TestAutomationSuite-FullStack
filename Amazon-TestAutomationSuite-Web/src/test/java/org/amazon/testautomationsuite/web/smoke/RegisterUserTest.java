package org.amazon.testautomationsuite.web.smoke;

import org.amazon.testautomationsuite.web.base.BaseAutomationTestScript;
import org.testng.annotations.Test;

import com.amazon.browserautomationlibs.BrowserAutomationImpl;
import com.amazon.enums.BrowserType;
import com.amazon.enums.Destination;
import com.amazon.enums.OperatingSystem;
import com.amazon.utils.CustomException;

public class RegisterUserTest extends BaseAutomationTestScript {

	@Test
	private void automationTestScript() throws CustomException {
		setBrowserAutomationAPI(new BrowserAutomationImpl());
		getBrowserAutomationAPI().getWebBrowserLaunchAPI().openWebBrowserWithDefaultSettings(Destination.LOCAL, OperatingSystem.WINDOWS,
				BrowserType.CHROME);
	}
}

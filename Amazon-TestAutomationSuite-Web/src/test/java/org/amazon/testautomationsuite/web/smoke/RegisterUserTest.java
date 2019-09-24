package org.amazon.testautomationsuite.web.smoke;

import org.amazon.testautomationsuite.web.base.BaseAutomationTestScriptSmoke;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.amazon.enums.BrowserType;
import com.amazon.enums.Destination;
import com.amazon.enums.LocateElementBy;
import com.amazon.enums.NavigationType;
import com.amazon.enums.OperatingSystem;
import com.amazon.utils.CustomException;

public class RegisterUserTest extends BaseAutomationTestScriptSmoke {

	@Test
	private void automationTestScript() throws CustomException {
		run();

	}

	/**
	 * @throws CustomException
	 */
	private void run() throws CustomException {
		getBrowserAutomation().getWebBrowserLaunchAPI().openWebBrowserWithDefaultSettings(Destination.LOCAL,
				OperatingSystem.WINDOWS, BrowserType.CHROME);
		getBrowserAutomation().getWebBrowserNavigateAPI().navigateWebPage(NavigationType.TO_SPECIFIC_URL,"https://www.amazon.com");
		By click = By.id("nav-link-accountList");
		getBrowserAutomation().getWebElementInspectionAPI().getWebElement(LocateElementBy.ID, click).click();
	}

}

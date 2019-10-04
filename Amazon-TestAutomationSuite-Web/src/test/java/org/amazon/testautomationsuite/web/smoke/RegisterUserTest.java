package org.amazon.testautomationsuite.web.smoke;

import org.amazon.testautomationsuite.web.pageobjects.LandingPage;
import org.amazon.testautomationsuite.web.pageobjects.LaunchWebAppPage;
import org.testng.annotations.Test;

import com.amazon.enums.BrowserType;
import com.amazon.enums.Destination;
import com.amazon.enums.OperatingSystem;
import com.amazon.utils.CustomException;

public class RegisterUserTest {

	@Test
	public void automationTestScript() throws CustomException {
		LaunchWebAppPage launchWebApp = new LaunchWebAppPage();
		launchWebApp.openWebBrowser(Destination.LOCAL, OperatingSystem.WINDOWS, BrowserType.CHROME);
		launchWebApp.navigateToUserLandingPage();
		LandingPage landingPage = new LandingPage();
		landingPage.clickHelloSignIn();
	}
}

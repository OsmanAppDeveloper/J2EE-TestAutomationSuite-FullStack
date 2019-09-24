
package org.amazon.testautomationsuite.web.pageobjects;

import org.amazon.testautomationsuite.web.objectrepository.LandingPageOR;
import org.openqa.selenium.By;

import com.amazon.enums.LocateElementBy;
import com.amazon.utils.CustomException;

public class LandingPage extends BasePage {

	By helloSignInLink = By.id(LandingPageOR.HELLO_SIGN_IN_LINK);

	public void clickHelloSignIn() throws CustomException {
		try {
		getBrowserAutomation().getWebBrowserUserActionsAPI().click(LocateElementBy.ID, helloSignInLink);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
package com.amazon.browserautomationlibs;

import com.amazon.utils.CustomException;

public class BrowserAutomationImpl implements IBrowserAutomation {

	private WebBrowserLaunch openBrowser;

	private WebBrowserNavigation navigateBrowser;

	private WebBrowserSynchronisation synchroniseBrowser;

	private WebBrowserUserActions webBrowserUserAction;

	public WebBrowserLaunch getWebBrowserLaunchAPI() throws CustomException {
		try {
			setOpenBrowser(new WebBrowserLaunch());
			return getOpenBrowser();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException(e.getMessage());
		}
	}

	public WebBrowserNavigation getWebBrowserNavigateAPI() throws CustomException {
		try {
			setNavigateBrowser(new WebBrowserNavigation(getOpenBrowser().getDriver()));
			return getNavigateBrowser();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException(e.getMessage());
		}
	}

	public WebBrowserSynchronisation getWebBrowserSynchroniseAPI()throws CustomException {
		try {
			setSynchroniseBrowser(new WebBrowserSynchronisation(getOpenBrowser().getDriver()));
			return getSynchroniseBrowser();
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException(e.getMessage());
		}
	}



	/**
	 * @return the openBrowser
	 */
	private WebBrowserLaunch getOpenBrowser() {
		return openBrowser;
	}

	/**
	 * @param openBrowser the openBrowser to set
	 */
	private void setOpenBrowser(WebBrowserLaunch openBrowser) {
		this.openBrowser = openBrowser;
	}

	/**
	 * @return the navigateBrowser
	 */
	private WebBrowserNavigation getNavigateBrowser() {
		return navigateBrowser;
	}

	/**
	 * @param navigateBrowser the navigateBrowser to set
	 */
	private void setNavigateBrowser(WebBrowserNavigation navigateBrowser) {
		this.navigateBrowser = navigateBrowser;
	}

	/**
	 * @return the synchroniseBrowser
	 */
	private WebBrowserSynchronisation getSynchroniseBrowser() {
		return synchroniseBrowser;
	}

	/**
	 * @param synchroniseBrowser the synchroniseBrowser to set
	 */
	private void setSynchroniseBrowser(WebBrowserSynchronisation synchroniseBrowser) {
		this.synchroniseBrowser = synchroniseBrowser;
	}

	/**
	 * @return the webBrowserUserAction
	 */
	private WebBrowserUserActions getWebBrowserUserAction() {
		return webBrowserUserAction;
	}

	/**
	 * @param webBrowserUserAction the webBrowserUserAction to set
	 */
	private void setWebBrowserUserAction(WebBrowserUserActions webBrowserUserAction) {
		this.webBrowserUserAction = webBrowserUserAction;
	}


}

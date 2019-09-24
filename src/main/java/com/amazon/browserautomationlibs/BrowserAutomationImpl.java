package com.amazon.browserautomationlibs;

import org.apache.commons.lang3.ObjectUtils;

import com.amazon.utils.CustomException;

public class BrowserAutomationImpl implements IBrowserAutomation {

	public BrowserAutomationImpl() throws CustomException {
	}

	private WebBrowserLaunch openBrowser;

	private WebBrowserNavigation navigateBrowser;

	private WebBrowserSynchronisation synchroniseBrowser;

	private WebBrowserUserActions webBrowserUserAction;

	private WebBrowserSessionManagement webBrowserSessionManagement;

	private WebElementInspection webElementInspection;

	public WebBrowserLaunch getWebBrowserLaunchAPI() throws CustomException {
		try {
			if (ObjectUtils.isEmpty(getOpenBrowser())) {
				setOpenBrowser(new WebBrowserLaunch());
				return getOpenBrowser();
			} else {
				return getOpenBrowser();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException(e.getMessage());
		}
	}

	public WebBrowserNavigation getWebBrowserNavigateAPI() throws CustomException {
		try {
			if (ObjectUtils.isEmpty(getNavigateBrowser())) {
				setNavigateBrowser(new WebBrowserNavigation(getOpenBrowser().getDriver()));
				return getNavigateBrowser();
			} else {
				return getNavigateBrowser();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException(e.getMessage());
		}
	}

	public WebBrowserSessionManagement getWebBrowserSessionManagementAPI() throws CustomException {
		try {
			if (ObjectUtils.isEmpty(getWebBrowserSessionManagement())) {
				setWebBrowserSessionManagement(new WebBrowserSessionManagement(getOpenBrowser().getDriver()));
				return getWebBrowserSessionManagement();
			} else {
				return getWebBrowserSessionManagement();
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException(e.getMessage());
		}
	}

	public WebBrowserSynchronisation getWebBrowserSynchroniseAPI() throws CustomException {
		try {
			if (ObjectUtils.isEmpty(getSynchroniseBrowser())) {
				setSynchroniseBrowser(new WebBrowserSynchronisation(getOpenBrowser().getDriver()));
				return getSynchroniseBrowser();
			} else {
				return getSynchroniseBrowser();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException(e.getMessage());
		}
	}

	public WebElementInspection getWebElementInspectionAPI() throws CustomException {
		try {
			if (ObjectUtils.isEmpty(getWebElementInspection())) {
				setWebElementInspection(new WebElementInspection(getOpenBrowser().getDriver()));
				return getWebElementInspection();
			} else {
				return getWebElementInspection();
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomException(e.getMessage());
		}
	}

	public WebBrowserUserActions getWebBrowserUserActionsAPI() throws CustomException {
		try {
			if (ObjectUtils.isEmpty(getWebBrowserUserAction())) {
				setWebBrowserUserAction(new WebBrowserUserActions(getOpenBrowser().getDriver()));
				return getWebBrowserUserAction();
			} else {
				return getWebBrowserUserAction();
			}
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

	/**
	 * @return the webBrowserSessionManagement
	 */
	private WebBrowserSessionManagement getWebBrowserSessionManagement() {
		return webBrowserSessionManagement;
	}

	/**
	 * @param webBrowserSessionManagement the webBrowserSessionManagement to set
	 */
	private void setWebBrowserSessionManagement(WebBrowserSessionManagement webBrowserSessionManagement) {
		this.webBrowserSessionManagement = webBrowserSessionManagement;
	}

	/**
	 * @return the webElementInspection
	 */
	public WebElementInspection getWebElementInspection() {
		return webElementInspection;
	}

	/**
	 * @param webElementInspection the webElementInspection to set
	 */
	public void setWebElementInspection(WebElementInspection webElementInspection) {
		this.webElementInspection = webElementInspection;
	}

}

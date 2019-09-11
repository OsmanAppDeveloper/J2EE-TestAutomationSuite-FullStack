package com.amazon.browserautomationlibs;

import com.amazon.utils.CustomException;
public interface IBrowserAutomation {
WebBrowserLaunch getWebBrowserLaunchAPI() throws CustomException;
WebBrowserNavigation getWebBrowserNavigateAPI() throws CustomException;
WebBrowserSynchronisation getWebBrowserSynchroniseAPI()throws CustomException;
}

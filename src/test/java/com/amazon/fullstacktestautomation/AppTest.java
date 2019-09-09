package com.amazon.fullstacktestautomation;

import com.amazon.browserautomationlibs.BrowserAutomationImpl;
import com.amazon.browserautomationlibs.IBrowserAutomation;
import com.amazon.enums.BrowserType;

public class AppTest {

	IBrowserAutomation browserAutomation;


	public static void main(String[] args){
		IBrowserAutomation automate = new BrowserAutomationImpl();
		automate.openWebBrowser(BrowserType.CHROME);
		automate.navigateWebBrowser();
	}
}

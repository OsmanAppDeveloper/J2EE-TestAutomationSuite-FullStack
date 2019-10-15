package com.amazon.constants;

public class BrowserAutomationConstants {
	private BrowserAutomationConstants() {

	}

	public static final String WEB_DRIVERS_LOCATION_WINDOWS = setPathToProjectRoot() + "//src//main//resources//WebDrivers//Windows";

	public static final String CHROME_DRIVER_WINDOWS_LOCATION = WEB_DRIVERS_LOCATION_WINDOWS
			+ "//chromedriver.exe";

	public static final String FIREFOX_DRIVER_WINDOWS_LOCATION = System.getProperty("user.dir")
			+ "//src//main//resources//WebDrivers//geckodriver.exe";

	public static final String IE_DRIVER_WINDOWS_LOCATION = System.getProperty("user.dir")
			+ "//src//main//resources//WebDrivers//IEDriverServer.exe";

	public static final String EDGE_DRIVER_WINDOWS_LOCATION = System.getProperty("user.dir")
			+ "//src//main//resources//WebDrivers//MicrosoftWebDriver.exe";

	public static final String CHROME_SYSTEM_PROPERTY = "webdriver.chrome.driver";

	public static final String FIREFOX_SYSTEM_PROPERTY = "webdriver.gecko.driver";

	public static final String IE_SYSTEM_PROPERTY = "webdriver.ie.driver";

	public static final String EDGE_SYSTEM_PROPERTY = "webdriver.Edge.driver";

	// Error Messages

	public static final String ERROR_MESSAGE_001 = "Set a Valid Web Locator Strategy";

	private static String setPathToProjectRoot() {
		String split = System.getProperty("user.dir");
		String[] trim = split.split("Amazon-TestAutomationSuite-Web");
		return trim[0];
	}
}
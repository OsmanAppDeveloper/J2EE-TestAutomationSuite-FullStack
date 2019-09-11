package com.amazon.utils;

public class CustomException extends Exception {

	public CustomException() {
		super();
	}

	public CustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CustomException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomException(String ErrorMessage) {
		super(ErrorMessage);
	}

	public CustomException(Throwable cause) {
		super(cause);
	}

}

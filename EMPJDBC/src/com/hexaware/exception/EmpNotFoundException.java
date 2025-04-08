package com.hexaware.exception;

public class EmpNotFoundException extends Exception {

	public EmpNotFoundException() {
		super();
	}

	public EmpNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public EmpNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public EmpNotFoundException(String message) {
		super(message);
	}

	public EmpNotFoundException(Throwable cause) {
		super(cause);

	}

	
}

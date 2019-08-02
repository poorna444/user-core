package com.practice.usercore.exception;

public class UserException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorMsg;
	
	public UserException(String errorMsg) {
		super(errorMsg);
		this.errorMsg = errorMsg;
	}
	
	public UserException(String errorMsg,Throwable cause) {
		super(errorMsg,cause);
		this.errorMsg = errorMsg;
	}
	
	
	public String getMessage() {
		return errorMsg;
	}

}

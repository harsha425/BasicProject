package com.hareesh.validations;

public class EmptyException extends Exception{
	
	private String errorMessage;
	
	
	public EmptyException(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}

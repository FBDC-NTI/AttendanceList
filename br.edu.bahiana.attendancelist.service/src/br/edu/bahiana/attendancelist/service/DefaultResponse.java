package br.edu.bahiana.attendancelist.service;

public class DefaultResponse {
	private long errorNumber;
	private String errorMessage;
	
	public void ctor() {
		setErrorNumber(0);
		setErrorMessage("");
	}
	
	public long getErrorNumber() {
		return errorNumber;
	}
	public void setErrorNumber(long errorNumber) {
		this.errorNumber = errorNumber;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}

package org.adidas.code.challange.rest.dto;

public class ExceptionResponseDTO {

	// main exception message
	private String message = "";
	// Exception class
	private String exception = "";
	// exception.stackTrace
	private String stackTrace = "";

	public ExceptionResponseDTO() {
	}

	public ExceptionResponseDTO(String message) {
		this.message = message;
	}

	public ExceptionResponseDTO(String message, String exception) {
		this.message = message;
		this.exception = exception;
	}

	public ExceptionResponseDTO(Exception e) {
		this.message = e.getMessage();
		this.exception = e.getClass().getName();
		this.stackTrace = RestStringUtil.stack2string(e);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getException() {
		return exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public String getStackTrace() {
		return stackTrace;
	}

	public void setStackTrace(String stackTrace) {
		this.stackTrace = stackTrace;
	}

	@Override
	public String toString() {
		return "ExceptionResponseDTO [message=" + message + ", exception=" + exception + ", stackTrace=" + stackTrace
				+ "]";
	}

}

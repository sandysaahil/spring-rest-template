package com.intellizest.sydneyservices.configuration;

public enum ServiceStatus {

	SUCCESS("Success", 200, "Service call is successful"),
	ERROR("Error", 500, "Error Occurred");
	
	private String status;
	private int code;
	private String message;
	
	ServiceStatus(String status, int code, String message){
		this.status = status;
		this.code = code;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}

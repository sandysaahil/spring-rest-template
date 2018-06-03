package com.intellizest.sydneyservices.model;

public enum ServiceType {

	TIFFIN ("Tiffin Services"),
	REMOVALIST ("Removalist"),
	PLUMBER ("Plumber");
	
	private String serviceType;
	
	ServiceType(final String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceType() {
		return serviceType;
	}
}

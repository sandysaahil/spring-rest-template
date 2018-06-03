package com.intellizest.sydneyservices.model;

import com.intellizest.sydneyservices.configuration.ServiceStatus;

public class BaseResponse {
	
	private ServiceStatus serviceStatus;

	public ServiceStatus getServiceStatus() {
		return serviceStatus;
	}

	public void setServiceStatus(ServiceStatus serviceStatus) {
		this.serviceStatus = serviceStatus;
	}
	
	
	
}

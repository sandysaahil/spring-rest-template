package com.intellizest.sydneyservices.model;

import java.util.List;

public class ServicesResponse extends BaseResponse{
	
	private List<Service> servicesList;

	public List<Service> getServicesList() {
		return servicesList;
	}

	public void setServicesList(List<Service> servicesList) {
		this.servicesList = servicesList;
	}

	@Override
	public String toString() {
		return "ServicesResponse [servicesList=" + servicesList + "]";
	}
}

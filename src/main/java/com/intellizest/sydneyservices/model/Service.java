package com.intellizest.sydneyservices.model;

public class Service {
	
	private ServiceType serviceType;
	private boolean active;
	private String area;
	
	public Service(ServiceType serviceType, boolean active, String area) {
		super();
		this.serviceType = serviceType;
		this.active = active;
		this.area = area;
	}

	public ServiceType getServiceType() {
		return serviceType;
	}

	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Service [serviceType=" + serviceType + ", active=" + active + ", area=" + area + "]";
	}
}

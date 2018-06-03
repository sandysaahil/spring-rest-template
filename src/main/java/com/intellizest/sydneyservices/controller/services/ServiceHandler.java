package com.intellizest.sydneyservices.controller.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.intellizest.sydneyservices.exception.ServiceException;

@Service
public class ServiceHandler {

	public List<com.intellizest.sydneyservices.model.Service> getServices(Optional<String> key) throws ServiceException{
		
		List<com.intellizest.sydneyservices.model.Service> serviceList = Collections.emptyList();
		
		return serviceList;
	}

}

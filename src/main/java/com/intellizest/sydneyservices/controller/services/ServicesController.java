package com.intellizest.sydneyservices.controller.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.intellizest.sydneyservices.configuration.ServiceStatus;
import com.intellizest.sydneyservices.exception.ServiceException;
import com.intellizest.sydneyservices.model.BaseResponse;
import com.intellizest.sydneyservices.model.Service;
import com.intellizest.sydneyservices.model.ServicesResponse;

@RestController
@RequestMapping("/services")
public class ServicesController {
	
	@Autowired
	private ServiceHandler serviceHandler;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public BaseResponse services(@RequestParam(value = "key") Optional<String> key) {
		
		ServicesResponse serviceResponse = new ServicesResponse();
		List<Service> servicesList = Collections.emptyList();
		try {
			servicesList = serviceHandler.getServices(key);
		} catch (ServiceException e) {
			serviceResponse.setServiceStatus(ServiceStatus.ERROR);
			return serviceResponse;
		}
		serviceResponse.setServicesList(servicesList);
		serviceResponse.setServiceStatus(ServiceStatus.SUCCESS);
		
		return serviceResponse;
	}

}

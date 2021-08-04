package com.shintaro.sysmulapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shintaro.sysmulapi.entitys.system.SystemEntity;
import com.shintaro.sysmulapi.entitys.system.SystemRepository;
import com.shintaro.sysmulapi.entitys.system.SystemService;
import com.shintaro.sysmulapi.generic.Controller;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/system")
@Api(tags = "System",description = " ")
public class SystemController implements Controller<SystemEntity,SystemRepository,SystemService> {
	
	public final SystemService service;
	
	@Autowired
	public SystemController (SystemService service) {
		this.service = service;
	}

	@Override
	public SystemService getService() {
		return service;
	}

}

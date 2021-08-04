package com.shintaro.sysmulapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shintaro.sysmulapi.entitys.plataform.PlataformEntity;
import com.shintaro.sysmulapi.entitys.plataform.PlataformRepository;
import com.shintaro.sysmulapi.entitys.plataform.PlataformService;
import com.shintaro.sysmulapi.generic.Controller;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/plataform")
@Api(tags = "Plataform",description = " ")
public class PlataformController implements Controller<PlataformEntity,PlataformRepository,PlataformService>{
	
	public final PlataformService service;
	
	@Autowired
	public PlataformController(PlataformService service) {
		this.service = service;
	}

	@Override
	public PlataformService getService() {
		return service;
	}

}

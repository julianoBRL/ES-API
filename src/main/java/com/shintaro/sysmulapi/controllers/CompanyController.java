package com.shintaro.sysmulapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shintaro.sysmulapi.entitys.company.CompanyEntity;
import com.shintaro.sysmulapi.entitys.company.CompanyRepository;
import com.shintaro.sysmulapi.entitys.company.CompanyService;
import com.shintaro.sysmulapi.generic.Controller;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/company")
@Api(tags = "Company",description = " ")
public class CompanyController implements Controller<CompanyEntity,CompanyRepository,CompanyService> {
	
	public final CompanyService service;
	
	@Autowired
	public CompanyController(CompanyService service) {
		this.service = service;
	}

	@Override
	public CompanyService getService() {
		return service;
	}

}

package com.shintaro.sysmulapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shintaro.sysmulapi.entitys.genre.GenreEntity;
import com.shintaro.sysmulapi.entitys.genre.GenreRepository;
import com.shintaro.sysmulapi.entitys.genre.GenreService;
import com.shintaro.sysmulapi.generic.Controller;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/Genre")
@Api(tags = "Genre",description = " ")
public class GenreController implements Controller<GenreEntity,GenreRepository,GenreService> {
	
	public final GenreService service;
	
	@Autowired
	public GenreController(GenreService service) {
		this.service = service;
	}

	@Override
	public GenreService getService() {
		return service;
	}

}

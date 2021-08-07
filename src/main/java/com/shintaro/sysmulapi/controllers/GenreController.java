package com.shintaro.sysmulapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shintaro.sysmulapi.entitys.genre.GenreEntity;
import com.shintaro.sysmulapi.entitys.genre.GenreRepository;
import com.shintaro.sysmulapi.entitys.genre.GenreService;
import com.shintaro.sysmulapi.entitys.genre.GenreSingletron;
import com.shintaro.sysmulapi.generic.CachedController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/Genre")
@Api(tags = "Genre",description = " ")
public class GenreController implements CachedController<GenreEntity,GenreRepository,GenreService,GenreSingletron> {
	
	private final GenreService service;
	private final GenreSingletron singletron;
	
	@Autowired
	public GenreController(GenreService service, GenreSingletron singletron) {
		this.service = service;
		this.singletron = singletron;
	}

	@Override
	public GenreService getService() {
		return service;
	}

	@Override
	public GenreSingletron getSingletron() {
		return singletron;
	}

}

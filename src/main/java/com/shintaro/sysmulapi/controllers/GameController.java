package com.shintaro.sysmulapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shintaro.sysmulapi.entitys.game.GameEntity;
import com.shintaro.sysmulapi.entitys.game.GameRepository;
import com.shintaro.sysmulapi.entitys.game.GameService;
import com.shintaro.sysmulapi.generic.Controller;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/game")
@Api(tags = "Game",description = " ")
public class GameController implements Controller<GameEntity,GameRepository,GameService> {
	
	public final GameService service;
	
	@Autowired
	public GameController(GameService service) {
		this.service = service;
	}

	@Override
	public GameService getService() {
		return service;
	}

}

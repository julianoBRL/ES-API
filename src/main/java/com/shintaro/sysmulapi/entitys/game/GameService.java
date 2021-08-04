package com.shintaro.sysmulapi.entitys.game;

import com.shintaro.sysmulapi.generic.Service;

@org.springframework.stereotype.Service
public class GameService extends Service<GameEntity,GameRepository> {

	protected GameService(GameRepository repository) {
		super(repository);
	}

}

package com.shintaro.sysmulapi.entitys.genre;

import com.shintaro.sysmulapi.generic.Service;

@org.springframework.stereotype.Service
public class GenreService extends Service<GenreEntity,GenreRepository> {

	protected GenreService(GenreRepository repository) {
		super(repository);
	}

}

package com.shintaro.sysmulapi.entitys.plataform;

import com.shintaro.sysmulapi.generic.Service;

@org.springframework.stereotype.Service
public class PlataformService extends Service<PlataformEntity,PlataformRepository> {

	protected PlataformService(PlataformRepository repository) {
		super(repository);
	}

}

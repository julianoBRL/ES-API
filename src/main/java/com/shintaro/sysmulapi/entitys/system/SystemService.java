package com.shintaro.sysmulapi.entitys.system;

import com.shintaro.sysmulapi.generic.Service;

@org.springframework.stereotype.Service
public class SystemService extends Service<SystemEntity,SystemRepository>{

	protected SystemService(SystemRepository repository) {
		super(repository);
	}

}

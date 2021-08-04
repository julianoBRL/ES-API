package com.shintaro.sysmulapi.entitys.company;

import com.shintaro.sysmulapi.generic.Service;

@org.springframework.stereotype.Service
public class CompanyService extends Service<CompanyEntity,CompanyRepository> {

	protected CompanyService(CompanyRepository repository) {
		super(repository);
	}

}

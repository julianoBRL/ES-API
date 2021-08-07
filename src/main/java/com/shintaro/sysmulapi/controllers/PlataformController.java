package com.shintaro.sysmulapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.javafaker.Faker;
import com.shintaro.sysmulapi.entitys.plataform.PlataformEntity;
import com.shintaro.sysmulapi.entitys.plataform.PlataformRepository;
import com.shintaro.sysmulapi.entitys.plataform.PlataformService;
import com.shintaro.sysmulapi.entitys.plataform.PlataformSingletron;
import com.shintaro.sysmulapi.generic.CachedController;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/plataform")
@Api(tags = "Plataform",description = " ")
public class PlataformController implements CachedController<PlataformEntity,PlataformRepository,PlataformService,PlataformSingletron>{
	
	private final PlataformService service;
	private final PlataformSingletron singletron;
	
	@Autowired
	public PlataformController(PlataformService service, PlataformSingletron singletron) {
		this.service = service;
		this.singletron = singletron;
	}

	@Override
	public PlataformService getService() {return service;}

	@Override
	public PlataformSingletron getSingletron() {return singletron;}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<?> getByName(@PathVariable String nome) {
		
		if(getSingletron().getCache().isEmpty()) {
			getSingletron().setCache(getService().list());
			return ResponseEntity.status(HttpStatus.OK).body("funfou");
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(
				getSingletron().getCache()
				.stream().filter(plataform -> plataform.getName().equals(nome))
		);
		
	}
	
	@GetMapping("/stress/{qtd}")
	public ResponseEntity<?> stress(@PathVariable int qtd){
		
		Faker faker = new Faker();
		
		for(int i = 0;i<qtd;i++) {
			
			PlataformEntity entity = new PlataformEntity();
			entity.setFullname(faker.name().fullName());
			entity.setName(faker.name().username());
			
			getService().save(entity);
			
		}
		
		return ResponseEntity.status(HttpStatus.OK).body("");
	}
	
}

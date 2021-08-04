package com.shintaro.sysmulapi.generic;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.shintaro.sysmulapi.entitys.plataform.PlataformSingletron;

public interface Controller<
	entity extends Object,
	repository extends Repository<entity>,
	service extends Service<entity,repository>
> {

	service getService();
	
	@GetMapping
	default ResponseEntity<?> getAll() {
		return ResponseEntity.status(HttpStatus.OK).body(getService().list());
	}
	
	@GetMapping("/{id}")
	default ResponseEntity<?> getByID(@PathVariable("id") UUID ID) throws Exception {
		return ResponseEntity.status(HttpStatus.OK).body(getService().getByID(ID));
	}
	
	@PostMapping
	default ResponseEntity<?> register(@RequestBody entity model){
		return ResponseEntity.status(HttpStatus.OK).body(getService().save(model));
	}
	
	/*@DeleteMapping("/{id}")
	default ResponseEntity<?> delete(@PathVariable("id") UUID ID){
		return ResponseEntity.status(HttpStatus.OK).body(getService().getByID(ID));
	}*/

}
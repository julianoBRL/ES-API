package com.shintaro.sysmulapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shintaro.sysmulapi.entitys.user.UserEntity;
import com.shintaro.sysmulapi.entitys.user.UserRepository;
import com.shintaro.sysmulapi.entitys.user.UserService;
import com.shintaro.sysmulapi.generic.Controller;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/user")
@Api(tags = "User",description = " ")
public class UserController implements Controller<UserEntity,UserRepository,UserService> {
	
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	@Override
	public UserService getService() {
		return userService;
	}
	
	@Override
	@PostMapping
	public ResponseEntity<?> register(@RequestBody UserEntity body){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		body.setPassword(encoder.encode(body.getPassword()));
		return ResponseEntity.status(HttpStatus.OK).body(userService.save(body));
	}

}

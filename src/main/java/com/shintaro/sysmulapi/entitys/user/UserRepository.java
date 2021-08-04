package com.shintaro.sysmulapi.entitys.user;

import java.util.Optional;

import com.shintaro.sysmulapi.generic.Repository;

@org.springframework.stereotype.Repository
public interface UserRepository extends Repository<UserEntity> {
	
	Optional<UserEntity> findByUsername(String username);
	
}

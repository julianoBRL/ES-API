package com.shintaro.sysmulapi.entitys.user;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.shintaro.sysmulapi.generic.Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@javax.persistence.Entity
@Table(name = "User")
@ApiModel(value = "User", description = "User info")
public class UserEntity extends Entity{
	
	@NotNull
	private String username;
	
	@NotNull
	@JsonProperty(access = Access.WRITE_ONLY)
	@ApiModelProperty(access = "Write Only")
	private String password;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private UserType type;
	
}

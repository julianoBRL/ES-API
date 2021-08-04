package com.shintaro.sysmulapi.entitys.system;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.shintaro.sysmulapi.entitys.plataform.PlataformEntity;
import com.shintaro.sysmulapi.generic.Entity;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@javax.persistence.Entity
@Table(name = "Systems")
@ApiModel(value = "System", description = "System info")
public class SystemEntity extends Entity{
	
	@NotNull
	private String RoomsFolderPath;
	
	@NotNull
	private String extensions;
	
	@NotNull
	private String command;
	
	@NotNull
	@OneToOne
	private PlataformEntity platform;
	
}

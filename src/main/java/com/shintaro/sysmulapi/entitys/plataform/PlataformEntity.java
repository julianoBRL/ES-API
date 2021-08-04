package com.shintaro.sysmulapi.entitys.plataform;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.shintaro.sysmulapi.generic.Entity;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@javax.persistence.Entity
@Table(name = "Plataform")
@ApiModel(value = "Plataform", description = "Plataform info")
public class PlataformEntity extends Entity {
	
	@NotNull
	private String name;
	
	@NotNull
	private String fullname;

}

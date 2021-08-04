package com.shintaro.sysmulapi.entitys.genre;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.shintaro.sysmulapi.generic.Entity;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@javax.persistence.Entity
@Table(name = "Genre")
@ApiModel(value = "Genre", description = "Genre info")
public class GenreEntity extends Entity{
	
	@NotNull
	private String name;
	
	@NotNull
	private String descricao;

}

package com.shintaro.sysmulapi.entitys.game;

import java.util.Date;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.shintaro.sysmulapi.entitys.company.CompanyEntity;
import com.shintaro.sysmulapi.entitys.genre.GenreEntity;
import com.shintaro.sysmulapi.entitys.system.SystemEntity;
import com.shintaro.sysmulapi.generic.Entity;

import io.swagger.annotations.ApiModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@javax.persistence.Entity
@Table(name = "Game")
@ApiModel(value = "Game", description = "Game info")
public class GameEntity extends Entity {
	
	@NotNull
	private String name;
	
	@NotNull
	private String descricao;
	
	@NotNull
	private String image;
	
	@NotNull
	private String thumbnail;
	
	@NotNull
	@OneToOne
	private SystemEntity system;
	
	@OneToOne
	private CompanyEntity developer;
	
	@OneToOne
	private CompanyEntity publisher;
	
	@OneToOne
	private GenreEntity genre;
	
	private String rating;
	private String players;
	private String playcount;
	private Date releasedate;
	private Date lastplayed;
	private String path;
	
}

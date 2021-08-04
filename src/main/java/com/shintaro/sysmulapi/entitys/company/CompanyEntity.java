package com.shintaro.sysmulapi.entitys.company;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.shintaro.sysmulapi.generic.Entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@javax.persistence.Entity
@Table(name = "Company")
@ApiModel(value = "Company", description = "Company info")
public class CompanyEntity extends Entity {
	
	@NotNull
	private String nome;
	
	@NotNull
	private String email;
	
}

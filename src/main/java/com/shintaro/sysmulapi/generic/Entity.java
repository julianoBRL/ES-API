package com.shintaro.sysmulapi.generic;

/*
 * By: Juliano Lira(ShintaroBRL) 
 * 
 */

import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
public class Entity {

	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
	@Type(type="org.hibernate.type.UUIDCharType")
	@ApiModelProperty(name = "Nome", notes = "Unique identifier")
	@Getter
	@Setter
    public UUID id;

}

package com.shintaro.sysmulapi.entitys.plataform;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class PlataformSingletron {
	
		private static PlataformSingletron singletron;
		
		@Getter
		@Setter
		private List<PlataformEntity> cache = new ArrayList<>();
		
		public static PlataformSingletron getInstance() {
			if(singletron == null) {
				singletron = new PlataformSingletron();
			}
			return singletron;
		}

}

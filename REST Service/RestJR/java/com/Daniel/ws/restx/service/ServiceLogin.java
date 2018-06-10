package com.Daniel.ws.restx.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.Daniel.ws.restx.vo.VOUsuario;

@Path("Servicio")		//En algunos casos lleva diagonal al principio, pero se quito pues puede generar conflictos
public class ServiceLogin {
	@POST
	@Path("/validaUsuario")
	@Consumes({MediaType.APPLICATION_JSON})		//Es lo que consume el servicio, en este caso es un JSON
	@Produces({MediaType.APPLICATION_JSON})		//El POJO lo regresara en formato JSON
	public VOUsuario validaUsuario(VOUsuario vo){
		vo.setUserValido(false);
		if(vo.getUsuario().equals("JR") && vo.getPassword().equals("pwd")){
			vo.setUserValido(true);
		}
		return vo;
	}
}

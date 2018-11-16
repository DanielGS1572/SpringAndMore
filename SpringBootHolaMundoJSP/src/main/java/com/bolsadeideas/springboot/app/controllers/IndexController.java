package com.bolsadeideas.springboot.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	@GetMapping("/index")
	public String index(Model model /*El objeto model permite pasar atributos a la vista*/){
		model.addAttribute("titulo","Hola Spring Boot!");
		return "index"; //se regresa el nombre de la vista
	}
}

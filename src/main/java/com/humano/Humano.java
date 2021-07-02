//Marcelo Aceituno R
//Full Stack JAVA 0034
//Hola Humano Spring Boot
package com.humano;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Humano {
	
	@RequestMapping("/")
	public String saluda(@RequestParam(value="nombre", required = false) String nombre,
			@RequestParam(value="apellido", required = false) String apellido){
		
		if(nombre == null) {
			nombre = "Humano";
		}
		
		if(apellido == null) {
			apellido = "";
		}
		
		return "<h1>Hola " + nombre + " " + apellido + " !!</h1><br><h2>Bienvenido a Spring Boot.</h2>";
		
	}
	
}

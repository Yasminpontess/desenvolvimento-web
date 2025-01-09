package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello-world")
public class CorreaEletricaController {

	//Metodos de requisições/respostas
	
	
	@GetMapping
	public String HelloWorld() {
		return"Hello World";
	}
	
}

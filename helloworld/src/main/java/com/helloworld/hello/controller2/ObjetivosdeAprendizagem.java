package com.helloworld.hello.controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/helloaprender")
public class ObjetivosdeAprendizagem {

	@GetMapping
	public String hello() {
		return "Meu objetivo de aprendizagem essa semana é melhorar minha habilidade de atenção aos detalhes porque tenho tido dificuldade de cumprir os exercícios.";
	
	}

}

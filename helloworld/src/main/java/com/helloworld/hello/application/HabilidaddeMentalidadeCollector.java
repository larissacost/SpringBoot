package com.helloworld.hello.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hellohabilidadementalidade")
public class HabilidaddeMentalidadeCollector {

	@GetMapping
	public String hello() {
		return "Habilidade:Persistência,Mentalidade:Orientação ao futuro";
	
	}
}

package com.HabilidadeseMentalidades.HeB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
@RequestMapping ("/HeB")

@GetMapping
	public String HeB () {
	return "Eu utilizei a mentalidade de persistência por se tratar de um conteudo novo"
			+ " e consequentemente desconhecido. Eu também utilizei a habilidade de atenção aos detalhes"
			+ " para aprender o passo a passo correto";
}

	
}

package com.OdA.ObjAprendizagem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/OdA")
public class ObjAprendizagem {
 @GetMapping 
 public String OdA () {
	 return "Meu objetivo de aprendizado dessa semana é poder me organizar"
	 		+ " para aprender e absorver ao máximo o conteúdo de Spring e tentar "
	 		+ "revisar os conteúdos de POO e MySQL.";
 }
}

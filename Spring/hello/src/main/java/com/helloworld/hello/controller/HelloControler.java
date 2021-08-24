package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloControler {

@GetMapping ("/Hello")

public String Hello () {
	return "Hello, world";
}
}
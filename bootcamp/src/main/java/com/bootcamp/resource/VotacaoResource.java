package com.bootcamp.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/votacoes")
public class VotacaoResource {

	@GetMapping
	public String index() {
		return "Primeiro Test";
	}

}

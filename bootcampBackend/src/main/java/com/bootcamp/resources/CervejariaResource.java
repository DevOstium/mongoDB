package com.bootcamp.resources;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.bootcamp.model.Votacao;
import com.bootcamp.services.VotacaoService;

@RestController
@RequestMapping("/cervejarias")
public class CervejariaResource {

	@Autowired
	private VotacaoService votacaoService;

	@GetMapping
	public ResponseEntity<String> findALl() {
		return ResponseEntity.ok().body("Primeiro return");
	}

	@PostMapping
	public ResponseEntity<Void> insert(@Valid @RequestBody Votacao votacao) {

		votacao = votacaoService.create(votacao);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(votacao.getId())
				.toUri();
		return ResponseEntity.created(uri).build();
	}
}

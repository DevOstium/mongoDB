package com.bootcamp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bootcamp.model.Votacao;
import com.bootcamp.repositories.VotacaoRepository;

@Service
public class VotacaoService {

	@Autowired
	private VotacaoRepository votacaoRepository;

	public Votacao create(Votacao votacao) {
		return votacaoRepository.save(votacao);
	}

	public Votacao findById(String id) {
		return votacaoRepository.findById(id).orElse(null);
	}

	public String getAlgo() {
		return "nada";
	}

}

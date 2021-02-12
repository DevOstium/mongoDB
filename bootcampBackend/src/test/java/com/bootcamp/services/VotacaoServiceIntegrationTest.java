package com.bootcamp.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.bootcamp.model.Votacao;
import com.bootcamp.repositories.VotacaoRepository;

@ExtendWith(SpringExtension.class)
@DataMongoTest
class VotacaoServiceIntegrationTest {

	@Autowired
	private VotacaoRepository votacaoRepository;

	@Test
	void test() {

		Votacao votacao = new Votacao(null, "usuario@usuario.com", 45, 5);

		votacaoRepository.save(votacao);

		List<Votacao> findAll = votacaoRepository.findAll();

		System.out.println("Result:" + findAll.size());

		assertEquals(1, findAll.size());

	}

}

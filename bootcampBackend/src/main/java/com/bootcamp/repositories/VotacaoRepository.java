package com.bootcamp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bootcamp.model.Votacao;

@Repository
public interface VotacaoRepository extends MongoRepository<Votacao, String> {

}

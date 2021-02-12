package com.bootcamp.services;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.bootcamp.repositories.VotacaoRepository;

@SpringBootTest
class VotacaoServiceTest {

	@Mock
	private VotacaoRepository votacaoRepository;

	@InjectMocks
	private VotacaoService votacaoService;
	
	@BeforeEach
	public void setup() {
		
	}
	
	@Test
	public void test() {
		
		when(votacaoRepository.findById("1")).thenReturn(null);
		
		
	}
}

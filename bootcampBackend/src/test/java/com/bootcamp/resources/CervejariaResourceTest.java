package com.bootcamp.resources;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import com.bootcamp.services.VotacaoService;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ExtendWith(MockitoExtension.class)
class CervejariaResourceTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;
	
	@Mock
	private VotacaoService votacaoService;
	
	@InjectMocks
	private CervejariaResource cervejariaResource; 
	

	@BeforeAll
	public void setup() {
	}
	
	@Test
	public void getHello() throws Exception {

		ResponseEntity<String> response = restTemplate
				.getForEntity(new URL("http://localhost:" + port + "/cervejarias").toString(), String.class);
		assertEquals("Primeiro return", response.getBody());

	}

}

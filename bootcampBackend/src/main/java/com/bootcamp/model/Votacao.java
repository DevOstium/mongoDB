package com.bootcamp.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Votacao {

	@Id
	private String id;
	
	@NotEmpty(message = "Is required - should be not empty")
	private String usuarioEmail;
	
	@NotNull(message = "Is required - should be not null")
	private Integer cervejariaId;

	@NotNull(message = "Is required - should not be null")
	@Range(min = 1, max = 5, message = "Is required - should be between 1 and 5")
	private Integer voto;

	public Votacao() {
	}

	public Votacao(String id, String usuarioEmail, Integer cervejariaId, Integer voto) {
		this.id = id;
		this.usuarioEmail = usuarioEmail;
		this.cervejariaId = cervejariaId;
		this.voto = voto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsuarioEmail() {
		return usuarioEmail;
	}

	public void setUsuarioEmail(String usuarioEmail) {
		this.usuarioEmail = usuarioEmail;
	}

	public Integer getCervejariaId() {
		return cervejariaId;
	}

	public void setCervejariaId(Integer cervejariaId) {
		this.cervejariaId = cervejariaId;
	}

	public Integer getVoto() {
		return voto;
	}

	public void setVoto(Integer voto) {
		this.voto = voto;
	}

}

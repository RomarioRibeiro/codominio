package com.romrio.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonView;
import com.romrio.domain.Seguranca;
import com.romrio.dto.views.SegurancaViews;

public class SegurancaDto {

	private Integer id;
	@JsonView(SegurancaViews.Resumo1.class)
	private String nome;
	@JsonView(SegurancaViews.Resumo1.class)
	private String cpf;
	private Date dataAdmisao;
	
	public SegurancaDto() {
		super();
	}

	public SegurancaDto(Integer id, String nome, String cpf, Date dataAdmisao) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataAdmisao = dataAdmisao;
	}

	public SegurancaDto(Seguranca obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.cpf = obj.getCpf();
		this.dataAdmisao = obj.getDataAdmisao();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataAdmisao() {
		return dataAdmisao;
	}

	public void setDataAdmisao(Date dataAdmisao) {
		this.dataAdmisao = dataAdmisao;
	}
	
	
	
}

package com.romrio.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.romrio.domain.Condominio;
import com.romrio.dto.views.CondominioViews;

public class CondominioDto {

	
	private int id;
	private Integer cnpj;
	
	private int idEnd;
	private String logrador;
	
	private String bairro;
	private String complemento;
	private String cep;
	private String cidade;
	private String UF;
	
	public CondominioDto() {
		super();
	}

	public CondominioDto(int id, Integer cnpj, int idEnd, String logrador, String bairro, String complemento,
			String cep, String cidade, String uF) {
		super();
		this.id = id;
		this.cnpj = cnpj;
		this.idEnd = idEnd;
		this.logrador = logrador;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cep = cep;
		this.cidade = cidade;
		this.UF = UF;
	}

	public CondominioDto(Condominio obj) {
		this.id = obj.getId();
		this.cnpj = obj.getCnpj();
		this.idEnd =obj.getEnd().getId();
		this.logrador = obj.getEnd().getLogrador();
		this.bairro = obj.getEnd().getBairro();
		this.complemento = obj.getEnd().getComplemento();
		this.cep = obj.getEnd().getCep();
		this.cidade = obj.getEnd().getCidade();
		this.UF = obj.getEnd().getUF();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	public int getIdEnd() {
		return idEnd;
	}

	public void setIdEnd(int idEnd) {
		this.idEnd = idEnd;
	}

	public String getLogrador() {
		return logrador;
	}

	public void setLogrador(String logrador) {
		this.logrador = logrador;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}
	
	
	
}

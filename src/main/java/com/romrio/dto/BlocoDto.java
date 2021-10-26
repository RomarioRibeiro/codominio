package com.romrio.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.romrio.domain.Bloco;
import com.romrio.domain.Condominio;
import com.romrio.domain.Endereco;
import com.romrio.dto.views.BlocoViews;

public class BlocoDto {
	@JsonView(BlocoViews.Resumo1.class)
	private Integer id;
	@JsonView(BlocoViews.Resumo1.class)
	private String descricao;
	private Condominio idCondominio;
	private Integer cnpj;
	@JsonView(BlocoViews.Resumo1.class)
	private Endereco idEndereco;
	@JsonView(BlocoViews.Resumo1.class)
	private String logrador;
	@JsonView(BlocoViews.Resumo1.class)
	private String bairro;
	@JsonView(BlocoViews.Resumo1.class)
	private String complemento;
	@JsonView(BlocoViews.Resumo1.class)
	private String cep;
	@JsonView(BlocoViews.Resumo1.class)
	private String cidade;
	@JsonView(BlocoViews.Resumo1.class)
	private String UF;
	
	public BlocoDto() {
		super();
	}

	public BlocoDto(Integer id, String descricao, Condominio idCondominio, Integer cnpj, Endereco idEndereco,
			String logrador, String bairro, String complemento, String cep, String cidade, String uF) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.idCondominio = idCondominio;
		this.cnpj = cnpj;
		this.idEndereco = idEndereco;
		this.logrador = logrador;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cep = cep;
		this.cidade = cidade;
		UF = uF;
	}

	public BlocoDto(Bloco obj) {
		this.id = id;
		this.descricao = descricao;
		this.idCondominio = idCondominio;
		this.cnpj = cnpj;
		this.idEndereco = idEndereco;
		this.logrador = logrador;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cep = cep;
		this.cidade = cidade;
		this.UF =UF;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Condominio getIdCondominio() {
		return idCondominio;
	}

	public void setIdCondominio(Condominio idCondominio) {
		this.idCondominio = idCondominio;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Endereco idEndereco) {
		this.idEndereco = idEndereco;
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

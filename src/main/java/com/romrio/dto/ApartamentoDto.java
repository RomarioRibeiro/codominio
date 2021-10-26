package com.romrio.dto;


import com.fasterxml.jackson.annotation.JsonView;
import com.romrio.domain.Apartamento;
import com.romrio.dto.views.ApartamentoViews;

public class ApartamentoDto {
	@JsonView(ApartamentoViews.Resumo1.class)
	private Integer id;
	private int numero;
	@JsonView(ApartamentoViews.Resumo1.class)
	private int idBloco;
	private String descricao;
	@JsonView(ApartamentoViews.Resumo1.class)
	private int idCondominio;
	private Integer cnpj;
	private int idEndereco;
	@JsonView(ApartamentoViews.Resumo1.class)
	private String logrador;
	private String bairro;
	private String complemento;
	@JsonView(ApartamentoViews.Resumo1.class)
	private String cep;
	private String cidade;
	private String UF;
	public ApartamentoDto() {
		super();
	}
	public ApartamentoDto(Integer id, int numero, int idBloco, String descricao, int idCondominio,
			Integer cnpj, int idEndereco, String logrador, String bairro, String complemento, String cep,
			String cidade, String uF) {
		super();
		this.id = id;
		this.numero = numero;
		this.idBloco = idBloco;
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
	public ApartamentoDto(Apartamento obj) {
		this.id = obj.getId();
		this.numero = obj.getNumero();
		this.idBloco = obj.getBloco().getId();
		this.descricao = obj.getBloco().getDescricao();
		this.idCondominio = obj.getBloco().getCondominio().getId();
		this.cnpj = obj.getBloco().getCondominio().getCnpj();
		this.idEndereco = obj.getBloco().getCondominio().getEnd().getId();
		this.logrador = obj.getBloco().getCondominio().getEnd().getLogrador();
		this.bairro = obj.getBloco().getCondominio().getEnd().getBairro();
		this.complemento = obj.getBloco().getCondominio().getEnd().getComplemento();
		this.cep = obj.getBloco().getCondominio().getEnd().getCep();
		this.cidade = obj.getBloco().getCondominio().getEnd().getCidade();
		this.UF = obj.getBloco().getCondominio().getEnd().getUF();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getIdBloco() {
		return idBloco;
	}
	public void setIdBloco(int idBloco) {
		this.idBloco = idBloco;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getIdCondominio() {
		return idCondominio;
	}
	public void setIdCondominio(int idCondominio) {
		this.idCondominio = idCondominio;
	}
	public Integer getCnpj() {
		return cnpj;
	}
	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	public int getIdEndereco() {
		return idEndereco;
	}
	public void setIdEndereco(int idEndereco) {
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

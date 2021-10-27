package com.romrio.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonView;
import com.romrio.domain.Morador;
import com.romrio.dto.views.MoradorViews;

public class MoradorDto {

	private Integer id;
	private String nome;
	@JsonView(MoradorViews.Resumo1.class)
	private String cpf;
	@JsonView(MoradorViews.Resumo1.class)
	private Date dataNasc;
	private int idApartamento;
	private int numero;
	@JsonView(MoradorViews.Resumo1.class)
	private int idBloco;
	private String  descricao;
	private int idCondominio;
	@JsonView(MoradorViews.Resumo1.class)
	private Integer cnpj;
	private int idEnd;
	private String logrador;
	private String bairro;
	private String complemento;
	private String cep;
	private String cidade;
	private String UF;
	
	public MoradorDto() {
		super();
	}

	public MoradorDto(Integer id, String nome, String cpf, Date dataNasc, int idApartamento, int numero, int idBloco,
			String descricao, int idCondominio, Integer cnpj, int idEnd, String logrador, String bairro,
			String complemento, String cep, String cidade, String uF) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.idApartamento = idApartamento;
		this.numero = numero;
		this.idBloco = idBloco;
		this.descricao = descricao;
		this.idCondominio = idCondominio;
		this.cnpj = cnpj;
		this.idEnd = idEnd;
		this.logrador = logrador;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cep = cep;
		this.cidade = cidade;
		this.UF = UF;
	}

	public MoradorDto(Morador obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.cpf = obj.getCpf();
		this.dataNasc = obj.getDataNasc();
		this.idApartamento = obj.getApatamento().getId();
		this.numero = obj.getApatamento().getNumero();
		this.idBloco = obj.getApatamento().getBloco().getId();
		this.descricao = obj.getApatamento().getBloco().getDescricao();
		this.idCondominio = obj.getApatamento().getBloco().getCondominio().getId();
		this.cnpj = obj.getApatamento().getBloco().getCondominio().getCnpj();
		this.idEnd = obj.getApatamento().getBloco().getCondominio().getEnd().getId();
		this.logrador = obj.getApatamento().getBloco().getCondominio().getEnd().getLogrador();
		this.bairro = obj.getApatamento().getBloco().getCondominio().getEnd().getBairro();
		this.complemento = obj.getApatamento().getBloco().getCondominio().getEnd().getComplemento();
		this.cep = obj.getApatamento().getBloco().getCondominio().getEnd().getCep();
		this.cidade = obj.getApatamento().getBloco().getCondominio().getEnd().getCidade();
		this.UF = obj.getApatamento().getBloco().getCondominio().getEnd().getUF();
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

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int getIdApatamento() {
		return idApartamento;
	}

	public void setIdApatamento(int idApatamento) {
		this.idApartamento = idApatamento;
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

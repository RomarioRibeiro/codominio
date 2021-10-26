package com.romrio.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonView;
import com.romrio.domain.Visitante;
import com.romrio.dto.views.VisitanteViews;

public class VisitanteDto {

	@JsonView(VisitanteViews.Resumo1.class)
	private Integer id;
	@JsonView(VisitanteViews.Resumo1.class)
	private String nome;
	private String cpf;
	private int idMorador;
	@JsonView(VisitanteViews.Resumo1.class)
	private String nome2;
	private String cpf2;
	private Date dataNasc;
	private int idApatamento;
	@JsonView(VisitanteViews.Resumo1.class)
	private int numero;
	@JsonView(VisitanteViews.Resumo1.class)
	private int idBloco;
	@JsonView(VisitanteViews.Resumo1.class)
	private String  descricao;
	private int  idCondominio;
	private Integer cnpj;
	private int End;
	@JsonView(VisitanteViews.Resumo1.class)
	private String logrador;
	private String bairro;
	private String complemento;
	private String cep;
	private String cidade;
	private String UF;
	
	public VisitanteDto() {
		super();
	}

	public VisitanteDto(Integer id, String nome, String cpf, int idMorador, String nome2, String cpf2, Date dataNasc,
			int idApatamento, int numero, int idBloco, String descricao, int idCondominio, Integer cnpj, int end,
			String logrador, String bairro, String complemento, String cep, String cidade, String uF) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.idMorador = idMorador;
		this.nome2 = nome2;
		this.cpf2 = cpf2;
		this.dataNasc = dataNasc;
		this.idApatamento = idApatamento;
		this.numero = numero;
		this.idBloco = idBloco;
		this.descricao = descricao;
		this.idCondominio = idCondominio;
		this.cnpj = cnpj;
		End = end;
		this.logrador = logrador;
		this.bairro = bairro;
		this.complemento = complemento;
		this.cep = cep;
		this.cidade = cidade;
		UF = uF;
	}

	public VisitanteDto(Visitante obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.cpf = obj.getCpf();
		this.idMorador = obj.getMorador().getId();
		this.nome2 = obj.getMorador().getNome();
		this.cpf2 = obj.getMorador().getCpf();
		this.dataNasc = obj.getMorador().getDataNasc();
		this.idApatamento = obj.getMorador().getApatamento().getId();
		this.numero = obj.getMorador().getApatamento().getNumero();
		this.idBloco = obj.getMorador().getApatamento().getBloco().getId();
		this.descricao = obj.getMorador().getApatamento().getBloco().getDescricao();
		this.idCondominio = obj.getMorador().getApatamento().getBloco().getCondominio().getId();
		this.cnpj =obj.getMorador().getApatamento().getBloco().getCondominio().getCnpj() ;
		this.End= obj.getMorador().getApatamento().getBloco().getCondominio().getEnd().getId();
		this.logrador = obj.getMorador().getApatamento().getBloco().getCondominio().getEnd().getLogrador();
		this.bairro = obj.getMorador().getApatamento().getBloco().getCondominio().getEnd().getBairro();
		this.complemento = obj.getMorador().getApatamento().getBloco().getCondominio().getEnd().getComplemento();
		this.cep = obj.getMorador().getApatamento().getBloco().getCondominio().getEnd().getCep();
		this.cidade = obj.getMorador().getApatamento().getBloco().getCondominio().getEnd().getCidade();
		this.UF = obj.getMorador().getApatamento().getBloco().getCondominio().getEnd().getUF();
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

	public int getIdMorador() {
		return idMorador;
	}

	public void setIdMorador(int idMorador) {
		this.idMorador = idMorador;
	}

	public String getNome2() {
		return nome2;
	}

	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}

	public String getCpf2() {
		return cpf2;
	}

	public void setCpf2(String cpf2) {
		this.cpf2 = cpf2;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}

	public int getIdApatamento() {
		return idApatamento;
	}

	public void setIdApatamento(int idApatamento) {
		this.idApatamento = idApatamento;
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

	public int getEnd() {
		return End;
	}

	public void setEnd(int end) {
		End = end;
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

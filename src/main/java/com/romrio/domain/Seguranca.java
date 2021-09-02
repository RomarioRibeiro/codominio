package com.romrio.domain;

import java.util.Date;

public class Seguranca {

	
	private Integer id;
	private String nome;
	private String cpf;
	private Date dataAdmisao;
	
	public Seguranca() {
		super();
	}

	public Seguranca(Integer id, String nome, String cpf, Date dataAdmisao) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.dataAdmisao = dataAdmisao;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seguranca other = (Seguranca) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seguranca [id=" + id + ", nome=" + nome + ", cpf=" + cpf + "]";
	}
	
	
	
}

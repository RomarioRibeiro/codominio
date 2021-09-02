package com.romrio.domain;

public class Bloco {

	private Integer id;
	private String  descricao;
	private Condominio condominio;
	
	public Bloco() {
		super();
	}
	public Bloco(Integer id, String descricao, Condominio condominio) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.condominio = condominio;
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
	public Condominio getCondominio() {
		return condominio;
	}
	public void setCondominio(Condominio condominio) {
		this.condominio = condominio;
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
		Bloco other = (Bloco) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Bloco [id=" + id + ", descricao=" + descricao + ", condominio=" + condominio + "]";
	}
	
	
	
}

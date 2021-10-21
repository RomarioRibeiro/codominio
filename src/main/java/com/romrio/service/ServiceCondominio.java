package com.romrio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.romrio.domain.Condominio;
import com.romrio.domain.Endereco;
import com.romrio.domain.Condominio;
import com.romrio.domain.repostory.RepositoryCondominio;

@Service
public class ServiceCondominio {
	@Autowired
	private RepositoryCondominio repo;

	public Condominio find(Integer id) {
		Condominio obj = repo.findAll(id);
		return obj;
	}

	public List<Condominio> findAll() {
		return repo.findAll();
	}

	public Condominio insert(Condominio obj) {
		
		find(obj.getId());
		return repo.save(obj);
	}

	public Condominio update(Condominio obj) {
		find(obj.getId());
		return repo.save(obj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("nao e possivel excluir um apartamento que possui condominio");
		}
	}
}

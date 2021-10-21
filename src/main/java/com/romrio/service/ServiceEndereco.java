package com.romrio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.romrio.domain.Endereco;
import com.romrio.domain.repostory.RepositoryEndereco;

@Service
public class ServiceEndereco {
	@Autowired
	private RepositoryEndereco repo;

	public Endereco find(Integer id) {
		Endereco obj = repo.findAll(id);
		return obj;
	}

	public List<Endereco> findAll() {
		return repo.findAll();
	}

	public Endereco insert(Endereco obj) {
		find(obj.getId());
		return repo.save(obj);
	}

	public Endereco update(Endereco obj) {
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
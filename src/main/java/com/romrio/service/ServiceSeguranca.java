package com.romrio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.romrio.domain.Seguranca;
import com.romrio.domain.Seguranca;
import com.romrio.domain.repostory.RepositorySeguranca;

@Service
public class ServiceSeguranca {
	@Autowired
	private RepositorySeguranca repo;

	public Seguranca find(Integer id) {
		Seguranca obj = repo.findAll(id);
		return obj;
	}

	public List<Seguranca> findAll() {
		return repo.findAll();
	}

	public Seguranca insert(Seguranca obj) {
		find(obj.getId());
		return repo.save(obj);
	}

	public Seguranca update(Seguranca obj) {
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

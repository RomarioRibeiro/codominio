package com.romrio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.romrio.domain.Visitante;
import com.romrio.domain.Visitante;
import com.romrio.domain.repostory.RepositoryVisitante;

@Service
public class ServiceVisitante {
	@Autowired
	private RepositoryVisitante repo;

	public Visitante find(Integer id) {
		Visitante obj = repo.findAll(id);
		return obj;
	}

	public List<Visitante> findAll() {
		return repo.findAll();
	}

	public Visitante insert(Visitante obj) {
		find(obj.getId());
		return repo.save(obj);
	}

	public Visitante update(Visitante obj) {
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

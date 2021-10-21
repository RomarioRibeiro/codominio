package com.romrio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.romrio.domain.Morador;
import com.romrio.domain.Morador;
import com.romrio.domain.repostory.RepositoryMorador;

@Service
public class ServiceMorador {
	@Autowired
	private RepositoryMorador repo;

	public Morador find(Integer id) {
		Morador obj = repo.findAll(id);
		return obj;
	}

	public List<Morador> findAll() {
		return repo.findAll();
	}

	public Morador insert(Morador obj) {
		find(obj.getId());
		return repo.save(obj);
	}

	public Morador update(Morador obj) {
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

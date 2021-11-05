package com.romrio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.romrio.domain.Visitante;
import com.romrio.domain.repostory.RepositoryVisitante;
import com.romrio.dto.VisitanteDto;

@Service
public class ServiceVisitante {
	@Autowired
	private RepositoryVisitante repo;

	public VisitanteDto find(Integer id) {
		Visitante obj = repo.find(id);
		VisitanteDto objDto = new VisitanteDto(obj);
		return objDto;
	}

	public List<VisitanteDto> findAll() {
		List<Visitante> obj = repo.findAll();
		List<VisitanteDto> objDto = new ArrayList<>();
		for (Visitante v : obj) {
			VisitanteDto Dto = new VisitanteDto(v);
			objDto.add(Dto);
		}
		return objDto;
	}

	public Visitante insert(Visitante obj) {
		obj.setId(null);
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

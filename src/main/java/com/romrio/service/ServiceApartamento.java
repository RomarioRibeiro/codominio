package com.romrio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.romrio.domain.Apartamento;
import com.romrio.domain.repostory.RepositoryApartamento;
import com.romrio.dto.ApartamentoDto;

@Service
public class ServiceApartamento {
	@Autowired
	private RepositoryApartamento repo;

	public ApartamentoDto find (int id) {
		Apartamento obj = repo.find(id);
		ApartamentoDto objDto = new ApartamentoDto(obj);
		return objDto;
	}

	public List<ApartamentoDto> findAll() {
		List<Apartamento> apar = repo.findAll();
		List<ApartamentoDto> aparDto = new ArrayList<>();
		for(Apartamento a : apar) {
			ApartamentoDto Dto = new ApartamentoDto(a);
			aparDto.add(Dto);
		}
		
		return aparDto;
	}

	public Apartamento insert(Apartamento obj) {
		find(obj.getId());
		return repo.save(obj);
	}

	public Apartamento update(Apartamento obj) {
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

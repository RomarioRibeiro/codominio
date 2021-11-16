package com.romrio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.romrio.domain.Apartamento;
import com.romrio.domain.Bloco;
import com.romrio.domain.repostory.RepositoryApartamento;
import com.romrio.domain.repostory.RepositoryBloco;
import com.romrio.dto.ApartamentoDto;

@Service
public class ServiceApartamento {
	@Autowired
	private RepositoryApartamento repo;

	@Autowired
	private RepositoryBloco repoBloco;

	public ApartamentoDto find(int id) {
		Apartamento obj = repo.find(id);
		ApartamentoDto objDto = new ApartamentoDto(obj);
		return objDto;
	}

	public List<ApartamentoDto> findAll() {
		List<Apartamento> apar = repo.findAll();
		List<ApartamentoDto> aparDto = new ArrayList<>();
		for (Apartamento a : apar) {
			ApartamentoDto Dto = new ApartamentoDto(a);
			aparDto.add(Dto);
		}

		return aparDto;
	}

	public Apartamento insert(ApartamentoDto obj) {
		Apartamento a = new Apartamento();
		Bloco b = repoBloco.find(obj.getIdBloco());
		a.setBloco(b);
		return repo.save(a);
	}

	public Apartamento update(ApartamentoDto obj) {
		
		Apartamento a = new Apartamento();
		Bloco b = repoBloco.find(a.getIdBloco());
		find(a.getIdBloco());
		find(a.getId());
		return repo.save(a);
	}

	

	

	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("nao e possivel excluir um apartamento que possui condominio");
		}
	}

	public Apartamento fromDto(ApartamentoDto objDto) {
		
		return new Apartamento(objDto.getId(),objDto.getIdBloco());
	}

	

	

}

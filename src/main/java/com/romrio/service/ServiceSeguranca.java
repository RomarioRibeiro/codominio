package com.romrio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.romrio.domain.Seguranca;
import com.romrio.domain.repostory.RepositorySeguranca;
import com.romrio.dto.SegurancaDto;

@Service
public class ServiceSeguranca {
	@Autowired
	private RepositorySeguranca repo;

	public SegurancaDto find(Integer id) {
		Seguranca obj = repo.find(id);
		SegurancaDto objDto = new SegurancaDto(obj);
		return objDto;
	}

	public List<SegurancaDto> findAll() {
		List<Seguranca >seguranca = repo.findAll();
		List<SegurancaDto> segurancaDto = new ArrayList<>();
		for (Seguranca s : seguranca) {
			SegurancaDto Dto = new SegurancaDto(s);
			segurancaDto.add(Dto);
		}
		return segurancaDto;
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

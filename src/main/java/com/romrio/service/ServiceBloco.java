package com.romrio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.romrio.domain.Bloco;
import com.romrio.domain.repostory.RepositoryBloco;
import com.romrio.dto.BlocoDto;

@Service
public class ServiceBloco {
	@Autowired
	private RepositoryBloco repo;

	public BlocoDto find(Integer id) {
		Bloco obj = repo.find(id);
		BlocoDto objDto = new BlocoDto(obj);
		return objDto;
	}

	public List<BlocoDto> findAll() {
		List<Bloco> bloco = repo.findAll();
		List<BlocoDto> blocoDto = new ArrayList<>();
		for(Bloco b : bloco) {
			BlocoDto Dto = new BlocoDto(b);
			blocoDto.add(Dto);
		}
				
		return blocoDto;
	}

	public Bloco insert(Bloco obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Bloco update(Bloco obj) {
		find(obj.getId());
		return repo.save(obj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("não e possivel excluir um apartamento que possui condominio");
		}
	}
}

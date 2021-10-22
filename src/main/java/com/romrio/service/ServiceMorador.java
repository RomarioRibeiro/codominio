package com.romrio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.romrio.domain.Morador;
import com.romrio.domain.repostory.RepositoryMorador;
import com.romrio.dto.MoradorDto;

@Service
public class ServiceMorador {
	@Autowired
	private RepositoryMorador repo;

	public MoradorDto find(Integer id) {
		Morador obj = repo.find(id);
		MoradorDto objDto = new MoradorDto(obj);
		
		return objDto;
	}

	public List<MoradorDto> findAll() {
		List<Morador> morador = repo.findAll();
		List<MoradorDto> moradorDto = new ArrayList<>();
		for(Morador m : morador) {
			MoradorDto dto = new MoradorDto(m);
			moradorDto.add(dto);
		}
		return moradorDto;
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

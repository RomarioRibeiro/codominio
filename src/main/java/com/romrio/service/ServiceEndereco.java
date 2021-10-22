package com.romrio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.romrio.domain.Endereco;
import com.romrio.domain.repostory.RepositoryEndereco;
import com.romrio.dto.EnderecoDto;

@Service
public class ServiceEndereco {
	@Autowired
	private RepositoryEndereco repo;

	public EnderecoDto find (Integer id) {
		Endereco obj = repo.find(id);
		EnderecoDto objDto = new EnderecoDto(obj);
		
		return objDto;
	}

	public List<EnderecoDto> findAll() {
		List<Endereco> obj = repo.findAll();
		List<EnderecoDto> objDto = new ArrayList<>();
		for( Endereco e : obj) {
			EnderecoDto Dto = new EnderecoDto(e);
			objDto.add(Dto);
		}
		return objDto;
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
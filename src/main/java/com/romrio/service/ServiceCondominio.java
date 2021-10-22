package com.romrio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.romrio.domain.Condominio;
import com.romrio.domain.repostory.RepositoryCondominio;
import com.romrio.dto.CondominioDto;

@Service
public class ServiceCondominio {
	@Autowired
	private RepositoryCondominio repo;

	public CondominioDto find(Integer id) {
		Condominio obj = repo.find(id);
		CondominioDto objDto = new CondominioDto(obj);
		return objDto;
	}

	public List<CondominioDto> findAll() {
		List<Condominio> condominio = repo.findAll();
		List<CondominioDto> condominioDto = new ArrayList<>();
		for(Condominio c : condominio) {
			CondominioDto Dto = new CondominioDto(c);
			condominioDto.add(Dto);
		}
		return condominioDto;
	}

	public Condominio insert(Condominio obj) {
		
		find(obj.getId());
		return repo.save(obj);
	}

	public Condominio update(Condominio obj) {
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

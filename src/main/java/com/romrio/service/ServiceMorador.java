package com.romrio.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.romrio.domain.Apartamento;
import com.romrio.domain.Endereco;
import com.romrio.domain.Morador;
import com.romrio.domain.repostory.RepositoryMorador;
import com.romrio.dto.MoradorDto;
import com.romrio.dto.MoradorNewDTO;

@Service
public class ServiceMorador {
	@Autowired
	private RepositoryMorador repo;

	public Morador find(Integer id) {
		Morador obj = repo.find(id);
		MoradorDto objDto = new MoradorDto(obj);
		
		return obj;
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
		obj.setId(null);
		return repo.save(obj);
	}

	public Morador update(Morador obj) {
	Morador	newobj = find(obj.getId());
		update (newobj, obj); 
		return repo.save(newobj);
	}

	private void update(Morador newobj, Morador obj) {
		newobj.setNome(obj.getNome());
		
	}

	
	

	public void delete(Integer id) {
		find(id);
		try {
			repo.deleteById(id);
		} catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("nao e possivel excluir um apartamento que possui condominio");
		}

	}

	
	public Morador fromDTO(MoradorNewDTO objDTo) {
		Morador mor = new Morador(null, objDTo.getNome(), objDTo.getCpf(), objDTo.getDataNasc(), null);
		Endereco end = new Endereco(null, objDTo.getLogrador(), objDTo.getBairro(), objDTo.getComplemento(), objDTo.getCep(), objDTo.getCidade(), objDTo.getUF());
		
		return mor;
	}
	
}

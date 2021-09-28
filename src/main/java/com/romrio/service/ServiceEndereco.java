package com.romrio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romrio.domain.Endereco;
import com.romrio.domain.repostory.RepositoryEndereco;

@Service
public class ServiceEndereco {
	@Autowired
	private RepositoryEndereco repo;
	
	public Endereco find(Integer id) {
		Endereco obj = repo.findAll(id);
				return obj;
	}
	public Endereco Insert (Endereco obj) {
		obj.setId(null);
		return repo.save(obj);
	}
	public List<Endereco> findAll(){
		return repo.findAll();	
	}
	
}

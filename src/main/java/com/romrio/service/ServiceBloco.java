package com.romrio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romrio.domain.Bloco;
import com.romrio.domain.repostory.RepositoryBloco;

@Service
public class ServiceBloco {
	@Autowired
	private RepositoryBloco repo;
	
	public Bloco find(Integer id) {
		Bloco obj = repo.findAll(id);
				return obj;
	}
	public List<Bloco> findAll(){
		return repo.findAll();
	}
}

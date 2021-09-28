package com.romrio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romrio.domain.Visitante;
import com.romrio.domain.repostory.RepositoryVisitante;

@Service
public class ServiceVisitante {
	@Autowired
	private RepositoryVisitante repo;
	
	public Visitante find(Integer id) {
		Visitante obj = repo.findAll(id);
				return obj;
	}
	public List<Visitante> findAll(){
		return repo.findAll();
	}
}

package com.romrio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romrio.domain.Condominio;
import com.romrio.domain.repostory.RepositoryCondominio;

@Service
public class ServiceCondominio {
	@Autowired
	private RepositoryCondominio repo;
	
	public Condominio find(Integer id) {
		Condominio obj = repo.findAll(id);
				return obj;
	}
	public List<Condominio> findAll(){
		return repo.findAll();
	}
}

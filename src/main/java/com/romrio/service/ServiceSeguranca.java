package com.romrio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romrio.domain.Seguranca;
import com.romrio.domain.repostory.RepositorySeguranca;

@Service
public class ServiceSeguranca {
	@Autowired
	private RepositorySeguranca repo;
	
	public Seguranca find(Integer id) {
		Seguranca obj = repo.findAll(id);
				return obj;
	}
	public List<Seguranca> findAll(){
		return repo.findAll();
	}
}

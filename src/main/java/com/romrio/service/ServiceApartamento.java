package com.romrio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.romrio.domain.Apartamento;
import com.romrio.domain.repostory.RepositoryApartamento;


@Service
public class ServiceApartamento {
	@Autowired
	private RepositoryApartamento repo;
	
	public Apartamento find(Integer id) {
		Apartamento obj = repo.findAll(id);
				return obj;
	}
	
	public List <Apartamento> findAll(){
		return repo.findAll();
	}
	public Apartamento insert( Apartamento obj) {
		find(obj.getId());
		return repo.save(obj);
	}
	 public Apartamento update(Apartamento obj) {
		 find (obj.getId());
		 return repo.save(obj);
	 }
	 
	 public void delete (Integer id) {
		 find(id);
		try {
			repo.deleteById(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityViolationException("nao e possivel excluir um apartamento que possui condominio");
		}
	 }
	 
}

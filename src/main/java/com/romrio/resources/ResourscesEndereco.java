package com.romrio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.romrio.domain.Endereco;
import com.romrio.service.ServiceEndereco;

@RestController
@RequestMapping(value = "/endereco")
public class ResourscesEndereco {
	@Autowired
	private ServiceEndereco service;
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id ){
		
		Endereco obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	public ResponseEntity<List <Endereco>> findAll(){
		List <Endereco> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}

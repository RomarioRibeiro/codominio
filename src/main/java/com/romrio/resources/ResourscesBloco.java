package com.romrio.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.romrio.domain.Bloco;
import com.romrio.service.ServiceBloco;

@RestController
@RequestMapping(value = "/bloco")
public class ResourscesBloco {
	@Autowired
	private ServiceBloco service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {

		Bloco obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List <Bloco>>findAll(){
		List <Bloco> list =service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
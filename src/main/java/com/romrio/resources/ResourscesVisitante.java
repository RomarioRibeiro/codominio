package com.romrio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.romrio.domain.Visitante;
import com.romrio.service.ServiceVisitante;

@RestController
@RequestMapping(value = "/visitante")
public class ResourscesVisitante {
	@Autowired
	private ServiceVisitante service;
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id ){
		
		Visitante obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List <Visitante>> findAll(){
		List<Visitante> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}

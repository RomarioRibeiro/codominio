package com.romrio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.romrio.domain.Seguranca;
import com.romrio.service.ServiceSeguranca;

@RestController
@RequestMapping(value = "/seguranca")
public class ResourscesSeguranca {
	@Autowired
	private ServiceSeguranca service;
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id ){
		
		Seguranca obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List <Seguranca>> findAll(){
		List <Seguranca> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}

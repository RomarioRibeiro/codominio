package com.romrio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.romrio.domain.Condominio;
import com.romrio.service.ServiceCondominio;

@RestController
@RequestMapping(value = "/condominio")
public class ResourscesCondominio {
	@Autowired
	private ServiceCondominio service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {

		Condominio obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List <Condominio>>findAll(){
		List <Condominio> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}

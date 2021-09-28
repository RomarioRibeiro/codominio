package com.romrio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.romrio.domain.Morador;
import com.romrio.service.ServiceMorador;

@RestController
@RequestMapping(value = "/morador")
public class ResourscesMorador {
	@Autowired
	private ServiceMorador service;
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id ){
		
		Morador obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	public ResponseEntity<List <Morador>> findAll(){
		List <Morador> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}

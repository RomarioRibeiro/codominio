package com.romrio.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fasterxml.jackson.annotation.JsonView;
import com.romrio.domain.Condominio;
import com.romrio.dto.CondominioDto;
import com.romrio.dto.views.CondominioViews;
import com.romrio.service.ServiceCondominio;

@RestController
@RequestMapping(value = "/condominio")
public class ResourscesCondominio {
	@Autowired
	private ServiceCondominio service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {

		CondominioDto objDto = service.find(id);
		return ResponseEntity.ok().body(objDto);
	}
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert (@RequestBody Condominio obj){
		 obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	@RequestMapping(value = "/{id}",method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Condominio obj, @PathVariable Integer id){
		obj.setId(id);
		obj=service.update(obj);
		return ResponseEntity.noContent().build();
	}
	@RequestMapping(value= "/{id}",method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete (@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	@RequestMapping(method = RequestMethod.GET)

	public ResponseEntity<List <CondominioDto>>findAll(){
		List <CondominioDto> listDto = service.findAll();
		return ResponseEntity.ok().body(listDto);
	}
}

package org.generation.blogpessoal.controller;

import java.util.List;

import org.generation.blogpessoal.model.postagem;
import org.generation.blogpessoal.repository.postagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postagem")
@CrossOrigin("*")
public class postagemController {

	@Autowired
	private postagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<postagem>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
}

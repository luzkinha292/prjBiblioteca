package com.lucas.test.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.test.entities.Livro;
import com.lucas.test.services.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {
	private final LivroService livroService;
	
	@Autowired
	public LivroController(LivroService livroService) {
		this.livroService = livroService;
	}
	
	@PostMapping
	public Livro createLivro(@RequestBody Livro livro) {
		return livroService.saveLivro(livro);
	}
	
	@GetMapping
	public List<Livro> getAllLivros(){
		return livroService.getAllLivro();
	}
	
	@GetMapping("/{id}")
	public Livro getLivroById(@PathVariable Long id) {
		return livroService.getLivroById(id);
	}
}	

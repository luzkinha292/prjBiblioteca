package com.lucas.test.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucas.test.entities.Livro;
import com.lucas.test.repositories.LivroRepository;

@Service
public class LivroService {
	
	private final LivroRepository livroRepository;
	
	@Autowired
	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}
	
	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);
	}
	
	public Livro getLivroById(Long id) {
		return livroRepository.findById(id).orElse(null);
	}
	
	public List<Livro> getAllLivro(){
		return livroRepository.findAll();
	}
	
	
}	

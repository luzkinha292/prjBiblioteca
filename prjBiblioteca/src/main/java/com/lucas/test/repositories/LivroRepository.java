package com.lucas.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.test.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}

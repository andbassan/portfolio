package com.sabstec.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sabstec.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long> {

}

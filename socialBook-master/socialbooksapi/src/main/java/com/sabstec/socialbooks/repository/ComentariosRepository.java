package com.sabstec.socialbooks.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sabstec.socialbooks.domain.Comentario;

public interface ComentariosRepository extends JpaRepository<Comentario, Long> {

}

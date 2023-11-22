package com.projeto.integrado.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projeto.integrado.entity.Recurso;

@Repository
public interface RecursoRepository extends JpaRepository<Recurso, Integer> {
	
	@Query("SELECT r FROM Recurso r WHERE r.nome = :nome")
    public List<Recurso> findByNome(String nome);
}
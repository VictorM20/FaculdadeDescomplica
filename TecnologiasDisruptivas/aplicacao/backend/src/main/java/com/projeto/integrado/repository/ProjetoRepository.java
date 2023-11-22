package com.projeto.integrado.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projeto.integrado.entity.Projeto;
@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {
	
	@Query("SELECT p FROM Projeto p WHERE p.descricao = :descricao")
    public List<Projeto> findByDescricao(String descricao);
}
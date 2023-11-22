package com.projeto.integrado.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projeto.integrado.entity.StatusTarefa;
import com.projeto.integrado.entity.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Integer> {
	
	@Query("SELECT t FROM Tarefa t WHERE t.status = :status")
    public List<Tarefa> findByStatus(StatusTarefa status);
}
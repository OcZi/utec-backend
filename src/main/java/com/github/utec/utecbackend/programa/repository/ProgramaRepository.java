package com.github.utec.utecbackend.programa.repository;

import com.github.utec.utecbackend.programa.domain.Programa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramaRepository extends JpaRepository<Programa, Long> {
}

package br.com.residencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.residencia.entity.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer>{

}

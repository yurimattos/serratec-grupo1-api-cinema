package br.com.residencia.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.residencia.cinema.entity.Filme;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer>{

}

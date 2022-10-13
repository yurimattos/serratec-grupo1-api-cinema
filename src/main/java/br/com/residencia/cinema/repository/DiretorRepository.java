package br.com.residencia.cinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.residencia.cinema.entity.Diretor;

@Repository
public interface DiretorRepository extends JpaRepository<Diretor, Integer>{
	
}

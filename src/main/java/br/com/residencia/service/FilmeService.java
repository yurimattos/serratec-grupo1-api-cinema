package br.com.residencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.residencia.entity.Filme;
import br.com.residencia.repository.FilmeRepository;

@Service
public class FilmeService {
	@Autowired
	FilmeRepository filmeRepository;
	
	public List<Filme> getAllFilmes(){
		return filmeRepository.findAll();
	}
	
	public Filme getFilmeById(Integer id) {
		return filmeRepository.findById(id).orElse(null);
	}
	
	public Filme saveFilme(Filme filme) {
		return filmeRepository.save(filme);
	}
	
	public Filme updateFilme(Filme filme, Integer id) {
		Filme filmeAtual = getFilmeById(id);
		
		filmeAtual.setNomeBr(filme.getNomeBr());
		filmeAtual.setNomeEn(filme.getNomeEn());
		filmeAtual.setAnoLancamento(filme.getAnoLancamento());
		filmeAtual.setSinopse(filme.getSinopse());

		return filmeRepository.save(filmeAtual);
	}
	
	public Filme deleteFilme(Integer id) {
		filmeRepository.deleteById(id);
		
		return getFilmeById(id);
	}
}
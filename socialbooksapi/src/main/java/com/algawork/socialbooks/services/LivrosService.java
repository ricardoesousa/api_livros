package com.algawork.socialbooks.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.algaworks.socialbook.services.exceptions.LivroNaoEncontradoException;
import com.algaworks.socialbooks.domain.Livro;
import com.algaworks.socialbooks.repository.LivrosRepository;

@Service
public class LivrosService {

	@Autowired
	private LivrosRepository livrosRepository;

	public List<Livro> listar() {
		return livrosRepository.findAll();
	}

	public Livro buscar(Long id) {
		Livro livro = livrosRepository.findById(id).get();
		if (livro == null) {
			throw new LivroNaoEncontradoException("o livro não pode ser encontrado");
		}
		return livro;
	}

	public Livro salvar(Livro livro) {
		livro.setId(null);
		return livrosRepository.save(livro);
	}

	public void deletar(Long id) {
		try {
			livrosRepository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new LivroNaoEncontradoException("O livro não pode ser encontrado");
		}
	}
	
	public void atualizar (Livro livro) {
		verificarExistencia(livro);
		livrosRepository.save(livro);
	}
	
	private void verificarExistencia(Livro livro) {
		buscar(livro.getId());
	}
}

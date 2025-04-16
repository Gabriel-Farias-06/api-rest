package me.dio.service.imp;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.domain.model.Livro;
import me.dio.domain.repository.LivroRepository;
import me.dio.service.LivroService;

@Service
public class LivroServiceImp implements LivroService {
	
	private final LivroRepository livroRepository;

	public LivroServiceImp(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}

	@Override
	public Livro findById(int id) {
		return livroRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public Livro create(Livro novoLivro) {
		if(livroRepository.existsById(novoLivro.getId()))
			throw new IllegalArgumentException("Esse ID de livro já foi cadastrado");
		return livroRepository.save(novoLivro);
	}

}

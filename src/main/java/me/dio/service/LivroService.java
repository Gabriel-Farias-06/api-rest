package me.dio.service;

import me.dio.domain.model.Livro;

public interface LivroService {
	Livro findById(int id);
	
	Livro create(Livro novoLivro);

	void deleteById(int id);
}

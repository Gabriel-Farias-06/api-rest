package me.dio.controller;

	import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import me.dio.domain.model.Livro;
import me.dio.service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {
	private final LivroService livroService;

	public LivroController(LivroService livroService) {
		this.livroService = livroService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Livro> findById(@PathVariable int id) {
		 return ResponseEntity.ok(livroService.findById(id));
	}
	
	@PostMapping
	public ResponseEntity<Livro> create(@RequestBody Livro novoLivro) {
		Livro livroCriado = livroService.create(novoLivro);
		URI localizacao = ServletUriComponentsBuilder.fromCurrentRequest().
				path("/{id}").
				buildAndExpand(livroCriado.getId()).
				toUri();
		 return ResponseEntity.created(localizacao).body(livroCriado);
	}
}

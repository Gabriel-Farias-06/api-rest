package me.dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.domain.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
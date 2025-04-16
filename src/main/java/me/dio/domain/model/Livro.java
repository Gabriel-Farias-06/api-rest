


package me.dio.domain.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity(name = "tb_livro")
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String titulo;
    private String descricao;
    private int idadeLeitura;
    private int numeroPaginas;
    private String autor;
    private String editora;
    
    @Column(precision = 5)
    private double preco;
    private double desconto;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Avaliacao> avaliacoes = new ArrayList<>();
    
	public int getId() {
		return id;
	}

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}
	
	public void adicionarAvaliacao(Avaliacao avaliacao) {
		this.avaliacoes.add(avaliacao);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getIdadeLeitura() {
		return idadeLeitura;
	}

	public void setIdadeLeitura(int idadeLeitura) {
		this.idadeLeitura = idadeLeitura;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
    
    
}

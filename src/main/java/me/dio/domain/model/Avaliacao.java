package me.dio.domain.model;
import jakarta.persistence.*;
@Entity(name = "tb_avaliacao")
public class Avaliacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int estrelas;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Cliente cliente;
	
	public int getEstrelas() {
		return estrelas;
	}
	public void setEstrelas(int estrelas) {
		this.estrelas = estrelas;
	}
	public int getId() {
		return id;
	}
	public Cliente getCliente() {
		return cliente;
	}
}

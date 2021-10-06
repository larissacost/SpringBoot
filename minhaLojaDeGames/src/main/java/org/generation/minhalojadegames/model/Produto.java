package org.generation.minhalojadegames.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "O atributo nome é Obrigatório!")
	@Size(min = 2, max = 255, message = "O atributo nome deve conter no mínimo 2 e no máximo 255 caracteres")
	private String nome;
	
	@NotNull
	@Min(0)
	private int qtd_de_produto;
	
	@Positive
	@Digits(integer = 4 ,fraction = 2,message = "O preço aceita só 2 casa depois da virgula por padrão da moeda Real")
	private BigDecimal preço;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQtd_de_produto() {
		return qtd_de_produto;
	}

	public void setQtd_de_produto(int qtd_de_produto) {
		this.qtd_de_produto = qtd_de_produto;
	}

	public BigDecimal getPreço() {
		return preço;
	}

	public void setPreço(BigDecimal preço) {
		this.preço = preço;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

}

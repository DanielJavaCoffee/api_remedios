package com.api.remedio.api_remedios.remedio;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.api.remedio.api_remedios.enuns.Laboratorio;
import com.api.remedio.api_remedios.enuns.Via;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Remedio implements Serializable {


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private LocalDate dataDeValidade;
	private boolean ativo;
	private double preco;
	private int quantidade;
	private Laboratorio laboratorio;
	private Via via;
	
	public Remedio() {
	}

	public Remedio(String nome, LocalDate dataDeValidade, double preco, int quantidade, Laboratorio laboratorio, Via via) {
		super();
		this.nome = nome;
		this.dataDeValidade = dataDeValidade;
		this.ativo = true;
		this.preco = preco;
		this.quantidade = quantidade;
		this.laboratorio = laboratorio;
		this.via = via;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Remedio other = (Remedio) obj;
		return Objects.equals(id, other.id);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataDeValidade() {
		return dataDeValidade;
	}

	public void setDataDeValidade(LocalDate dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	public Via getVia() {
		return via;
	}

	public void setVia(Via via) {
		this.via = via;
	}

	public Long getId() {
		return id;
	}	
}

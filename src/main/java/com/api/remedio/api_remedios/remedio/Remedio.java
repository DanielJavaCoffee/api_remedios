package com.api.remedio.api_remedios.remedio;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import com.api.remedio.api_remedios.dto.DadosCadastroRemedios;
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
	private LocalDate validade;
	private boolean ativo;
	private double preco;
	private int quantidade;
	private String lote;
	private Laboratorio laboratorio;
	private Via via;

	public Remedio() {
	}

	public Remedio(String nome, Via via, String lote, int quantidade, LocalDate validade, Laboratorio laboratorio,
			double preco) {
		super();
		this.nome = nome;
		this.validade = validade;
		this.ativo = true;
		this.preco = preco;
		this.quantidade = quantidade;
		this.lote = lote;
		this.laboratorio = laboratorio;
		this.via = via;
	}

	public Remedio(DadosCadastroRemedios dados) {
		this.nome = dados.nome();
		this.validade = dados.validade();
		this.ativo = true;
		this.preco = dados.preco();
		this.quantidade = dados.quantidade();
		this.lote = dados.lote();
		this.laboratorio = dados.laboratorio();
		this.via = dados.via();
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

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
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

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
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

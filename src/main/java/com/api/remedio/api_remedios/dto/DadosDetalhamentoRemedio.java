package com.api.remedio.api_remedios.dto;

import java.time.LocalDate;

import com.api.remedio.api_remedios.enuns.Laboratorio;
import com.api.remedio.api_remedios.enuns.Via;
import com.api.remedio.api_remedios.remedio.Remedio;

public record DadosDetalhamentoRemedio(
		Long id,
		
		String nome,
		
		LocalDate dataDeValidade,
		
		double preco,
		
		int quantidade,
		
		String lote,
		
		Laboratorio laboratorio,
		
		Via via
		) {
	public DadosDetalhamentoRemedio(Remedio remedio) {
		this(
				remedio.getId(),
				remedio.getNome(),
				remedio.getValidade(),
				remedio.getPreco(),
				remedio.getQuantidade(),
				remedio.getLote(),
				remedio.getLaboratorio(),
				remedio.getVia()
				);
	} // end construct
} // end class

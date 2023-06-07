package com.api.remedio.api_remedios.dto;

import java.time.LocalDate;

import com.api.remedio.api_remedios.enuns.Laboratorio;
import com.api.remedio.api_remedios.enuns.Via;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroRemedios(
		
		@NotBlank
		String nome,

		@Enumerated
		Via via,
		
		@NotBlank
		String lote,
		
		@NotNull
		int quantidade,
		
		@Future
		LocalDate validade,
		
		@Enumerated
		Laboratorio laboratorio,
		
		@NotNull
		double preco
		) {
}

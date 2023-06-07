package com.api.remedio.api_remedios.dto;

import java.time.LocalDate;

import com.api.remedio.api_remedios.enuns.Laboratorio;
import com.api.remedio.api_remedios.enuns.Via;

import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;

//import jakarta.validation.constraints.NotBlank;

public record DadosCadastroRemedios(
		
		@NotBlank
		String nome,
		
		@Future
		LocalDate dataDeValidade,
		
		@NotBlank
		double preco,
		
		@NotBlank
		int quantidade,
		
		@NotBlank
		String lote,
		
		@Enumerated
		Laboratorio laboratorio,
		
		@Enumerated
		Via via
		) {
}

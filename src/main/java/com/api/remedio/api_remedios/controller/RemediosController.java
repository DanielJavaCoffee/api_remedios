package com.api.remedio.api_remedios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.api.remedio.api_remedios.dto.DadosCadastroRemedios;
import com.api.remedio.api_remedios.dto.DadosDetalhamentoRemedio;
import com.api.remedio.api_remedios.remedio.Remedio;
import com.api.remedio.api_remedios.repository.RemedioRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/remedios")
public class RemediosController {

	@Autowired
	private RemedioRepository remedioRepository;

	@PostMapping("/cadastro")
	public ResponseEntity<DadosDetalhamentoRemedio> createRemedios(@RequestBody @Valid DadosCadastroRemedios dados,
			UriComponentsBuilder uriBuilder) {
		var remedio = new Remedio(dados);
		remedioRepository.save(remedio);
		var uri = uriBuilder.path("/remedios/{id}").buildAndExpand(remedio.getId()).toUri();
		return ResponseEntity.created(uri).body(new DadosDetalhamentoRemedio(remedio));
	}
}

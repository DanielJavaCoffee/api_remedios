package com.api.remedio.api_remedios.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.remedio.api_remedios.dto.DadosCadastroRemedios;
import com.api.remedio.api_remedios.repository.RemedioRepository;

@Service
public class RemediosService {
	
	private RemedioRepository remedioRepository;
	
	private ResponseEntity<DadosCadastroRemedios> createRemedios(){
		return null;
	}

}

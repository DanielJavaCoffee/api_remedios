package com.api.remedio.api_remedios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.remedio.api_remedios.remedio.Remedio;

public interface RemedioRepository extends JpaRepository<Remedio, Long> {
}

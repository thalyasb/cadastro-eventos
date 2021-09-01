package com.br.cadastroeventos.repository;

import org.springframework.data.repository.CrudRepository;

import com.br.cadastroeventos.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String>{

	Evento findByCodigo(long codigo);
}

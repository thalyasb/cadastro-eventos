package com.br.cadastroeventos.repository;

import org.springframework.data.repository.CrudRepository;

import com.br.cadastroeventos.models.Convidado;
import com.br.cadastroeventos.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
}

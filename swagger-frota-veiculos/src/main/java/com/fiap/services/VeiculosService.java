package com.fiap.services;

import java.util.List;
import java.util.Optional;

import com.fiap.models.Veiculos;

public interface VeiculosService {
	
	List<Veiculos> listar() ;

	Veiculos salvar(Veiculos veiculos);
	
	Optional<Veiculos> buscarPorId(Long id);
	
}

package com.fiap.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.models.Veiculos;
import com.fiap.repository.VeiculosRepository;
import com.fiap.services.VeiculosService;

@Service
public class VeiculosServiceImpl implements VeiculosService{

	@Autowired
	private VeiculosRepository veiculosRepository;
	
	@Override
	public List<Veiculos> listar() {
		return veiculosRepository.findAll();
	}

	@Override
	public Veiculos salvar(Veiculos veiculos) {
		return veiculosRepository.save(veiculos);
	}

	@Override
	public Optional<Veiculos> buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}

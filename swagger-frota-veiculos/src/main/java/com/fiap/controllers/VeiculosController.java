package com.fiap.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.models.Veiculos;
import com.fiap.services.VeiculosService;

import io.swagger.annotations.ApiOperation;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/veiculos")
public class VeiculosController {

	@Autowired
	private VeiculosService veiculosService;
	
	@ApiOperation(value="Recebe os dados de um veiculo, realiza o cadastro e retorna a informação")
	@PostMapping
	public Veiculos cadastrar(@RequestBody Veiculos veiculos) {
		return veiculosService.salvar(veiculos);
	}
	
	@ApiOperation(value="Retorna a lista de veiculos presentes no banco de dados")
	@GetMapping
	public List<Veiculos> listar(){
		return veiculosService.listar();
	}
	
	@ApiIgnore
	@GetMapping(value = "/{id}")
	public Veiculos exibir(@PathVariable("id") Long id) {
		Veiculos veiculos = veiculosService.buscarPorId(id).get();
		return veiculos;
	}	

}

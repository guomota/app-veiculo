package com.guomota.appveiculo.entrypoint.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guomota.appveiculo.entrypoint.model.request.VeiculoModelRequest;
import com.guomota.appveiculo.entrypoint.model.response.VeiculoModelResponse;

/**
 * Classe responsável por conter as rotas referente ao veículo
 * 
 * @author Gustavo Oliveira Mota
 * @since 12/05/2021
 */
@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

	/**
	 * Método responsável por cadastrar um veículo no banco de dados
	 * 
	 * @param {@code VeiculoModelRequest} - dados do veiculo a ser salvo
	 * 
	 * @return {@code ResponseEntity<VeiculoModelResponse>} - dados do veículo salvo
	 */
	@PostMapping
	public ResponseEntity<VeiculoModelResponse> cadastrarVeiculo(
			@RequestBody @Valid VeiculoModelRequest veiculoModelRequest) {

		return null;

	}

	/**
	 * Método responsável por buscar um veiculo cadastrado na base a partir de seu id
	 * 
	 * @param {@code Long} - id do carro
	 * 
	 * @return {@code ResponseEntity<VeiculoModelResponse>} - dados do veículo pesquisado
	 */
	@GetMapping
	public ResponseEntity<VeiculoModelResponse> buscarVeiculo(@PathVariable Long id) {

		return null;

	}
}

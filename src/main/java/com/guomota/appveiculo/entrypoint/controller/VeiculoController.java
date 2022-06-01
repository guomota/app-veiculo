package com.guomota.appveiculo.entrypoint.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guomota.appveiculo.entrypoint.model.request.VeiculoModelRequest;
import com.guomota.appveiculo.entrypoint.model.response.VeiculoModelResponse;
import com.guomota.appveiculo.entrypoint.valitdation.BuscarVeiculoValidation;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

	@PostMapping
	public ResponseEntity<VeiculoModelResponse> cadastrarVeiculo(
			@RequestBody VeiculoModelRequest veiculoModelRequest) {

		return null;
	}

	@GetMapping("/{id}")
	public ResponseEntity<String> buscarVeiculo(@PathVariable String id) {
		BuscarVeiculoValidation.validaIdVeiculo(id);
		return ResponseEntity.ok(new String("Em progresso"));
	}
}

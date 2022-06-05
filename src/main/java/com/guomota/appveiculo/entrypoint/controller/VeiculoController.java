package com.guomota.appveiculo.entrypoint.controller;

import static com.guomota.appveiculo.entrypoint.mapper.VeiculoMapper.toDomain;

import com.guomota.appveiculo.config.exception.ValidatorException;
import com.guomota.appveiculo.entrypoint.validation.CadastrarVeiculoValidation;
import com.guomota.appveiculo.usecase.CadastrarVeiculoUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guomota.appveiculo.entrypoint.model.request.VeiculoRequest;
import com.guomota.appveiculo.entrypoint.model.response.VeiculoResponse;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

	private final CadastrarVeiculoValidation cadastrarVeiculoValidation;
	private final CadastrarVeiculoUseCase cadastrarVeiculoUseCase;

	public VeiculoController(CadastrarVeiculoValidation cadastrarVeiculoValidation,
							 CadastrarVeiculoUseCase cadastrarVeiculoUseCase) {
		this.cadastrarVeiculoValidation = cadastrarVeiculoValidation;
		this.cadastrarVeiculoUseCase = cadastrarVeiculoUseCase;
	}

	@PostMapping
	public ResponseEntity<VeiculoResponse> cadastrarVeiculo(@RequestBody VeiculoRequest veiculoRequest) {

		var validationResult = cadastrarVeiculoValidation.validate(veiculoRequest);
		if(!validationResult.isValid()) {
			throw new ValidatorException(validationResult.getErrors());
		}
		var cadastrado = cadastrarVeiculoUseCase.execute(toDomain(veiculoRequest));

		return ResponseEntity.status(HttpStatus.CREATED).body(cadastrado);
	}

	@GetMapping("/{id}")
	public ResponseEntity<String> buscarVeiculo(@PathVariable String id) {

		return ResponseEntity.ok("Em progresso");
	}
}

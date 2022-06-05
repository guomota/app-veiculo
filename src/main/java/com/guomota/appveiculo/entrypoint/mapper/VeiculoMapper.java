package com.guomota.appveiculo.entrypoint.mapper;

import com.guomota.appveiculo.entrypoint.model.response.VeiculoResponse;
import org.springframework.stereotype.Component;

import com.guomota.appveiculo.entrypoint.model.request.VeiculoRequest;
import com.guomota.appveiculo.usecase.model.VeiculoDomain;

@Component
public class VeiculoMapper {

	private VeiculoMapper() {}

	public static VeiculoDomain toDomain(VeiculoRequest veiculoRequest) {
		
		VeiculoDomain veiculoDomain = new VeiculoDomain();
		veiculoDomain.setPlaca(veiculoRequest.getPlaca());
		return veiculoDomain;
	}

	public static VeiculoResponse toResponse(VeiculoDomain veiculoDomain) {
		VeiculoResponse veiculoResponse = new VeiculoResponse();
		veiculoResponse.setPlaca(veiculoDomain.getPlaca());
		return veiculoResponse;
	}
}

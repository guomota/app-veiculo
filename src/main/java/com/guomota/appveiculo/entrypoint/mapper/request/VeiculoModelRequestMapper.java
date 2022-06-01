package com.guomota.appveiculo.entrypoint.mapper.request;

import org.springframework.stereotype.Component;

import com.guomota.appveiculo.entrypoint.model.request.VeiculoModelRequest;
import com.guomota.appveiculo.usecase.model.VeiculoDomain;

@Component
public class VeiculoModelRequestMapper {

	private VeiculoModelRequestMapper() {}

	public static VeiculoDomain converterVeiculoRequestToDomain(VeiculoModelRequest veiculoModelRequest) {
		
		VeiculoDomain veiculoDomain = new VeiculoDomain();
		veiculoDomain.setMarca(veiculoModelRequest.getMarca());
		veiculoDomain.setModelo(veiculoModelRequest.getModelo());
		veiculoDomain.setPlaca(veiculoModelRequest.getPlaca());
		
		return veiculoDomain;
	}
}

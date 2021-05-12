package com.guomota.appveiculo.entrypoint.mapper.request;

import org.springframework.stereotype.Component;

import com.guomota.appveiculo.entrypoint.model.request.VeiculoModelRequest;
import com.guomota.appveiculo.usecase.model.VeiculoDomain;


/**
 * Classe responsável por converter o objeto de requesição 
 * em um objeto de domínio da aplicação
 * 
 * @author Gustavo Oliveira Mota
 * @since 12/05/2021
 */
@Component
public class VeiculoModelRequestMapper {
	
	/**
	 * Construtor privado para evitar instanciação
	 */
	private VeiculoModelRequestMapper() {}
	
	/**
	 * Método responsável por converter o objeto de requesição 
	 * em um objeto de domínio da aplicação
	 * 
	 * @param {@code VeiculoModelRequest} - dados de requesicao
	 * 
	 * @return {@code VeiculoDomain} - dados de domínio
	 */
	public static VeiculoDomain converterVeiculoRequestToDomain(VeiculoModelRequest veiculoModelRequest) {
		
		VeiculoDomain veiculoDomain = new VeiculoDomain();
		veiculoDomain.setMarca(veiculoModelRequest.getMarca());
		veiculoDomain.setModelo(veiculoModelRequest.getModelo());
		veiculoDomain.setPlaca(veiculoModelRequest.getPlaca());
		
		return veiculoDomain;
	}
}

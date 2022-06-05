package com.guomota.appveiculo.entrypoint.mapper.request;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.guomota.appveiculo.entrypoint.mapper.VeiculoMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.guomota.appveiculo.entrypoint.model.request.VeiculoRequest;
import com.guomota.appveiculo.usecase.model.VeiculoDomain;


/**
 * Classe responsável por testar a classe {@link VeiculoMapper}
 * 
 * @author Gustavo Oliveira Mota
 * @since 12/05/2021
 */
public class VeiculoMapperTest {
	
	/**
	 * Método responsável pelo teste de sucesso
	 */
	@Test
	public void testConverterVeiculoRequestToDomain() {
		
		VeiculoDomain veiculoDomain = VeiculoMapper.
                toDomain(getVeiculoModelRequest());
		
		Assertions.assertNotNull(veiculoDomain);
		assertEquals("DSQ7474", veiculoDomain.getPlaca());
	}

	/**
	 * Método responsável por mockar os dados do veículo
	 * 
	 * @return {@code VeiculoModelRequest} - dados de requisição do veículo
	 */
	private VeiculoRequest getVeiculoModelRequest() {
		
		VeiculoRequest veiculoRequest = new VeiculoRequest();
		veiculoRequest.setPlaca("DSQ7474");
		
		return veiculoRequest;
	}
}

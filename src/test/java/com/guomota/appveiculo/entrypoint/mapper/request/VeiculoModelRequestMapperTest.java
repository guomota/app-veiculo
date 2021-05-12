package com.guomota.appveiculo.entrypoint.mapper.request;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.guomota.appveiculo.entrypoint.model.request.VeiculoModelRequest;
import com.guomota.appveiculo.usecase.model.VeiculoDomain;


/**
 * Classe responsável por testar a classe {@link VeiculoModelRequestMapper}
 * 
 * @author Gustavo Oliveira Mota
 * @since 12/05/2021
 */
public class VeiculoModelRequestMapperTest {
	
	/**
	 * Método responsável pelo teste de sucesso
	 */
	@Test
	public void testConverterVeiculoRequestToDomain() {
		
		VeiculoDomain veiculoDomain = VeiculoModelRequestMapper.
				converterVeiculoRequestToDomain(getVeiculoModelRequest());
		
		assertNotNull(veiculoDomain);
		assertEquals("Honda", veiculoDomain.getMarca());
		assertEquals("Civic", veiculoDomain.getModelo());
		assertEquals("DSQ7474", veiculoDomain.getPlaca());
	}

	/**
	 * Método responsável por mockar os dados do veículo
	 * 
	 * @return {@code VeiculoModelRequest} - dados de requisição do veículo
	 */
	private VeiculoModelRequest getVeiculoModelRequest() {
		
		VeiculoModelRequest veiculoModelRequest = new VeiculoModelRequest();
		veiculoModelRequest.setMarca("Honda");
		veiculoModelRequest.setModelo("Civic");
		veiculoModelRequest.setPlaca("DSQ7474");
		
		return veiculoModelRequest;	
	}
}

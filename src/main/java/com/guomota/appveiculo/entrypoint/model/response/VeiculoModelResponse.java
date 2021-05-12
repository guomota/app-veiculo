package com.guomota.appveiculo.entrypoint.model.response;

/**
 * 
 * 
 * @author Gustavo Oliveira Mota
 * @since 12/05/2021
 *
 */
public class VeiculoModelResponse {

	private String placa;
	private String marca;
	private String modelo;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
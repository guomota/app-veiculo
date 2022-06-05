package com.guomota.appveiculo.usecase;

import com.guomota.appveiculo.entrypoint.model.response.VeiculoResponse;
import com.guomota.appveiculo.usecase.model.VeiculoDomain;

public interface CadastrarVeiculoUseCase {
    VeiculoResponse execute(VeiculoDomain veiculoDomain);
}

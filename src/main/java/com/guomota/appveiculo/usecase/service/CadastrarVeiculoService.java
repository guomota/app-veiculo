package com.guomota.appveiculo.usecase.service;

import com.guomota.appveiculo.entrypoint.mapper.VeiculoMapper;
import com.guomota.appveiculo.entrypoint.model.response.VeiculoResponse;
import com.guomota.appveiculo.usecase.CadastrarVeiculoUseCase;
import com.guomota.appveiculo.usecase.model.VeiculoDomain;
import org.springframework.stereotype.Service;

@Service
public class CadastrarVeiculoService implements CadastrarVeiculoUseCase {

    @Override
    public VeiculoResponse execute(VeiculoDomain veiculoDomain) {
        return VeiculoMapper.toResponse(veiculoDomain);
    }
}

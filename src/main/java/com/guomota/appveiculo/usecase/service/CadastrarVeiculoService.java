package com.guomota.appveiculo.usecase.service;

import com.guomota.appveiculo.entrypoint.mapper.VeiculoMapper;
import com.guomota.appveiculo.entrypoint.model.response.VeiculoResponse;
import com.guomota.appveiculo.repository.VeiculoRepository;
import com.guomota.appveiculo.usecase.CadastrarVeiculoUseCase;
import com.guomota.appveiculo.usecase.mapper.VeiculoEntityMapper;
import com.guomota.appveiculo.usecase.model.VeiculoDomain;
import org.springframework.stereotype.Service;

@Service
public class CadastrarVeiculoService implements CadastrarVeiculoUseCase {

    private final VeiculoRepository veiculoRepository;

    public CadastrarVeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    @Override
    public VeiculoResponse execute(VeiculoDomain veiculoDomain) {

        var saved = veiculoRepository.save(VeiculoEntityMapper.toEntity(veiculoDomain));
        var domain = VeiculoEntityMapper.toDomain(saved);
        return VeiculoMapper.toResponse(domain);
    }
}

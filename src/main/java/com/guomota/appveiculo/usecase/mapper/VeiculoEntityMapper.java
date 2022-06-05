package com.guomota.appveiculo.usecase.mapper;

import com.guomota.appveiculo.repository.entity.VeiculoEntity;
import com.guomota.appveiculo.usecase.model.VeiculoDomain;

public class VeiculoEntityMapper {

    public static VeiculoEntity toEntity(VeiculoDomain veiculoDomain) {
        VeiculoEntity veiculoEntity = new VeiculoEntity();
        veiculoEntity.setPlaca(veiculoDomain.getPlaca());

        return veiculoEntity;
    }

    public static VeiculoDomain toDomain(VeiculoEntity veiculoEntity) {
        VeiculoDomain veiculoDomain = new VeiculoDomain();
        veiculoDomain.setPlaca(veiculoEntity.getPlaca());

        return veiculoDomain;
    }
}

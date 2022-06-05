package com.guomota.appveiculo.entrypoint.validation;

import br.com.fluentvalidator.AbstractValidator;
import com.guomota.appveiculo.entrypoint.model.request.VeiculoRequest;
import static com.guomota.appveiculo.entrypoint.validation.constants.FieldConstant.*;
import static com.guomota.appveiculo.entrypoint.validation.constants.ValidatorConstantError.*;
import com.guomota.appveiculo.entrypoint.validation.predicate.ValidatorPredicate;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.UUID;

@Component
public class CadastrarVeiculoValidation extends AbstractValidator<VeiculoRequest>{

	@Override
	public void rules() {

		ruleFor(VeiculoRequest::getPlaca)
				.must(Objects::nonNull)
				.withMessage(PLACA_REQUIRED_ERROR)
				.withFieldName(PLACA)
				.withAttempedValue(VeiculoRequest::getPlaca)
				.withCode(UUID.randomUUID().toString())
				.critical()
				.must(ValidatorPredicate::isValidPlaca)
				.withMessage(PLACA_INVALID_ERROR)
				.withFieldName(PLACA)
				.withAttempedValue(VeiculoRequest::getPlaca)
				.withCode(UUID.randomUUID().toString())
				.critical();
	}
}

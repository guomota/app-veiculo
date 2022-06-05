package com.guomota.appveiculo.config.exception;

import br.com.fluentvalidator.context.Error;
import java.util.Collection;

public class ValidatorException extends RuntimeException {

    private final transient Collection<Error> errors;

    public ValidatorException(Collection<Error> errors) {
        super();
        this.errors = errors;
    }

    public Collection<Error> getErrors() { return errors; }
}

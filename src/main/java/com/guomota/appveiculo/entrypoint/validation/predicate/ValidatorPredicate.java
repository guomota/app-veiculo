package com.guomota.appveiculo.entrypoint.validation.predicate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorPredicate {

    public static Boolean isValidPlaca(String placa) {

        Pattern pattern = Pattern.compile("[A-Z]{3}[0-9]{1}[A-Z]{1}[0-9]{2}|[A-Z]{3}[0-9]{4}");
        Matcher mat = pattern.matcher(placa);
        return mat.matches();
    }
}

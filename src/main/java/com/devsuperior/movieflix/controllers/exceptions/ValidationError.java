package com.devsuperior.movieflix.controllers.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError{

    private List<FieldMessage> errors = new ArrayList<>();

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String message){  //método que adiciona uma FieldMessage na lista de erros
        errors.add(new FieldMessage(fieldName, message));
    }
}

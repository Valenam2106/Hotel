package com.accenture.Validaciones;

import com.accenture.model.HotelesModel;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * En esta clase estoy validando que entre los campos que son necesarios
 */
public class Validaciones implements Validator {

    @Override
    public boolean supports(Class<?> type) {
        return HotelesModel.class.isAssignableFrom(type);
    }

    @Override
    public void validate(Object o, Errors errors) {

        HotelesModel hotel = (HotelesModel) o; //Defino el objeto

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "nombre", //Defino que el nombre sea obligatorio
                "required.nombre", "El campo nombre es necesario para continuar.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "direccion",//Defino que la direccion sea obligatoria...
                "required.direccion", "El campo dirección es necesario para continuar.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "numEstrellas",
                "required.numEstrellas", "El campo número de estrellas es necesario para continuar.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "huespedes",
                "required.huespedes", "El campo huespedes promedio es necesario para continuar.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "tripAdvisor",
                "required.tripAdvisor", "El campo TripAdvisor es necesario para continuar.");

    }




}

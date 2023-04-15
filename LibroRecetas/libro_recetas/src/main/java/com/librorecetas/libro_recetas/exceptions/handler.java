package com.librorecetas.libro_recetas.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.librorecetas.libro_recetas.model.error;


@ControllerAdvice
public class handler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = { invalidDataException.class })
    public ResponseEntity<?> handleInvalidDataException(invalidDataException ex) {
        error error1 = error.builder().code(HttpStatus.BAD_REQUEST.value()).error(ex.getMessage()).build();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error1);
    }

    @ExceptionHandler(value = { notFoundException.class })
    public ResponseEntity<?> handlenotfoundException(notFoundException ex) {
        error error2 = error.builder().code(HttpStatus.NOT_FOUND.value()).error(ex.getMessage()).build();
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error2);
    }
}
